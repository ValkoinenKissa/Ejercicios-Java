package concesionario.vehiculos;

import concesionario.Vehiculo;
import concesionario.funcionalidades.Globales;
import concesionario.interfaces.Comprable;

public class Camiones extends Vehiculo implements Comprable{
	
	private int capacidadCarga;
	
	public Camiones(String marca, String modelo, double precio, int capacidadCarga) {
		super(marca, modelo, precio);
		this.capacidadCarga = capacidadCarga;
	}

	public int getCapacidadCarga() {
		return capacidadCarga;
	}

	public void setCapacidadCarga(int capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}

	@Override
	public void comprarVehiculo() {
		System.out.println("El camión esta siendo adquirido...");
		
	}
	
	@Override
	public double calcularImpuestos() {
		double calculoImpuestos = (Globales.IMPUESTO_CAMION * super.getPrecio());
		return calculoImpuestos;
	}

	@Override
	public String calcularPrecioCompra(double calculoImpuestos) {
		double precioCompra = super.getPrecio() + calculoImpuestos;
		return "El precio de compra del camión es de: " + Math.floor(precioCompra) + "€";
	}

	@Override
	public double calcularDepreciacion(int años) {
		return super.getPrecio()* años * Globales.DEP_CAMION;
	}

	@Override
	public String getDetalles() {
		// TODO Auto-generated method stub
		return super.getDetalles() + ", y la capacidad de carga del camión es de: " + capacidadCarga + "T";
	}
	
	


}
