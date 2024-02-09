package tienda_electronica;

public abstract class Productos_electronicos {
	
	private String marca;
	private String modelo;
	private double precioProducto;
	private boolean encendidoDispositivo;
	
	public Productos_electronicos(String marca, String modelo, double precioProducto, boolean encendidoDispositivo) {
		this.marca = marca;
		this.modelo = modelo;
		this.precioProducto = precioProducto;
		this.encendidoDispositivo = encendidoDispositivo;
	}

	public boolean isEncendidoDispositivo() {
		return encendidoDispositivo;
	}

	public void setEncendidoDispositivo(boolean encendidoDispositivo) {
		this.encendidoDispositivo = encendidoDispositivo;
	}
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecioProducto() {
		return precioProducto;
	}

	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}

	public String mostarInformacion() {
		return "Marca dispositivo: " + marca + " modelo del dispositivo: " + modelo + " precio del producto: " + precioProducto;
	}
	
	public abstract void encenderDispositivo();
	
	public abstract void apagarDispositivo();

}
