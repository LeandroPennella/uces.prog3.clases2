package porductorconsumidor;

import java.util.ArrayList;
import java.util.List;

public class MainClasico {
	
	public static void main(String[] args) throws InterruptedException {
		ProductorConsumidor pc = new ProductorConsumidor(100, 25);
		List<ThreadProductorConsumidor> hilos = new ArrayList<ThreadProductorConsumidor>();
		
		for(int i=0; i<10;i++) {
			hilos.add(new ThreadProductorConsumidor(50, 25, pc, i%2==0));
		}
		
		for(ThreadProductorConsumidor t: hilos) {
			t.start();
		}
		for(ThreadProductorConsumidor t: hilos) {
			t.join();
		}
		System.out.println("Fin de main");
	}

}
