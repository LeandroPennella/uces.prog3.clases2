package estados;

public class Rojo extends Estado {

	public Estado cambiar() {
		return new AmarilloAVerde();
	}

	public void decirEstado() {
		System.out.println("El estado es Rojo");

	}
}
