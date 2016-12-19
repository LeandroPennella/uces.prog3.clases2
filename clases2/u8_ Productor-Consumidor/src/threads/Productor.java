package threads;

import java.util.Random;

import modelo.Recurso;

public class Productor extends Thread {
	
	private Recurso contador;
	
	public Productor(Recurso recurso) {
		this.contador = recurso;
	}
	
	public String producir() {
		return "Mensaje " + contador.getCantidad();
	}
	
	public void run() {
		Random rnd = new Random();
		try {
			while (true){
				synchronized(contador) {
					if(contador.getCantidad() < contador.getMensajes().length){
						contador.notify();
						System.out.println(contador.getMensajes()[contador.getCantidad()] = producir());
						contador.setCantidad(contador.getCantidad() + 1);
						//System.out.println("Producido");
					} else {
						contador.wait();
					}
				}
				sleep(rnd.nextInt(150)+100);
			}
		} catch (InterruptedException e) {
			System.out.println("El productor fue interrumpido");
		}
	}
}

