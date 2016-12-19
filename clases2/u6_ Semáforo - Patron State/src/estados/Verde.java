package estados;

public class Verde extends Estado {

	public Estado cambiar() {
		return new AmarilloARojo();
	}

	public void decirEstado() {
		System.out.println("El estado es Verde");

	}

}
