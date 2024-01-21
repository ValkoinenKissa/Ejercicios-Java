package concesionario.vehiculos;

import concesionario.Vehiculo;
import concesionario.funcionalidades.Globales;
import concesionario.interfaces.Alquilable;
import concesionario.interfaces.Comprable;

public class Coches extends Vehiculo implements Alquilable, Comprable{
	
	private boolean motorElectrico = false;
	private int numPuertas;

	public Coches(String marca, String modelo, double precio, int numPuertas, boolean motorElectrico) {
		super(marca, modelo, precio);
		this.motorElectrico = motorElectrico;
		this.numPuertas = numPuertas;
	}
	
	

	public boolean isMotor() {
		return motorElectrico;
	}



	public void setMotor(boolean motor) {
		this.motorElectrico = motor;
	}



	public int getNumPuertas() {
		return numPuertas;
	}



	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}



	@Override
	public double calcularDepreciacion(int años) {
		double tasaDepreciacion = motorElectrico ? Globales.DEP_ELECTRICO : Globales.DEP_TERMICO;
		return super.getPrecio() * años * tasaDepreciacion;
	}

	@Override
	public double calcularImpuestos() {
		double calculoImpuestos = motorElectrico ? Globales.IMPUESTO_ELECT : Globales.IMPUESTO_TERMICO;
		double precioImpuestos = super.getPrecio() * calculoImpuestos;
		return precioImpuestos;
		
	}


	@Override
	public void comprarVehiculo() {
		System.out.println("El vehiculo esta siendo vendido...");
	}
	
	@Override
	public String calcularPrecioCompra() {
		double calculoImpuestos = motorElectrico ? Globales.IMPUESTO_ELECT : Globales.IMPUESTO_TERMICO;
		double calcImpuestos = super.getPrecio() * calculoImpuestos;
	    double precioFinal = super.getPrecio() + calcImpuestos;
	    return "El precio del Coche + impuestos es de: " + Math.floor(precioFinal) + "€";
	}

	@Override
	public String calcularAlquiler() {
		double calculoImpuestos = motorElectrico ? Globales.IMPUESTO_ELECT : Globales.IMPUESTO_TERMICO;
		double calcImpuestos = super.getPrecio() * calculoImpuestos;
	    double precioAlquiler = (super.getPrecio() * Globales.ALQUILER_COCHE) + calcImpuestos;
	    return "El precio de alquiler del Coche es de: " + Math.floor(precioAlquiler / 12) +"€ /Mes";
	}


	@Override
	public void alquilarVehiculo() {
		System.out.println("El vehiculo esta siendo alquilado...");
		
	}

	

	@Override
	public String getDetalles() {
		return super.getDetalles() + " el coche incorpora " + getNumPuertas() + " puertas," + " tiene motor electrico?: " + isMotor();
	}

}
