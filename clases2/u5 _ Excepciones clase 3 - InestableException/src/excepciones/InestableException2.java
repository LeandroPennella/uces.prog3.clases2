package excepciones;

public class InestableException2 extends InestableException {
	
	public InestableException2() {}

	public InestableException2(String s) {
		super(s);
	}

	public InestableException2(Throwable t) {
		super(t);
	}
	
	public InestableException2(String s, Throwable t) {
		super(s, t);
	}

}
