package contador;

import inestable.Inestable;
import excepciones.InestableException;
import excepciones.InestableException1;
import excepciones.InestableException2;

public class Contador {

	private int llamadas;
	private int excepciones1;
	private int excepciones2;

	public void mostrar() {

		System.out.println("Cantidad de llamadas: " + this.llamadas);
		System.out.println("Cantidad de excepciones1: " + this.excepciones1);
		System.out.println("Cantidad de excepciones2: " + this.excepciones2);

	}

	public void ejecutar(Inestable[] lista) throws InestableException {
		for (int i = 0; i < lista.length; ++i) {
			try {
				lista[i].hacer();
			} catch (InestableException1 e) {
				++this.excepciones1;
			} catch (InestableException2 e) {
				++this.excepciones2;
			} finally {
				++this.llamadas;
			}

		}
	}
}
