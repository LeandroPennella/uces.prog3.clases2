package personas;

public abstract class Persona {

	protected int edad;
	protected String nombre;

	public Persona(String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;

	}

	public abstract void decirEdad();

}
