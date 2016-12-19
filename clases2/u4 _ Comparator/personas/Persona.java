package personas;

public class Persona {

	private String nombre;
	private int edad;

	public String getNombre() {return this.nombre;}

	public int getEdad() {return this.edad;}

	/* Constructor */
	public Persona(String nombre, int edad) {

		this.nombre = nombre;
		this.edad = edad;

	}

	/* Metodos */
	public void mostrar() {
		System.out.println("Me llamo: " + this.nombre + "\nTengo: " + this.edad
				+ " años\n");
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (edad != other.edad)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

}
