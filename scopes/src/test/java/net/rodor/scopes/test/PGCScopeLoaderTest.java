package net.rodor.scopes.test;

import java.sql.SQLException;
import java.util.Collection;

import junit.framework.TestCase;
import net.rodor.scopes.ScopesException;
import net.rodor.scopes.ScopesLoader;
import net.rodor.scopes.ScopesLoaderInt;
import net.rodor.scopes.vo.ScopeBean;

public class PGCScopeLoaderTest extends TestCase{

	
	public void testLoadActiveDomain(){
		
		ScopesLoaderInt scopeLoader = ScopesLoader.getInstance();
		Collection<ScopeBean> ambitos=null;
		try {
			ambitos = scopeLoader.loadActiveScopes("ALL","001" , null);
			System.out.println("Numero de valores del ambito:"+ambitos.toString());
		} catch (SQLException | ScopesException e) {
			e.printStackTrace();
		}
		assertEquals(2, ambitos.size());
		
		
	}
	

}
