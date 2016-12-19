package personas;

import java.util.StringTokenizer;

public class Persona {
	
	private String nombre;
	private int edad;
	
	public Persona(String datos){
			
		StringTokenizer st = new StringTokenizer(datos, ",");
		
		this.nombre = st.nextToken();
		this.edad = Integer.parseInt(st.nextToken());
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	
}
