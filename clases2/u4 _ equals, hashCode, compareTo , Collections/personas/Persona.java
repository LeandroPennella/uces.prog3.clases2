package personas;

public class Persona implements Comparable<Persona> /* Generic */{

	private String nombre;
	private int edad;
	
	public int getEdad() {return this.edad;}

	public void mostrar() {

		System.out.println("Me llamo:" + this.nombre + "\n" + "Tengo "
				+ this.edad + " años\n");
	}

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public int compareTo(Persona otro) { /*
										 * Este metodo es necesario que sea
										 * sobreescrito para que se pueda
										 * implementar correctamente la interfaz
										 * retorna 0 si son iguales un numero
										 * negativo si this es menor un numero
										 * positivo si this es mayor
										 */
		if (this.edad == otro.edad) {

			return this.nombre.compareTo(otro.nombre); /*
														 * Asumiendo que el
														 * nombre no es nulo
														 */
		}
		return this.edad - otro.edad;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + edad;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass()) /*
										 * Esto es algo que se llama
										 * "Reflection" if(otro instanceof
										 * Persona) --> devuelve un booleano, es
										 * lo mismo.
										 */
			return false;
		Persona other = (Persona) obj; /* Castea a Persona */
		if (edad != other.edad)
			return false;
		if (nombre == null) { /*
							 * nombre es String, String es un objeto, puede ser
							 * null, por eso pregunta
							 */
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre)) /*
												 * El String tiene un equals
												 * implementado
												 */
			return false;
		return true;
	}

}
