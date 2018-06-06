package net.rodor.scopes.vo;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ScopeBeanFactory {

	private  volatile static ScopeBeanFactory instance;
	private ScopeBeanFactory(){}
	public  static ScopeBeanFactory getInstance(){
		if(instance == null){
			synchronized (ScopeBeanFactory.class){
				if(instance == null){
					instance = new ScopeBeanFactory();
				}
			}
		}
		return instance;
	}
	public ScopeBean mapRow(ResultSet rs) throws SQLException {
		
		ScopeBean miEntity= new ScopeBean() ;
		miEntity.app = rs.getString(ScopeBean.APP_NAME);
		miEntity.parentcode = rs.getString(ScopeBean.PARENTCODE);
		miEntity.code = rs.getString(ScopeBean.CODE);
		miEntity.description = rs.getString(ScopeBean.DESCRIPTION);
		miEntity.descriptionxl = rs.getString(ScopeBean.DESCRIPTION_XL);
		miEntity.descriptionxs = rs.getString(ScopeBean.DESCRIPTION_XS);
		miEntity.startdate = rs.getTimestamp(ScopeBean.START_DATE);
		miEntity.enddate = rs.getTimestamp(ScopeBean.END_DATE);
		
		return miEntity;
	}
	
}
