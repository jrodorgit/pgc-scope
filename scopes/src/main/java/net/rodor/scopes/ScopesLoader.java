package net.rodor.scopes;

import java.sql.SQLException;
import java.util.Collection;

import net.rodor.scopes.dao.ScopeBeanDAOImpl;
import net.rodor.scopes.dao.ScopeBeanDAOInt;
import net.rodor.scopes.vo.ScopeBean;

public class ScopesLoader implements ScopesLoaderInt{
	

	private  static ScopesLoader instance = new ScopesLoader();
	
	private ScopesLoader(){}
	public  static ScopesLoader getInstance(){
		return instance;
	}
	/**
	 * 
	 * @param app
	 * @param parentcode
	 * @param fecha en la que el ambito tiene que estar activo. Si null se entiende que es a fehca actual de sistema
	 * @return
	 * @throws SQLException
	 * @throws ScopesException 
	 */
	public Collection<ScopeBean> loadActiveScopes(String app, String parentcode, java.sql.Timestamp fecha) throws SQLException, ScopesException{
			
		if( app == null || "".equalsIgnoreCase(app)){
			throw new ScopesException(ScopesException.NULL_APP);
		}
		if( parentcode == null || "".equalsIgnoreCase(parentcode)){
			throw new ScopesException(ScopesException.NULL_PARENTCODE);
		}
		
		Collection<ScopeBean> ambitosActivos = null;
		try{
			ScopeBeanDAOInt cbdao = new ScopeBeanDAOImpl();
			ambitosActivos = cbdao.getAllByParent(app, parentcode, fecha);
			
		} finally{
			
		}
			
		

		return ambitosActivos;
		
	}

}
