package excepciones;

public class InestableException1 extends InestableException {

	public InestableException1() {
	}

	public InestableException1(String s) {
		super(s);
	}

	public InestableException1(Throwable t) {
		super(t);
	}

	public InestableException1(String s, Throwable t) {
		super(s, t);
	}

}
