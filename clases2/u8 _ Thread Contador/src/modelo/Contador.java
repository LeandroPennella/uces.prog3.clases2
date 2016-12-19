package modelo;

public class Contador {

	private int entero;

	public Contador() {
		this.entero = 0;
	}

	public void incrementar() {

		int aux = this.entero;
		++aux;
		Thread.yield();
		this.entero = aux;
	}

	public void decrementar() {

		int aux = this.entero;
		--aux;
		Thread.yield();
		this.entero = aux;

	}

	public int dameEntero() {
		return this.entero;
	}

}
