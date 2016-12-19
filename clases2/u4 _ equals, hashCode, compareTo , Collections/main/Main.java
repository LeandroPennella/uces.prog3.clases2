package main;

import personas.Persona;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Persona p1 = new Persona("Richardo", 39);
		Persona p2 = new Persona("Richardo", 42);
		Persona p3 = new Persona("Pepe", 27);

		/*
		 * EJERCICIO DE EQUALS Y HASHCODE
		 * 
		 * if(p1.equals(p2)) { System.out.println("Si son equivalentes"); }else
		 * { System.out.println("No son equivalentes"); }
		 * 
		 * String resultado = (p1.equals(p3)? "Si son equivalentes" :
		 * "No son equivalentes"); System.out.println(resultado);
		 * 
		 * System.out.println(p2.equals(p1)? "SI":"NO");
		 * 
		 * System.out.println(p1.hashCode()); System.out.println(p2.hashCode());
		 */

		/* EJERCICIO DE COLLECTIONS */
		// Collection lista = new ArrayList<Persona>(); /*Arma una lista*/
		Collection lista = new TreeSet<Persona>(); /* usa un set ordenado */

		/* Agrego las personas a la lista */
		lista.add(p1);
		lista.add(p2);
		lista.add(p3);
		lista.add(new Persona("Almuerzo", 99));
		lista.add(new Persona("Cristo", 33));

		Iterator<Persona> i = lista.iterator();
		/* Recorro la lista por primera vez */
		while (i.hasNext()) {
			Persona x = i.next();
			x.mostrar();
		}

		/* Le indico a la lista que elemento debe borrar */
		lista.remove(new Persona("Almuerzo", 99));

		System.out.println("Segundo Recorrido:\n--------------------\n");
		/* Recorro por segunda vez para confirmar que se borro */
		Iterator<Persona> i2 = lista.iterator();

		while (i2.hasNext()) {
			Persona x = i2.next();
			x.mostrar();
		}
		
		/*Implementacion del Equals en String - tema aparte*/
		System.out.println("Juan" == "Juan");
		System.out.println(new String("Juan") == new String ("Juan"));
		
	}
}
