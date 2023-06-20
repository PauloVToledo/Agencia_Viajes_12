package org.example;

import java.util.ArrayList;

public class AgenciaViajes {
	public ArrayList<destino> tiene = new ArrayList<destino>();
	private ArrayList<Persona> personas = new ArrayList<Persona>();
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();

	public void generarVenta(ArrayList<venta> ventas) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Cliente> anadirCliente(Cliente cliente) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Vendedor> anadirVendedor(Vendedor vendedor) {
		vendedores.add(vendedor);
		return vendedores;
	}

	public ArrayList<Cliente> buscarCliente(Cliente clientes) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Vendedor> buscarVendedor(Vendedor vendedores) {
		throw new UnsupportedOperationException();
	}

	public ArrayList<Vendedor> eliminarVendedor(Vendedor vendedor) {
		vendedores.remove(vendedor);
		return vendedores;
	}

	public ArrayList<Vendedor> getVendedor() {
		return vendedores;
	}

	public ArrayList<Persona> buscarPersonasMayoresDe30() {
		ArrayList<Persona> personasMayoresDe30 = new ArrayList<>();
		for (Persona persona : personas) {
			if (persona.getEdad() > 30) {
				personasMayoresDe30.add(persona);
			}
		}
		return personasMayoresDe30;
	}

	public int contarClientes() {
		return clientes.size();
	}

	public int contarVendedores() {
		return vendedores.size();
	}

	public boolean despedirVendedor(String rut) {
		for (Vendedor vendedor : vendedores) {
			if (vendedor.getRut().equals(rut)) {
				vendedores.remove(vendedor);
				return true;
			}
		}
		return false;
	}
}
