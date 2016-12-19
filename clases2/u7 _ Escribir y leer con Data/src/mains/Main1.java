package mains;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import modelo.Deudor;

public class Main1 {
	//ESCRITOR
	
		public static void escribir(Deudor d, DataOutputStream dos) throws IOException{
			
			System.out.println("Iniciando escritura...");
			
			
			dos.writeUTF(d.getNombre());
			dos.writeInt(d.getEdad());
			dos.writeDouble(d.getSaldo());
			
			System.out.println("Escritura Finalizada");
			
		}
	
	public static void main(String[] args) throws IOException {
		
		Deudor d1 = new Deudor("Paco", 27, 2500);
		Deudor d2 = new Deudor("Roque", 32, 3700);
		Deudor d3 = new Deudor("Pepe", 15, 98000);
		Deudor d4 = new Deudor("Colo", 82, 4);
		
		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("archivo")));
		
		escribir(d1, dos);
		escribir(d2, dos);
		escribir(d3, dos);
		escribir(d4, dos);
		
		dos.flush();
		dos.close();
		
	}

}
