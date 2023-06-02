package org.example;

public class venta {
	private double precio;
	private String destino;
	private int cliente;
	public destino venta_tiene;
	public cliente cliente_compra;
	public Vendedor venta_se_compone_de;

	public double getPrecio() {
		return this.precio;
	}

	public String getDestino() {
		return this.destino;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public int getCliente() {
		return this.cliente;
	}

	public void setCliente(int cliente) {
		this.cliente = cliente;
	}

	public void Venta(double precio, String destino, int cliente) {
		throw new UnsupportedOperationException();
	}
}