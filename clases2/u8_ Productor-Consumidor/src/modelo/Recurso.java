package modelo;

public class Recurso {
	
	private String[] mensajes;
	private int cantidad;
	
	public void setCantidad(int nuevaCantidad) {this.cantidad = nuevaCantidad;}
	
	public int getCantidad() {return this.cantidad;}
	
	public String[] getMensajes() {return this.mensajes;}
	
	public Recurso(int cantidad) {
		this.mensajes = new String[cantidad];
		this.cantidad = 0;
	}
	
}
