package cuenta;
import java.util.*;

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
	
	
    public String toString() {
        return "Cuenta [titular=" + titular + ", cantidad=" + cantidad + "]";
    }
	
	
	public static int ingresar(double cantidad) {
		Scanner entrada = new Scanner(System.in);
		int ingresoDinero =0;
		System.out.println("Introduce la cantidad de saldo que quieres añadir a tu cuenta: ");
		
		do {
			ingresoDinero = entrada.nextInt();
			
			if(ingresoDinero < 0) {
				System.err.println("No puedes ingresar 0 euros en tu cuenta");
			}
			
		}while(ingresoDinero < 0);
		
		return ingresoDinero += cantidad;
	}
	
	
	public static int retirar(double cantidad) {
		Scanner entrada = new Scanner(System.in);
		int retiradaDinero =0;
		System.out.println("Introduce la cantidad de saldo que quieres añadir a tu cuenta: ");
		
		do {
			retiradaDinero = entrada.nextInt();
			
			if(retiradaDinero - cantidad  <= 0) {
				System.err.println("");
			}
			
		}while(retiradaDinero < 0);
		
		return retiradaDinero -= cantidad;
	}
	

}
