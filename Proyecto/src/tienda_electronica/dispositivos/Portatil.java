package tienda_electronica.dispositivos;

import tienda_electronica.Productos_electronicos;

public class Portatil extends Productos_electronicos{
	
	private int capacidadAlmacenamiento;
	private String procesador;

	public Portatil(String marca, String modelo, double precioProducto, boolean encendidoDispositivo, int capacidadAlmacenamiento, String procesador) {
		super(marca, modelo, precioProducto, encendidoDispositivo);
		this.capacidadAlmacenamiento = capacidadAlmacenamiento;
		this.procesador = procesador;

	}

	public int getCapacidadAlmacenamiento() {
		return capacidadAlmacenamiento;
	}

	public void setCapacidadAlmacenamiento(int capacidadAlmacenamiento) {
		this.capacidadAlmacenamiento = capacidadAlmacenamiento;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	@Override
	public String mostarInformacion() {
		return super.mostarInformacion() + " la capacidad de almacenamiento del portatil es: " + capacidadAlmacenamiento + " el procesador del portatil es: " + procesador;
	}
	
	@Override
	public void encenderDispositivo() {
		this.setEncendidoDispositivo(true);
		System.out.println("El dispositivo " + this.getModelo() + " ha sido encendido...");

	}

	@Override
	public void apagarDispositivo() {
		this.setEncendidoDispositivo(false);
		System.out.println("El dispositivo " + this.getModelo() + " ha sido apagado...");

	}
	
	

}
