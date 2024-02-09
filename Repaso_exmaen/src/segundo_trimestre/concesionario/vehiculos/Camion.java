package segundo_trimestre.concesionario.vehiculos;

import segundo_trimestre.concesionario.funcionalidades.Globales;
import segundo_trimestre.concesionario.interfaces.Comprable;

public class Camion extends Vehiculo implements Comprable{
	private double capacidadCarga;

	public Camion(String marca, String modelo, double precio, double capacidadCarga) {
		super(marca, modelo, precio);
		this.capacidadCarga = capacidadCarga;
	}
	
	

	public double getCapacidadCarga() {
		return capacidadCarga;
	}



	public void setCapacidadCarga(double capacidadCarga) {
		this.capacidadCarga = capacidadCarga;
	}



	@Override
	public void calcularPrecioCompra() {
		double tasaImpuesto = Globales.IMPUESTO_CAMION;
		double calcCompra = this.getPrecio() + tasaImpuesto;

		System.out.println("El precio de compra del camion: " + this.getModelo() + " es de: "
				+ calcCompra + " €");
	}

	@Override
	public void comprarVehiculo() {
		System.out.println("Se esta comprando el camion...");
		
	}

	@Override
	public void calcularImpuestos() {
		double impuestoFinal = Globales.IMPUESTO_CAMION * this.getPrecio();
		System.out.println( "El precio con impuestos del camion : " + this.getModelo() + " es de: " + impuestoFinal);
		
	}

	@Override
	public void calcularDeprecicacion(int annos) {
		double depreciacion;
		depreciacion = Globales.DEP_CAMION * this.getPrecio() * annos;
		System.out.println("La depreciacion del camion: " + this.getModelo() + " es de: " + depreciacion  + " €");
		
	}


	@Override
	public String getDetalles() {
		return super.getDetalles() + "La capacidad de carga del camion es de " + capacidadCarga;
	}
	
	

}
