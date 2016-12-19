package excepciones;

public class MiException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/* Utilizo los constructores de la clase Exception */
	public MiException() {
	} /* Usa el super() */

	public MiException(String s) { /* Aclaro el super(String) */
		super(s);
	}

	public MiException(Throwable t) { /* lo mismo que los de arriba */
		super(t);
	}

	public MiException(String s, Throwable t) {
		super(s, t);
	}

}
