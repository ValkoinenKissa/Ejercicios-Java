package ruleta;

public class Principal {

	public static void main(String[] args) {
		// Instanciamos dos objetos de la clase jugador
		int apuestaJ1 = 6000;
		int apuestaJ2 = 14000;
		int numElegido = 0;
		Jugador j1 = new Jugador("Alberto", apuestaJ1);
		Jugador j2 = new Jugador("Fizzos", apuestaJ2);

		System.out.println("Jugadores, realicen su apuesta: ");
		System.out.println();
		System.out.println("Es el turno de: " + j1.getNombre() + " que juega con " + j1.getDinero() + "$");
		for (int i = 0; i < 10; i++) {
			numElegido = j1.elegirNumero(apuestaJ1);
			j1.ganar(numElegido, apuestaJ1);
			apuestaJ1 = apuestaJ1 - 100;


		}
		System.out.println("\nEL jugador " + j2.getNombre() + " tiene en su cuenta: " + apuestaJ2 + "$");
		
		System.out.println();
		System.out.println("Es el turno de: " + j2.getNombre() + " que juega con " + j2.getDinero() + "$");
		for (int i = 0; i < 10; i++) {
			numElegido = j2.elegirNumero(apuestaJ1);
			j2.ganar(numElegido, apuestaJ1);
			apuestaJ2 = apuestaJ2 - 100;


		}
		System.out.println("\nEL jugador " + j2.getNombre() + " tiene en su cuenta: " + apuestaJ2 + "$");
	}

}
