package personas;

public class Mujer extends Persona {

	public Mujer(String nombre, int edad) {

		super(nombre, edad);

	}

	@Override
	public void decirEdad() {

		System.out.println("Tengo " + (this.edad - 3) + " años");

	}

}
