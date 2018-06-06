package net.rodor.scopes.test;

import java.sql.SQLException;

import junit.framework.TestCase;
import net.rodor.scopes.ScopesException;
import net.rodor.scopes.ScopeValidator;

public class PGCScopeValidatorTest extends TestCase {

	public void testvalidateValueInDomain(){
		try {
			assertEquals(true, ScopeValidator.validateValueInDomain("001002001", "ALL", "001002"));
			assertEquals(false, ScopeValidator.validateValueInDomain("895", "ALL", "001002"));
		} catch (SQLException | ScopesException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
