package threads;

import modelo.Contador;

public class Incrementador extends Thread {

	private Contador c;

	public Incrementador(Contador c) {
		this.c = c;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; ++i) {
			synchronized (c) {
				this.c.incrementar();
			}
		}
	}

}
