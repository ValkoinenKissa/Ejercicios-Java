package tienda_electronica;

import java.util.Random;

import tienda_electronica.dispositivos.Consola;
import tienda_electronica.dispositivos.Portatil;
import tienda_electronica.dispositivos.TelefonoMovil;

public class Ejecutable {
	static Random generadorAleatorios = new Random();

	public static void main(String[] args) {

		Productos_electronicos[] catalogo = {

				new Consola("PlayStation", "PS5", 500.5, false, "blanco", 1920),
				new Consola("Xbox", "Series x", 700.5, false, "negro", 4020),
				new TelefonoMovil("Apple", "iPhone 15", 1200, false, 13, "iOS 17"),
				new TelefonoMovil("Google", "Pixel 8", 800, false, 8, "Android 13"),
				new Portatil("Dell", "Vostro", 700, false, 500, "i5 10th gen"),
				new Portatil("Apple", "MacBook pro", 1700, false, 1000, "Apple M2")

		};
		
		int [] indicesUtilizados = new int [catalogo.length];
		int cantidadProductos = 0;

			while (cantidadProductos < 3) {
				int indiceAleatorio = generadorAleatorios.nextInt(catalogo.length);
				
				boolean yaUtilizado = false;
				for(int i =0; i< cantidadProductos; i++) {
					if(indicesUtilizados[i] == indiceAleatorio) {
						yaUtilizado = true;
					}

			}

			if (!yaUtilizado) {
				System.out.println(catalogo[indiceAleatorio].mostarInformacion());
				catalogo[indiceAleatorio].encenderDispositivo();
				catalogo[indiceAleatorio].apagarDispositivo();
				System.out.println();
				indicesUtilizados[cantidadProductos] = indiceAleatorio;
				cantidadProductos++;

			}

		}

	}

}
