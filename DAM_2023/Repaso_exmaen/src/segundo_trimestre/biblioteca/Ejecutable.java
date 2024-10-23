package segundo_trimestre.biblioteca;

import java.util.Random;

import segundo_trimestre.biblioteca.interfaces.Consultables;
import segundo_trimestre.biblioteca.interfaces.Prestables;
import segundo_trimestre.biblioteca.otros.Manuscrito;
import segundo_trimestre.biblioteca.otros.Mapa;
import segundo_trimestre.biblioteca.publicaciones_audiovisuales.DVD;
import segundo_trimestre.biblioteca.publicaciones_audiovisuales.VHS;
import segundo_trimestre.biblioteca.publicaciones_escritas.Libro;
import segundo_trimestre.biblioteca.publicaciones_escritas.Novela;
import segundo_trimestre.biblioteca.publicaciones_escritas.Revista;
import segundo_trimestre.biblioteca.publicaciones_escritas.Texto_educativo;

public class Ejecutable {

	public static void main(String[] args) {

		// Libros

		Libro libro1 = new Libro(9823, "1984 G.Orwell", 1949, "Planeta", "Inglés", 328);
		Libro libro2 = new Libro(9832, "El señor de los anillos (Trilogía), de J. R. R. Tolkien", 1959,
				"Grupo editorial", "Español", 700);

		// Novelas

		Novela novela1 = new Novela(9925, "Orgullo y prejuicio", 1979, "Planeta", "Español", 345, "Romantica",
				"\"Orgullo y prejuicio\" es una novela que sigue la vida de Elizabeth Bennet, una joven inteligente y perspicaz, y su relación con el apuesto pero orgulloso Sr. Darcy. La historia se desarrolla en la Inglaterra rural del siglo XIX y aborda temas como el matrimonio, la clase social, el orgullo y el prejuicio.");
		Novela novela2 = new Novela(7869, "El extraño caso del Dr. Jekyll y Mr. Hyde", 1956, "El pais", "Español", 171,
				"Ciencia ficcion",
				"El extraño caso del Dr. Jekyll y Mr. Hyde\" es una novela corta escrita por Robert Louis Stevenson, publicada por primera vez en 1886. La obra cae dentro del género de la novela gótica y la literatura de horror. También se le ha asociado con el género de ciencia ficción, ya que explora temas relacionados con la dualidad humana y la experimentación científica");

		// Textos educativos
		Texto_educativo texteducativo1 = new Texto_educativo(5844, "La República de Platón", 1921, "Santillana",
				"Español", 203, 7, "Filosofia");
		Texto_educativo texteducativo2 = new Texto_educativo(5844, "¿Dónde está Wally? de Martin Handford", 1971,
				"Santillana", "Español", 203, 4, "Matematicas");

		// Revistas
		Revista revista1 = new Revista(3841, "El jueves", 1980, "El jueves", "Español", 70, "Satira politica");
		Revista revista2 = new Revista(5743, "Auto Bild", 1990, "Auto Bild", "Español", 5, "Automoción");

		// DVDs
		DVD dvd1 = new DVD(8574, "Deadpool", 2016, 1.36, "Comedia / Accion", 2);
		DVD dvd2 = new DVD(8574, "Intelestellar", 2013, 1.36, "Ciencia Ficcion", 2);

		// VHSs
		VHS vhs1 = new VHS(3453, "El precio del poder", 1980, 1.20, "Accion", 5, false);
		VHS vhs2 = new VHS(3453, "El resplandor", 1986, 1.20, "Suspense", 3, true);

		// Otros
		Mapa map1 = new Mapa(1222, "Mapa cartografico de Madrid", 2015);
		Manuscrito manuscrito = new Manuscrito(4432, "El Libro de Durrow", 1330);

		Material[] materialesDisponibles = { libro1, libro2, novela1, novela2, texteducativo1, texteducativo2, revista1,
				revista2, dvd1, dvd2, vhs1, vhs2, map1, manuscrito };

		Material[] materialesSeleccionados = new Material[5];

		materialesSeleccionados = seleccionALaZar(materialesDisponibles);

		System.out.println(
				"*************************************************************************************************************************************");

		Prestables[] materialesPrestados = new Prestables[materialesSeleccionados.length];

		materialesPrestados = prestarMaterial(materialesSeleccionados);

		imprimirMaterialPrestado(materialesPrestados);
		
		System.out.println(
				"*************************************************************************************************************************************");
		
		Material [] nuevoCatalogo = new Material[materialesDisponibles.length];
		
		nuevoCatalogo = obtenerCatalogoMaterialesDisponibles(materialesDisponibles, materialesPrestados);
		
		imprimirCatalgo(nuevoCatalogo);
		

	}

