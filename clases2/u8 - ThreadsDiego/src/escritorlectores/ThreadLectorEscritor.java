package escritorlectores;

public class ThreadLectorEscritor extends Thread {

	private int repeticiones;
	private int pausa;
	private UnEscriturMultiplesLectores escritorLector;
	private boolean leer;

	public ThreadLectorEscritor(int repeticiones, int pausa, UnEscriturMultiplesLectores productorConsumidor,
			boolean leer) {
		this.repeticiones = repeticiones;
		this.pausa = pausa;
		this.escritorLector = productorConsumidor;
		this.leer = leer;
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < repeticiones; i++) {
				if (leer) {
					escritorLector.leer();
				} else {
					escritorLector.escribir();
				}
				Thread.sleep(pausa);
			}
		} catch (InterruptedException e) {
			System.out.println("Thead interrumpido");
		}
		System.out.println("Fin de " + (leer ? "lector" : "escritor"));
	}
}
