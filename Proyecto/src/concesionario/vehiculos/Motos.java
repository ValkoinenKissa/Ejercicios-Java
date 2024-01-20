package concesionario.vehiculos;

import concesionario.Vehiculo;
import concesionario.funcionalidades.Globales;
import concesionario.interfaces.Alquilable;

public class Motos extends Vehiculo implements Alquilable {

	private boolean sidecar = false;
	private String  tipoTransmision;

	public Motos(String marca, String modelo, double precio, boolean sidecar, String tipoTransmision) {
		super(marca, modelo, precio);
		this.sidecar = sidecar;
		this.tipoTransmision = tipoTransmision;
	}
	
	

	public boolean isSidecar() {
		return sidecar;
	}



	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
	}



	public String getTipoTransmision() {
		return tipoTransmision;
	}



	public void setTipoTransmision(String tipoTransmision) {
		this.tipoTransmision = tipoTransmision;
	}



	@Override
	public double calcularDepreciacion(int años) {
		return super.getPrecio() * años * Globales.DEP_MOTO;
	}

	@Override
	public double calcularImpuestos() {
		double calculoImpuestos = (Globales.IMPUESTO_MOTO * super.getPrecio());
		return calculoImpuestos;
	}

	@Override
	public void alquilarVehiculo() {
		System.out.println("La moto esta siendo alquilada...");

	}

	@Override
	public String calcularAlquiler(double calculoImpuestos) {
		double precioAlquiler = (super.getPrecio() * Globales.ALQUILER_MOTO) + calculoImpuestos;
	    return "El precio de alquiler de la Moto es de: " + Math.floor(precioAlquiler / 12) +"€ /Mes";
		
	}
	



	@Override
	public String getDetalles() {
		// TODO Auto-generated method stub
		return super.getDetalles() + ", tiene la moto sidecar?: " + isSidecar() + ", la transmision de la moto es: " + getTipoTransmision();
	}

}
