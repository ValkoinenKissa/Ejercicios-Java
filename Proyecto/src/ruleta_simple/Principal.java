package ruleta_simple;

public class Principal {
	
	public static void main(String[]args) {
		Jugador j1 = new Jugador ("Pedro",5000);
		Jugador j2 = new Jugador ("Julian",15000);
		Ruleta ruleta = new Ruleta();
		System.out.println("Jugadores, realicen su apuesta: ");
		int numJ1,numJ2,resultado;
		for(int i = 0 ; i < 10;i++) {
			numJ1=j1.elegirNumero();
			numJ2=j2.elegirNumero();
			resultado=ruleta.girarRuleta();
			if(resultado==numJ1) {
				j1.ganar();
			}
			if (resultado==numJ2) {
				j2.ganar();
			}
			System.out.println("Fin de ronda "+(i+1)+" resultado "+resultado);
			System.out.println(j1.getNombre()+" tiene "+j1.getDinero()+" euros.");
			System.out.println(j2.getNombre()+" tiene "+j2.getDinero()+" euros.");
		}
	}

}
