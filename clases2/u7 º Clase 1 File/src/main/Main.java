package main;

import java.io.File;

public class Main {

	// Recursivo -Nota "^" es el caracter de XOR (O excluyente)
	public static void mostrarContenido(String carpeta) {
		File archivo = new File(carpeta);
		if (!archivo.exists()) {
			System.out.println("El archivo no existe");
		}
		if (archivo.isDirectory()) {
			File[] archivo2 = archivo.listFiles();
			for (int i = 0; i < archivo2.length; ++i) {
				System.out.println(archivo2[i].getPath());
				if (archivo2[i].isDirectory()) {
					mostrarContenido(archivo2[i].getPath());
				}
			}
		}

	}

	public static void main(String[] args) {
		String carpeta = "C:/Users/Alumno/workspace";

		mostrarContenido(carpeta);

	}

}
