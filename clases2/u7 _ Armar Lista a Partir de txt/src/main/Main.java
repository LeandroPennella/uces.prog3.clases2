package main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import personas.Persona;

public class Main {

	public static List<Persona> armarLista(String path) {

		System.out.println("Armando lista...");

		List<Persona> listaPersonas = new ArrayList<Persona>();

		BufferedReader br = null;

		try {
			br = new BufferedReader(new FileReader(path));

			String aux = br.readLine();

			while (aux != null) {
				listaPersonas.add(new Persona(aux));
				aux = br.readLine();
			}

			System.out.println("Lista completa.");

		} catch (FileNotFoundException e) {
			System.out.println("No se encuentra: " + path);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				System.out.println("Error al cerrar: " + e.getMessage());
			}
		}

		return listaPersonas;
	}

	public static void main(String[] args) {

		String path = "Lista.txt";

		List<Persona> lista = armarLista(path);
		
		Iterator i1 = lista.iterator();
		
		System.out.println("Lista:\n");
		while(i1.hasNext()){
			System.out.println(i1.next());
		}
		System.out.println("\nFin de lista:");

	}

}
