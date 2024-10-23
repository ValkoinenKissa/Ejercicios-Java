package segundo_trimestre.concesionario.vehiculos;

import segundo_trimestre.concesionario.funcionalidades.Globales;
import segundo_trimestre.concesionario.interfaces.Alquilable;

public class Moto extends Vehiculo implements Alquilable{
	private String tipoTransimision;
	private boolean sidecar;

	public Moto(String marca, String modelo, double precio, boolean sidecar, String tipoTransmision) {
		super(marca, modelo, precio);
		this.tipoTransimision = tipoTransmision;
		this.sidecar = sidecar;
	}
	
	

	public String getTipoTransimision() {
		return tipoTransimision;
	}



	public void setTipoTransimision(String tipoTransimision) {
		this.tipoTransimision = tipoTransimision;
	}



	public boolean isSidecar() {
		return sidecar;
	}



	public void setSidecar(boolean sidecar) {
		this.sidecar = sidecar;
	}



	@Override
	public void calcularAlquiler() {
		double tasaImpuesto = Globales.IMPUESTO_MOTO * this.getPrecio();
		double calcAlquiler = Globales.ALQUILER_MOTO * this.getPrecio() + tasaImpuesto;

		System.out.println("El precio de alquiler del vehiculo: " + this.getModelo() + " es de: "
				+ Math.floor(calcAlquiler / 12) + " € al mes");
	}

	@Override
	public void alquilarVehiculo() {
		System.out.println("La moto esta siendo alquilada...");
		
	}

	@Override
	public String getDetalles() {
		return super.getDetalles() + " tipo transmision " + tipoTransimision + " tiene sidecar? " + sidecar;
		
	}

	@Override
	public void calcularImpuestos() {
		double impuestoFinal = Globales.IMPUESTO_MOTO * this.getPrecio();
		System.out.println( "El precio con impuestos de la moto: " + this.getModelo() + " es de: " + impuestoFinal);
		
	}

	@Override
	public void calcularDeprecicacion(int annos) {
		double depreciacion;
		depreciacion = Globales.DEP_ELECTRICO * this.getPrecio() * annos;
		System.out.println("La depreciacion de la moto: " + this.getModelo() + " es de: " + depreciacion  + " €");
		
	}

}
