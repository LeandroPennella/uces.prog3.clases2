package main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import personas.Persona;

import comparadores.ComparadorPersonas;

public class Main {

	public static void main(String[] args) {

		ComparadorPersonas cp = new ComparadorPersonas(); /*
														 * Instancio el
														 * comparator
														 */

		List<Persona> lista = new ArrayList<Persona>(); /* Creo la lista */

		lista.add(new Persona("Pepe", 23)); /*Agrego objetos a la lista*/
		lista.add(new Persona("Arjona", 72));
		lista.add(new Persona("Abuelo", 99));
		lista.add(new Persona("Abuela", 98));
		lista.add(new Persona("Lorenzo", 45));
		lista.add(new Persona("Gilberto", 38));
		lista.add(new Persona("Pepe", 24));
		lista.add(new Persona("Pepa", 23));
		lista.add(new Persona("Samuel", 45));
		
		for (int i = 0; i < lista.size(); ++i) {
			lista.get(i).mostrar();
		}
		
		System.out.println("-----------------\nOrdenando lista... \n-----------------\n");
		Collections.sort(lista, cp); /*
									 * Metodo de clase que permite ordenar la
									 * lista, está sobrecargado ya que puede ser
									 * con una lista de comparables o a partir
									 * de una lista y ademas un comparator
									 */

		/*
		 * Recorro la lista con un for, es posible porque las listas tienen
		 * índice, no necesito un iterator
		 */
		for (int i = 0; i < lista.size(); ++i) {
			lista.get(i).mostrar();
		}

	}

}
