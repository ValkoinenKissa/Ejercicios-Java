package tienda_electronica.dispositivos;

import tienda_electronica.Productos_electronicos;

public class Consola extends Productos_electronicos {

	private String color;
	private int resolucion;

	public Consola(String marca, String modelo, double precioProducto, boolean encendidoDispositivo, String color,
			int resolucion) {
		super(marca, modelo, precioProducto, encendidoDispositivo);
		this.color = color;
		this.resolucion = resolucion;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	@Override
	public String mostarInformacion() {
		return super.mostarInformacion() + " el color de la consola es: " + color + " la resolucion soportada es: "
				+ resolucion;
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
