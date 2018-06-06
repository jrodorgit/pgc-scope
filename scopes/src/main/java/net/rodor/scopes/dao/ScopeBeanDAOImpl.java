package net.rodor.scopes.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

import net.rodor.scopes.bbdd.DataBaseConnFactory;
import net.rodor.scopes.bbdd.PreparedStatementFactory;
import net.rodor.scopes.vo.ScopeBean;
import net.rodor.scopes.vo.ScopeBeanFactory;

public class ScopeBeanDAOImpl implements ScopeBeanDAOInt {

	
	
	public ScopeBeanDAOImpl() {
		super();
	
	}

	
	public Collection<ScopeBean> getAllByParent(String app, String parentcode,java.sql.Timestamp fecha) throws SQLException {
		
		Connection conn = DataBaseConnFactory.getInstance().getConnection();
		Collection<ScopeBean> beans = new ArrayList<ScopeBean>();
		
		PreparedStatementFactory psf = PreparedStatementFactory.getInstance();
		String sql = psf.getSQL(ScopeBeanDAOInt.SCOPES_SELECT_ALL_BY_PARENT);

		String appSel =  app;
		if(app == null){
			return beans;
		}
		String parentCodeSel = parentcode;
		if(parentcode == null){
			return beans;
		}
		java.sql.Date fechaActivo = new java.sql.Date(Calendar.getInstance().getTime().getTime());
		if(fecha != null){
			fechaActivo = new java.sql.Date(fecha.getTime());
		}
		
//		System.out.println("sql:"+sql);
//		System.out.println("appSel"+appSel);
//		System.out.println("parentCodeSel"+parentCodeSel);
//		System.out.println("fechaActivo"+fechaActivo);
		PreparedStatement ps=null;
		try {
			ps = conn.prepareStatement(sql);
			ps.setString(1, appSel);
			ps.setString(2, parentCodeSel);
			ps.setDate(3, fechaActivo);
			ps.setDate(4, fechaActivo);
			
			ResultSet rs = ps.executeQuery();
			ScopeBeanFactory fac = ScopeBeanFactory.getInstance();
			while(rs.next()){
				
				beans.add(fac.mapRow(rs));
			}
			
		}finally{
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		

		return beans;
	}
	
	
}
