package threads;

import modelo.Contador;

public class Decrementador extends Thread {

	private Contador c;

	public Decrementador(Contador c) {
		this.c = c;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; ++i) {
			synchronized (c) {
				this.c.decrementar();
			}
		}

	}

}
