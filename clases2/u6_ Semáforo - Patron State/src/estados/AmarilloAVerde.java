package estados;

public class AmarilloAVerde extends Estado {

	public Estado cambiar() {
		return new Verde();
	}

	public void decirEstado() {
		System.out.println("El estado es Amarillo");
	}
}
