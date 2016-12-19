package main;

import inestable.Estable;
import inestable.Inestable;
import inestable.Inestable1;
import inestable.Inestable2;
import contador.Contador;
import excepciones.InestableException;

public class Main {

	public static void main(String[] args) throws InestableException {

		Contador cont = new Contador();
		Inestable[] lista = new Inestable[] {

		new Estable(), new Estable(), new Estable(), new Inestable1(),
				new Inestable1(), new Inestable1(), new Inestable2(),
				new Inestable2(), new Inestable2(), new Inestable2()

		};

		cont.ejecutar(lista);
		cont.mostrar();

	}

}
