package ruleta_simple;

import java.util.Random;

public class Ruleta {
	
	private Random rand;
	
	public Ruleta() {
		rand = new Random();		
	}
	
	public int girarRuleta() {		 
	        return rand.nextInt(37);
	}

}
