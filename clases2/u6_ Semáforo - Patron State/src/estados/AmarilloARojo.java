package estados;

public class AmarilloARojo extends Estado {

	public Estado cambiar() {
		return new Rojo();
	}

	public void decirEstado() {
		System.out.println("El estado es Amarillo");

	}
}
