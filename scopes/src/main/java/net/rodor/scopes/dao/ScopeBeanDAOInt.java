package net.rodor.scopes.dao;

import java.sql.SQLException;
import java.util.Collection;

import net.rodor.scopes.vo.ScopeBean;

public interface ScopeBeanDAOInt {

	public static final String SCOPES_SELECT_ALL_BY_PARENT = "SCOPES_SELECT_ALL_BY_PARENT";
	
	
	/**
	 * Devuelve la relacion de ambitos a partir del padre.
	 * @param app aplicacion
	 * @param parentcode codigo padre 
	 * @param fecha
	 * @return
	 */
	public Collection<ScopeBean> getAllByParent(String app, String parentcode,java.sql.Timestamp fecha) throws SQLException;
	
	
	
}