	public static Material[] seleccionALaZar(Material[] materialesDisponibles) {
		Random generador = new Random();
		Material[] materialesSeleccionados = new Material[5];

		for (int i = 0; i < materialesSeleccionados.length; i++) {
			int seleccionAleatoria = generador.nextInt(materialesDisponibles.length);
			Material aConsultar = materialesDisponibles[seleccionAleatoria];

			if (aConsultar instanceof Consultables) {
				((Consultables) aConsultar).Consultar();
				materialesSeleccionados[i] = aConsultar;
			} else {
				System.err.println("No se ha podido consultar: " + aConsultar.getId());
			}

			System.out.println();
		}

		return materialesSeleccionados;
	}
	
	public static Prestables[] prestarMaterial(Material[] materialesSeleccionados) {
	    Prestables[] materialPrestados = new Prestables[materialesSeleccionados.length];
	    
	    for (int i = 0; i < materialesSeleccionados.length; i++) {
	        if (materialesSeleccionados[i] instanceof Prestables && materialesSeleccionados[i] != null) {
	            materialPrestados[i] = (Prestables) materialesSeleccionados[i];
	        } else {
	        	if(materialesSeleccionados[i] != null) {
	            System.err.println("No se puede prestar " + materialesSeleccionados[i].getTitulo());
	        	} else {
	        		System.out.println("No se puede mostrar..");
	        	}
	        }
	    }
	    
	    return materialPrestados;
	}



	public static void imprimirMaterialPrestado(Prestables[] materialPrestados) {
		for (Prestables prestados : materialPrestados) {
			if (prestados != null) {

				prestados.prestar();

			} else {
				System.err.println("No se puede mostar ");
			}
		}
	}

    public static Material[] obtenerCatalogoMaterialesDisponibles(Material[] materialesDisponibles, Prestables[] materialesPrestados) {
        int contador = 0;

        // Contar la cantidad de materiales disponibles
        for (Material material : materialesDisponibles) {
            if (!estaPrestado(material, materialesPrestados)) {
                contador++;
            }
        }

        // Crear un nuevo array con la cantidad correcta
        Material[] catalogoMaterialesDisponibles = new Material[contador];
        int index = 0;

        // Llenar el nuevo array con los materiales disponibles
        for (Material material : materialesDisponibles) {
            if (!estaPrestado(material, materialesPrestados)) {
                catalogoMaterialesDisponibles[index++] = material;
            }
        }

        return catalogoMaterialesDisponibles;
    }

    private static boolean estaPrestado(Material material, Prestables[] materialesPrestados) {
        for (Prestables prestado : materialesPrestados) {
            if (prestado != null && prestado.equals(material)) {
                return true;
            }
        }
        return false;
    }
    
    public static void imprimirCatalgo(Material [] catalogoMaterialesDisponibles) {
    	System.out.println("El nuevo catalogo de materiales disponibles: ");
    	for(Material materialDisp : catalogoMaterialesDisponibles) {
    		materialDisp.detalleMaterial();
    		System.out.println();
    	}
    }
	
	
}
