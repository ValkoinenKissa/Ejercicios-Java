package concesionario;

import concesionario.vehiculos.Camiones;
import concesionario.vehiculos.Coches;
import concesionario.vehiculos.Motos;

public class Ejecutable {

	public static void main(String[] args) {

		Coches cocheElectrico = new Coches("Fiat", "500e", 29000, 3, true);
		Coches cocheGasolina = new Coches("Toyota", "Corolla GR", 30500, 5, false);

		Motos moto1 = new Motos("Ducati", "Diavle", 15200, false, ("Transmision por cadena"));

		Camiones camion1 = new Camiones("Volvo", "S80", 120000, 12);

		double impuetos = cocheElectrico.calcularImpuestos();

		System.err.println(impuetos);

		cocheElectrico.comprarVehiculo();

		System.out.println(cocheElectrico.calcularPrecioCompra(impuetos));
		System.out.println(cocheElectrico.calcularAlquiler(impuetos));

		System.out.println(cocheElectrico.getDetalles());

		System.out.println("********************************************");

		double impuetos2 = cocheGasolina.calcularImpuestos();

		cocheGasolina.comprarVehiculo();

		System.out.println(cocheGasolina.calcularPrecioCompra(impuetos2));
		System.out.println(cocheGasolina.calcularAlquiler(impuetos2));

		System.out.println(cocheGasolina.getDetalles());
		System.err.println(impuetos2);

		System.out.println("********************************************");

		moto1.alquilarVehiculo();

		double impuetos3 = moto1.calcularImpuestos();

		System.out.println(moto1.calcularAlquiler(impuetos3));

		System.out.println(moto1.getDetalles());

		System.err.println(impuetos3);

		System.out.println(moto1.calcularDepreciacion(6));

		System.out.println("********************************************");
		
		double impuestos3 = camion1.calcularImpuestos();

		camion1.comprarVehiculo();

		System.out.println(camion1.calcularPrecioCompra(impuestos3));

		System.out.println(camion1.getDetalles());
		System.err.println(impuestos3);

	}

}
