package mains;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

import modelo.Deudor;

public class Main2 {
	// LECTOR

	public static void main(String[] args) throws IOException {

		DataInputStream dis = new DataInputStream(new BufferedInputStream(
				new FileInputStream("archivo")));

		try {
			while(true){
				Deudor d = null;
				d = new Deudor(dis.readUTF(), dis.readInt(), dis.readDouble());
				System.out.println(d);
			}
		} catch (EOFException e) {
			System.out.println("Lectura Finalizada");
		} finally {
			dis.close();
		}
		
		
		
	}
}
