package main;

import java.util.ArrayList;
import java.util.List;

import modelo.Hilo;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		// Creo la lista
		List<Hilo> lista = new ArrayList<Hilo>();

		// Instancio los hilos dentro de la lista
		for (int i = 1; i < 11; ++i)
			lista.add(new Hilo(Thread.currentThread(), i));

		// Corro los hilos
		for (Hilo hilo : lista) {
			hilo.start();
		}
		// Espero medio segundo para que se lancen todos los hilos asi despues
		// funciona bien el interrupt, ya que si el interrupt se ejecuta antes
		// de que empiece el thread, este no tiene a que interrumpir y por ende
		// no funciona
		Thread.currentThread().sleep(500);

		for (Hilo hilo : lista) {
			hilo.interrupt();
		}

		// Espero a cada hilo para que el main se termine de ejecutar al final
		/*
		 * for (Hilo hilo : lista) { hilo.join(); }
		 */
		System.out.println("Termino el main");

	}

}
