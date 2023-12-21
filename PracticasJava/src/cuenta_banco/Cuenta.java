package cuenta_banco;

public class Cuenta {
	private String titular;
	private double cantidad;
	
	public Cuenta(String titular, double cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
		
	}
	
	public Cuenta(String titular) {
		this.titular = titular;
		
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	
	
	public double ingresar(int dineroIntro) {
		if (cantidad < 0) {
			System.out.println("No puedes ingresar un cantidad que sea menor que 0");
		}
		
		else {
			cantidad += dineroIntro;
			System.out.println("La cantidad ha sido ingresada correctamente");
		}
		return cantidad;
	}
	
	
	public double reintegro(int dineroRetirada) {
		cantidad -= dineroRetirada;
		
		if(cantidad < 0) {
			cantidad = 0;
		}
		
		else {
			System.out.println("La cantidad se ha retirado de la cuenta correctamente");
		}
		
		
		return cantidad;
		
	}
	
	
	public String toString() {
		return "El titular de la cuenta es: " + titular + " y el saldo actual de este titular es de: " + cantidad;
	}

}
