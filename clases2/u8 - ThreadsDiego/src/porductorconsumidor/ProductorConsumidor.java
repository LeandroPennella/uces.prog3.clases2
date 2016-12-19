package porductorconsumidor;

import java.util.LinkedList;
import java.util.Queue;

public class ProductorConsumidor  {
	private Queue<String> cola = new LinkedList<String>();
	private static final int MAXIMO_TAMANIO = 10;
	private int demoraConsumir;
	private int demoraProducir;

	public ProductorConsumidor(int demoraConsumir, int demoraProducir) {
		this.demoraConsumir = demoraConsumir;
		this.demoraProducir = demoraProducir;
	}

	public synchronized void consumir() throws InterruptedException {
		while (cola.isEmpty()) {
			System.out.println("Consumidor esperando");
			wait();
		}
		String elemento = cola.remove();
		Thread.sleep(demoraConsumir);
		notifyAll();
		System.out.println("Conumido: " + elemento + " - Quedan " + cola.size());
	}

	public synchronized void producir() throws InterruptedException {
		while (cola.size() >= MAXIMO_TAMANIO) {
			System.out.println("Productor esperando");
			wait();
		}
		String elemento = "ABC";
		cola.add(elemento);
		Thread.sleep(demoraProducir);
		notifyAll();
		System.out.println("Producido: " + elemento + " - Quedan " + cola.size());
	}

}
