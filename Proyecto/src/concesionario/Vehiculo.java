package concesionario;

public abstract class Vehiculo {
	
	private String marca;
	private String modelo;
	private double precio;

	public Vehiculo(String marca, String modelo, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public abstract double calcularDepreciacion(int años);
	
	public abstract double calcularImpuestos();
	
	
	public String getDetalles() {
		return "La marca es: " + getMarca() + ", el modelo es: " + getModelo() + ", el precio es de: " + getPrecio() + "€";
	}
	
}