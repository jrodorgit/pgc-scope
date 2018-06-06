package net.rodor.scopes.test;

import java.sql.SQLException;
import java.util.Collection;

import junit.framework.TestCase;
import net.rodor.scopes.ScopesCache;
import net.rodor.scopes.ScopesException;
import net.rodor.scopes.vo.ScopeBean;

public class PGCScopeCacheTest extends TestCase {
	public void testLoadActiveDomain(){
		
		ScopesCache sc = ScopesCache.getInstance();
		
		Collection<ScopeBean> ambitos=null;
		
		try {
			ambitos = sc.getAmbitosValues("ALL","001");
		} catch (SQLException | ScopesException e) {
			e.printStackTrace();
		}
		
		assertEquals(2, ambitos.size());
		System.out.println("Numero de valores del ambito:"+ambitos.size());
		
		// lo repetimos para ver que el ambito se ha cacheado.
		try {
			ambitos = sc.getAmbitosValues("ALL","001");
		} catch (SQLException | ScopesException e) {
			e.printStackTrace();
		}
		
		assertEquals(2, ambitos.size());
		System.out.println("Numero de valores del ambito:"+ambitos.size());
		
		// obtenemos otro dominio para ver que se carga CONCEPTOS FACT
		try {
			ambitos = sc.getAmbitosValues("ALL","001002");
		} catch (SQLException | ScopesException e) {
			e.printStackTrace();
		}
		
		assertEquals(2, ambitos.size());
		System.out.println("Numero de valores del ambito:"+ambitos.size());
	}
}
