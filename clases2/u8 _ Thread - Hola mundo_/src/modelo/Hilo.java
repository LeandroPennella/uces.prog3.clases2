package modelo;

public class Hilo extends Thread {

	// Le paso el thread main para poder joinear con el main y que lo espere
	// antes de hacer nada
	private Thread main;
	private int numero;

	public Hilo(Thread main, int numero) {
		// this.main = Thread.currentThread(); //Cuando se construye esta
		// ejecutando el main, con lo cual puedo no pasarlo por parametro y usar
		// el current
		this.main = main;
		this.numero = numero;
	}

	@Override
	public void run() {
		try {
			
			this.main.join();
			for (int i = 0; i < 10; ++i) {
				System.out.println("Hola mundo, soy el thread numero: "
						+ this.numero);
				Thread.yield();
			}

			System.out.println("Fin del hilo: " + this.numero);
			
		} catch (InterruptedException e) {
			System.out.println("El hilo: " + this.numero + " fue interrumpido");
		}
		
		
		
	}

}
