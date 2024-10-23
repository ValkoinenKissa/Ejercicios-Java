package segundo_trimestre.concesionario.vehiculos;

import segundo_trimestre.concesionario.funcionalidades.Globales;
import segundo_trimestre.concesionario.interfaces.Alquilable;
import segundo_trimestre.concesionario.interfaces.Comprable;

public class Coche extends Vehiculo implements Alquilable, Comprable{
	private int numPuertas;
	private boolean tipoMotor;
	

	public Coche(String marca, String modelo, double precio, int numPuertas, boolean tipoMotor) {
		super(marca, modelo, precio);
		this.numPuertas = numPuertas;
		this.tipoMotor = tipoMotor;
	}
	
	

	public int getNumPuertas() {
		return numPuertas;
	}



	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}



	public boolean isTipoMotor() {
		return tipoMotor;
	}



	public void setTipoMotor(boolean tipoMotor) {
		this.tipoMotor = tipoMotor;
	}


	@Override
	public void calcularPrecioCompra() {
		double tasaImpuesto = (tipoMotor) ? Globales.IMPUESTO_ELECT : Globales.IMPUESTO_TERMICO;
		double calcCompra = this.getPrecio() + tasaImpuesto;

		System.out.println("El precio de compra del vehiculo: " + this.getModelo() + " es de: "
				+ calcCompra + " €");

	}

	@Override
	public void calcularAlquiler() {
		double tasaImpuesto = (tipoMotor) ? Globales.IMPUESTO_ELECT : Globales.IMPUESTO_TERMICO;
		double calcAlquiler = Globales.ALQUILER_COCHE * this.getPrecio() + tasaImpuesto;

		System.out.println("El precio de alquiler del vehiculo: " + this.getModelo() + " es de: "
				+ Math.floor(calcAlquiler / 12) + " € al mes");

	}
	
	

	@Override
	public String getDetalles() {
		return super.getDetalles() + " Tipo motor " + tipoMotor + " num puertas " + numPuertas;
	}



	@Override
	public void calcularImpuestos() {
		double tasaImpuesto = (tipoMotor) ? Globales.IMPUESTO_ELECT : Globales.IMPUESTO_TERMICO;
		double impuestoFinal = tasaImpuesto * this.getPrecio();
		System.out.println( "El precio con impuestos del coche: " + this.getModelo() + " es de: " + impuestoFinal);
		
		}

	@Override
	public void calcularDeprecicacion(int annos) {
		double depreciacion;
		if (tipoMotor) {
			depreciacion = Globales.DEP_ELECTRICO * this.getPrecio() * annos;
			System.out.println("La depreciacion del vehiculo: " + this.getModelo() + " es de: " + depreciacion  + " €");
		} else {

			depreciacion = Globales.DEP_TERMICO * this.getPrecio() * annos;
			System.out.println("La depreciacion del vehiculo: " + this.getModelo() + " es de: " + depreciacion + " €");

		}

	}



	@Override
	public void comprarVehiculo() {
		System.out.println("Vendiendo el vehiculo....");
		
	}



	@Override
	public void alquilarVehiculo() {
		System.out.println("El vehiculo está siendo alquilado...");
		
	}

}
