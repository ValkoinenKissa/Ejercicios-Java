package ruleta_simple;

import java.util.Scanner;

public class Jugador {
	
	private String nombre;
	private int dinero;
	
	public Jugador(String nombre,int dinero) {
		this.nombre=nombre;
		this.dinero=dinero;		
	}
	public String getNombre() {
        return nombre;
    }

    public int getDinero() {
        return dinero;
    }
    public int elegirNumero() {
    	 Scanner scanner = new Scanner(System.in);
    	 System.out.print(nombre+": ");
    	 dinero-=100;
    	 return scanner.nextInt();
    }
    public void ganar() {
    	dinero+=35000;
    	System.out.println("¡"+nombre+" acaba de ganar 35000euros!");
    }
    
}
