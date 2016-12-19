package threads;

import java.util.Random;

import modelo.Recurso;

public class Consumidor extends Thread{
	
	private Recurso contador;
	
	public Consumidor(Recurso recurso) {
		this.contador = recurso;
	}
	
	public void run() {
		Random rnd = new Random();
		try {
			while (true){
				synchronized(contador) {
					if(contador.getCantidad() > 0){
						contador.notify();
						contador.setCantidad(contador.getCantidad() - 1);
						System.out.println("Consumido");
					} else {
						contador.wait();
					}
				}
				sleep(rnd.nextInt(150)+100);
			}
		} catch (InterruptedException e) {
			System.out.println("El consumidor fue interrumpido");
		}
	}
}
