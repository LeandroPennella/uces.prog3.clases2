package porductorconsumidor;

public class ThreadProductorConsumidor extends Thread {

	private int repeticiones;
	private int pausa;
	private ProductorConsumidor productorConsumidor;
	private boolean consumir;

	public ThreadProductorConsumidor(int repeticiones, int pausa, ProductorConsumidor productorConsumidor,
			boolean consumir) {
		this.repeticiones = repeticiones;
		this.pausa = pausa;
		this.productorConsumidor = productorConsumidor;
		this.consumir = consumir;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < repeticiones; i++) {
				if (consumir) {
					productorConsumidor.consumir();
				} else {
					productorConsumidor.producir();
				}
				Thread.sleep(pausa);
			}
		} catch (InterruptedException e) {
			System.out.println("Thead interrumpido");
		}
	}
}
