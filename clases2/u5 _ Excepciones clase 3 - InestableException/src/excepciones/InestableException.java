package excepciones;

public class InestableException extends Exception {

	public InestableException() {
	}

	public InestableException(String s) {
		super(s);
	}

	public InestableException(Throwable t) {
		super(t);
	}

	public InestableException(String s, Throwable t) {
		super(s, t);
	}

}
