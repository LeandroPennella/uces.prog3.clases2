package personas;

public class Hombre extends Persona {

	public Hombre(String nombre, int edad) {

		super(nombre, edad);

	}

	@Override
	public void decirEdad() {

		System.out.println("Tengo " + this.edad + " años");

	}

}
