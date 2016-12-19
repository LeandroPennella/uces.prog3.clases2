package mains;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import modelo.Deudor;

public class Main2 {
	// LECTOR

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(
				new FileInputStream("archivo")));

		try {
			while(true){
				Deudor d = null;
				d = (Deudor)ois.readObject();
				System.out.println(d);
			}
		} catch (EOFException e) {
			System.out.println("Lectura Finalizada");
		} finally {
			ois.close();
		}
		
		
		
	}
}
