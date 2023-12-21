package ruleta;

import java.util.Random;

public class Ruleta {
	private Random rand;
	
	public Ruleta() {
		rand = new Random();
	}
	
	public int girarRuleta() {
		int valorRuleta = rand.nextInt(37);
		System.out.println("El valor de la ruleta es de: " + valorRuleta);
		return valorRuleta;
	}

}
