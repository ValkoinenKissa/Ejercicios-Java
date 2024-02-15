package tres_en_raya;

import java.util.Scanner;

import tres_en_raya.clases.Jugador;
import tres_en_raya.clases.Simbolo;

public class Ejecutable {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce el nombre del jugador 1");
		String nombreJ1 = entrada.nextLine();
		Jugador jugador1 = new Jugador(nombreJ1, Simbolo.O);
		
		System.out.println("Introduce el nombre del jugador 2");
		String nombreJ2 = entrada.nextLine();
		Jugador jugador2 = new Jugador(nombreJ2, Simbolo.X);
		jugador1.mostarInfo();
		jugador2.mostarInfo();
		
		
	}

}
