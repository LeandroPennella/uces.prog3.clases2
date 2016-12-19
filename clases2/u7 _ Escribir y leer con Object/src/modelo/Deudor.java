package modelo;

import java.io.Serializable;

public class Deudor implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private int edad;
	private double saldo;
	
	

	@Override
	public String toString() {
		return "Deudor [nombre=" + nombre + ", edad=" + edad + ", saldo="
				+ saldo + "]";
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public Deudor(String nombre, int edad, double saldo) {

		this.nombre = nombre;
		this.edad = edad;
		this.saldo = saldo;

	}

}
