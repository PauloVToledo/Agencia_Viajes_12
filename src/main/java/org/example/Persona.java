package org.example;
public abstract class Persona {
	protected String nombre;
	protected int edad;

	public String getNombre() {
		return this.nombre;
	}

	public int getEdad() {
		return this.edad;
	}

	public Persona() {
		throw new UnsupportedOperationException();
	}

	public abstract String contarDinero();
}