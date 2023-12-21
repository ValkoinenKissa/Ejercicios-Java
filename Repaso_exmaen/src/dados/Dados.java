package dados;
import java.util.*;
public class Dados {
	private int rangoSuperior;
	private int rangoInferior;
	Random aleatorio = new Random();
	
	public int tirarDado() {
		int valorDado = aleatorio.nextInt(6);
		return valorDado;
		
	}
	
	
	public static void main(String[]args) {
		Dados dado1 = new Dados();
		Dados dado2 = new Dados();
		int contador = 0;
		for(int i =0; i<3; i++) {
			dado1.tirarDado();
			dado1.tirarDado();

		}

		
	}
	

}
