package escritorlectores;

import java.util.ArrayList;
import java.util.List;

import porductorconsumidor.ProductorConsumidor;
import porductorconsumidor.ThreadProductorConsumidor;

public class MainMultiplesConsumidores {
	
	public static void main(String[] args) throws InterruptedException {
		UnEscriturMultiplesLectores le = new UnEscriturMultiplesLectores(10, 20);
		List<ThreadLectorEscritor> hilos = new ArrayList<ThreadLectorEscritor>();
		
		hilos.add(new ThreadLectorEscritor(30, 10, le, true));
		hilos.add(new ThreadLectorEscritor(30, 10, le, true));
		hilos.add(new ThreadLectorEscritor(30, 10, le, true));
		hilos.add(new ThreadLectorEscritor(20, 50, le, false));
		
		for(ThreadLectorEscritor t: hilos) {
			t.start();
		}
		for(ThreadLectorEscritor t: hilos) {
			t.join();
		}
		System.out.println("Fin de main");
	}

}
