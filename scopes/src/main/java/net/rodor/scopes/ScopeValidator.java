package net.rodor.scopes;

import java.sql.SQLException;
import java.util.Collection;

import net.rodor.scopes.vo.ScopeBean;

public class ScopeValidator {
	

	/**
	 * Valida que un ambito forma parte de los ambitos hijos
	 * @param codigo del ambito a validar
	 * @param app aplicacion a la que pertenece el ambito
	 * @param parentCode codigo del ambito padre
	 * @return true si el elemento forma parte del ambito.
	 * @throws SQLException
	 * @throws ScopesException si app, codigo o parentcode son nulos.
	 */
	public static boolean validateValueInDomain(String codigo, String app, String parentCode) throws SQLException, ScopesException{
	
		
		boolean resul = false;
		if( parentCode == null || "".equalsIgnoreCase(parentCode)){
			throw new ScopesException(ScopesException.NULL_PARENTCODE);
		}
		if( codigo == null || "".equalsIgnoreCase(codigo)){
			throw new ScopesException(ScopesException.NULL_CODE);
		}
		if( app == null || "".equalsIgnoreCase(app)){
			throw new ScopesException(ScopesException.NULL_APP);
		}
		
		ScopesCache sc = ScopesCache.getInstance();
		Collection<ScopeBean> ambitos = sc.getAmbitosValues(app, parentCode);
		for(ScopeBean sb: ambitos){
			if(codigo.compareToIgnoreCase(sb.code) == 0){
					return true;
			}
		}
		return resul;
	}
}
