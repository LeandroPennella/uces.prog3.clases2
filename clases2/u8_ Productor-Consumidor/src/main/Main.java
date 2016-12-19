package main;

import modelo.Recurso;
import threads.Consumidor;
import threads.Productor;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Recurso recu = new Recurso(4);
		
		Productor prod = new Productor(recu);
		Consumidor cons = new Consumidor(recu);
		
		prod.start();
		cons.start();
		
		//prod.join();
		//cons.join();
		
		Thread.sleep(5000);
		
		prod.interrupt();
		cons.interrupt();
		
		System.out.println("Findo del mainolo!");
		
	}

}
