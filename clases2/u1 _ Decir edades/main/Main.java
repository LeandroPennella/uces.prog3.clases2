package main;

import personas.*;

public class Main {

	public static void main(String[] args) {

		Hombre h = new Hombre("Roberto", 24);
		Mujer m = new Mujer("Romina", 25);

		h.decirEdad();
		m.decirEdad();

	}

}
