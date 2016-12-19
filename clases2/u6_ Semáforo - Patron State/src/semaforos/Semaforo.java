package semaforos;

import estados.Estado;
import estados.Verde;

public class Semaforo {

	private Estado estado;

	public Semaforo() {
		this.estado = new Verde();
	}

	public String cambiar() {
		this.estado.decirEstado();
		this.estado = this.estado.cambiar();
		return "";
	}
}
