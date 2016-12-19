package mains;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import modelo.Deudor;

public class Main1 {
	//ESCRITOR
	
		public static void escribir(Deudor d, ObjectOutputStream oos) throws IOException{
			
			System.out.println("Iniciando escritura...");
			
			oos.writeObject(d);
			
			System.out.println("Escritura Finalizada");
			
		}
	
	public static void main(String[] args) throws IOException {
		
		Deudor d1 = new Deudor("Paco", 27, 2500);
		Deudor d2 = new Deudor("Roque", 32, 3700);
		Deudor d3 = new Deudor("Pepe", 15, 98000);
		Deudor d4 = new Deudor("Colo", 82, 4);
		
		ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("archivo")));
		
		escribir(d1, oos);
		escribir(d2, oos);
		escribir(d3, oos);
		escribir(d4, oos);
		
		oos.flush();
		oos.close();
		
	}

}
