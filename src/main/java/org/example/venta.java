package org.example;
public class venta extends Vendedor {
	private int precio;
	private String destino;
	private String cliente;

	private String agenteViaje;

	public venta(String eliminarComillas, int parseInt) {

	}

    public double getPrecio() {
		return this.precio;
	}

	public String getDestino() {
		return this.destino;
	}

	public void Venta(int precio, String destino, String cliente, String agenteViaje) {

		this.precio=precio;
		this.destino=destino;
		this.cliente=cliente;
		this.agenteViaje=agenteViaje;

	}
}