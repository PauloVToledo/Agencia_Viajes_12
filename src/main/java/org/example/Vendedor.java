package org.example;
public class Vendedor extends Persona {

	public void vender() {
		throw new UnsupportedOperationException();
	}

	public Vendedor() {
		super();
		throw new UnsupportedOperationException();
	}

	public String contarDinero() {
		throw new UnsupportedOperationException();
	}

	public venta[] getVenta() {
		return new venta[0];
	}
}