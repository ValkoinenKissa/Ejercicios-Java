package ruleta;

import java.util.Scanner;
public class Jugador {
	
	private String nombre = " ";
	private int dinero =0;
	
	
	public Jugador(String nombre,int dinero) {
		this.nombre = nombre;
		this.dinero = dinero;
	}
	
	public String getNombre() {
		return nombre;
		
    }

    public int getDinero() {
    	return dinero;
    }
    
    public int elegirNumero(int dinero) {
    	boolean stop;
    	int numero;
    	Scanner entrada = new Scanner(System.in);
    	do {
    	stop = false;
    	System.out.println("Jugador, introduce un numero del 1 al 36 al que quieras apostar, el coste de la apuesta es de "
    			+ " 100 euros: ");
    	numero = entrada.nextInt();
    	stop = numero > 36 || numero < 1;
    	
    	if(stop) {
    		System.err.println("El numero que acabas de apostar no esta dentro del rango de valores de la ruleta, intentalo de nuevo: ");
    	}
    	
    	}while(stop);
    	
    	
    	return numero;
    	
    }
    public int ganar(int numero, int dinero) {
    	int premio=0;
    	Ruleta random = new Ruleta();
    	int numRuleta = random.girarRuleta();
    	if(numero == numRuleta) {
    		dinero += 35000;
    		System.out.println();
    		System.out.println("Felicidades!! la ruleta ha caido en el numero apostado, has ganado: " + premio + " euros");
    		return premio;
    	}
    	
    	else {
    		System.out.println("No has ganado nada, sigue jugando para ganar algo");
    		System.out.println();
    	}
    	
    	return 0;
    }
    
}
