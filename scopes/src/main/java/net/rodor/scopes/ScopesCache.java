package net.rodor.scopes;

import java.sql.SQLException;
import java.util.Collection;
import java.util.Hashtable;

import net.rodor.scopes.vo.ScopeBean;

public class ScopesCache {

	private  static ScopesCache instance = new ScopesCache();
	private  ScopesCache() {}
	
	public  static ScopesCache getInstance(){
		return instance;
	}
	private static Hashtable<String,Collection<ScopeBean>> ambitos = new Hashtable<String,Collection<ScopeBean>>();
	
	/**
	 * Devuelve la relacion de ambitos activos de la aplicacion y padre 
	 * @param app Nombre de la Aplicacion
	 * @param parentcode codigo del ambito padre
	 * @return Collection<DomainBean> valores del dominio
	 * @throws SQLException
	 * @throws ScopesException  si app o domian son nulos o cadena vacia
	 */
	public Collection<ScopeBean> getAmbitosValues(String app, String parentcode) throws SQLException, ScopesException{
		
		String domainKey  = app+"/"+parentcode;
		
		if( app == null || "".equalsIgnoreCase(app)){
			throw new ScopesException(ScopesException.NULL_APP);
		}
		
		if( parentcode == null || "".equalsIgnoreCase(parentcode)){
			throw new ScopesException(ScopesException.NULL_PARENTCODE);
		}

		Collection<ScopeBean> ambito = null;
		if( ambitos.containsKey(domainKey)){
			System.out.println("obteniendo valores desde cache...");
			ambito = ambitos.get(domainKey);
			
			
		}else{
			System.out.println("cargando valores...");
			ScopesLoaderInt domainLoader = ScopesLoader.getInstance();
			ambito = domainLoader.loadActiveScopes(app, parentcode, null);
			ambitos.put(domainKey, ambito);

		}
		
		return ambito;
	}
	
	public void resetAmbitosCache(){
		ambitos = null;
		ambitos = new Hashtable<String,Collection<ScopeBean>>();
	}
	
}
