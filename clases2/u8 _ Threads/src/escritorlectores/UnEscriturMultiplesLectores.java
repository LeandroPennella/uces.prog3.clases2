package escritorlectores;

public class UnEscriturMultiplesLectores {
	private int contador;
	private int demoraLector;
	private int demoraEscritor;
	private Object semarofoEscritor = new Object();
	private Object semaforoLector = new Object();
	private int cantidadLectores;
	private boolean hayEscritor;

	public UnEscriturMultiplesLectores(int demoraLector, int demoraEscritor) {
		this.demoraLector = demoraLector;
		this.demoraEscritor = demoraEscritor;
	}

	public void leer() throws InterruptedException {
		synchronized (semarofoEscritor) {
			while (hayEscritor) {
				semarofoEscritor.wait();
			}
			synchronized (semaforoLector) {
				++cantidadLectores;
			}
		}
		int valor = contador;
		Thread.sleep(demoraLector);
		System.out.println("Leido: " + valor + " - Lectores: " + cantidadLectores);
		synchronized (semaforoLector) {
			--cantidadLectores;
			semaforoLector.notify();
		}

	}

	public void escribir() throws InterruptedException {
		synchronized (semarofoEscritor) {
			hayEscritor = true;
		}
		synchronized (semaforoLector) {
			while (cantidadLectores > 0) {
				semaforoLector.wait();
			}
			++contador;
			Thread.sleep(demoraEscritor);
			System.out.println("Escrito: " + contador + " - Lectores: " + cantidadLectores);
		}
		synchronized (semarofoEscritor) {
			hayEscritor = false;
			semarofoEscritor.notifyAll();
		}
	}
}
