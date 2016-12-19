package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Main {

	public static void main(String[] args) throws IOException {
		// Instancio mis path de origen y destino
		File origen = new File(
				"C:\\Users\\Alumno\\Desktop\\Prueba\\holaMundo.rar");
		File destino = new File(
				"C:\\Users\\Alumno\\Desktop\\Prueba\\chauMundo.rar");
		// instancio mis input y output
		InputStream lector = new FileInputStream(origen);
		OutputStream escritor = new FileOutputStream(destino);
		// Leo el primer byte
		int caracter = lector.read();
		// Sigo leyendo mientras no lea un -1 que determina el final del flujo
		// de datos
		while (caracter != -1) {
			escritor.write(caracter);
			caracter = lector.read();
		}

		// cierro el lector y flusheo y cierro el escritor
		lector.close();
		escritor.flush();
		escritor.close();

	}

}
