package net.rodor.scopes;

import java.sql.SQLException;
import java.util.Collection;

import net.rodor.scopes.vo.ScopeBean;

public interface ScopesLoaderInt {

	/**
	 * Devuelve la relacion de ambitos activos de una aplicacion a partir de su padre para una fecha 
	 * Si la fecha es nula devuelve los activos a fecha actual del sistema
	 * @param app Nombre de la Aplicacion
	 * @param parentcode codigo del ambito padre
	 * @param fecha en la que el ambito tiene que estar activo
	 * @return
	 * @throws SQLException
	 * @throws ScopesException  si app o parentcode son nulos o cadena vacia
	 */
	public Collection<ScopeBean> loadActiveScopes(String app, String parentcode, java.sql.Timestamp fecha) throws SQLException, ScopesException;
	
	
	
}
