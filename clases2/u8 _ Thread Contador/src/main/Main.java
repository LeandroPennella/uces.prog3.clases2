package main;

import java.util.ArrayList;
import java.util.List;

import modelo.Contador;
import threads.Decrementador;
import threads.Incrementador;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		Contador c = new Contador();
		List<Thread> lista = new ArrayList<Thread>();
		
		for(int i = 0; i < 5 ; ++i){
			lista.add(new Incrementador(c));
		}
		
		for(int i = 0; i < 5 ; ++i){
			lista.add(new Decrementador(c));
		}
		
		for (Thread thread : lista) {
			thread.start();
		}
		
		for (Thread thread : lista) {
			thread.join();
		}
		
		System.out.println(c.dameEntero());

	}

}
