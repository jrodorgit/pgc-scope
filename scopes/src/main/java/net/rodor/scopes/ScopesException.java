package net.rodor.scopes;

public class ScopesException extends Exception{

	
	private static final long serialVersionUID = -2782703174668106355L;
	
	public static final String NULL_PARENTCODE = "El codigo del ambito padre no puede ser nulo o cadena vacia";
	public static final String NULL_CODE = "El codigo del ambitono puede ser nulo o cadena vacia";
	public static final String NULL_APP = "La aplicacion no puede ser nulo o cadena vacia";
	
	public ScopesException(String message) {
		super(message);
	}

	
}
