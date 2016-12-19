package comparadores;

import java.util.Comparator;

import personas.Persona;

public class ComparadorPersonas implements Comparator<Persona> {

	/*
	 * Implemento el método para definir el criterio con el que va a comparar a
	 * las personas
	 */
	public int compare(Persona p1, Persona p2) {

		if (p1.getEdad() == p2.getEdad()) {
			return p1.getNombre().compareTo(p2.getNombre());
		}
		return -p1.getEdad() + p2.getEdad();
		
	}

}
