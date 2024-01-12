package bicicleta;

import bicicleta.bicicletas.*;
import bicicleta.otros_vehiculos.Coche;

public class Uso_bicicleta {

	public static void main(String[] args) {
		
		// Constructores bicicletas
		
		Bicicleta miBicicleta = new Bicicleta(15, 2, 3);
		Bicicleta tuBicicleta = new Bicicleta(15, 2, 3);
		BicicletaMontaña biciMontaña1 = new BicicletaMontaña(10, 4, 3);
		BicicletaTandem biciTandem1 = new BicicletaTandem(10, 6, 2);
		BicicletaTandem biciTandem2 = new BicicletaTandem(20, 6, 2);
		
		Coche coche1 = new Coche(40, 7, 4);

		
		miBicicleta.cambiarPinon(5);
		miBicicleta.cambiarPlato(3);
		miBicicleta.acelerar();
		
		tuBicicleta.cambiarPinon();
		tuBicicleta.cambiarPlato();
		
		
		biciMontaña1.cambiarPinon(5);
		biciMontaña1.cambiarPlato(3);
		biciMontaña1.acelerar();
		
		biciTandem1.cambiarPinon(5);
		biciTandem1.cambiarPlato(3);
		biciTandem1.acelerar();
		biciTandem1.frenar();
		
		coche1.acelerar();
		coche1.establecerRuedas();
		coche1.setNumPuertas(3);
		
		System.out.println("************************************Mi bicicleta*****************************");

		
		System.out.println("El cambio seleccionado es: " + miBicicleta.getPinonActual());
		System.out.println("La velocidad es de: " + miBicicleta.getVelocidadActual());
		System.out.println("El plato seleccionado es: " + miBicicleta.getPlatoActual());
	
		System.out.println("*************************************Tu bicicleta**************************");
		
		System.out.println("El cambio seleccionado para tu bicicleta es: " + tuBicicleta.getPinonActual());
		System.out.println("El plato seleccionado para tu bicicleta es: " + tuBicicleta.getPlatoActual());
		
		
		System.out.println("*************************************Bicicleta Montaña*********************");
		
		System.out.println("El cambio seleccionado es: " + biciMontaña1.getPinonActual());
		System.out.println("La velocidad es de: " + biciMontaña1.getVelocidadActual());
		System.out.println("El plato seleccionado es: " + biciMontaña1.getPlatoActual());
		
		System.out.println("**************************************Bicicleta Tandem*********************");
		
		System.out.println("El cambio seleccionado es: " + biciTandem1.getPinonActual());
		System.out.println("La velocidad es de: " + biciTandem1.getVelocidadActual());
		System.out.println("El plato seleccionado es: " + biciTandem1.getPlatoActual());
		
		
		
		//Array bicicleta polimorfismo
		
		System.out.println("**************************************Array bicis ligadura dinamica*********************");

		
		Bicicleta [] arrayBicis = {new Bicicleta(15, 2, 3), new BicicletaMontaña(10, 4, 3), new BicicletaTandem(10,6,2)};
		
		for(int i=0; i<arrayBicis.length; i++) {
			arrayBicis[i].acelerar();
			
			System.out.println("La velocidad es de: " + arrayBicis[i].getVelocidadActual());

		}
		
		System.out.println("**************************************Impresion de datos de coche*********************");
		
		System.out.println(coche1.getNumPuertas());
		System.out.println(coche1.getVelocidadActual());


		
		
		System.out.println("**************************************Impresion de datos de vehiculo*********************");

		biciMontaña1.imprime();
		biciTandem2.imprime();
		miBicicleta.imprime();
		
		System.out.println("**************************************Impre valor de atributos de objeto*********************");
		
		miBicicleta.getAtributos();

	}

}
