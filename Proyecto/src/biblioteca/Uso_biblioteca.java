package biblioteca;

import biblioteca.material.Material;
import biblioteca.material.interfaces.Prestables;
import biblioteca.material.otros.Manuscritos;
import biblioteca.material.otros.Mapas;
import biblioteca.material.publicaciones_audiovisuales.Cintas_VHS;
import biblioteca.material.publicaciones_audiovisuales.DVD;
import biblioteca.material.publicaciones_escritas.libros.Libros;
import biblioteca.material.publicaciones_escritas.libros.Novelas;
import biblioteca.material.publicaciones_escritas.libros.Revistas;
import biblioteca.material.publicaciones_escritas.libros.Textos_Educativos;

import java.util.Random;

public class Uso_biblioteca {
	public static void main(String[] args) {
		Random generadorAleatorio = new Random();
		
		//Libros
		
		Libros libro1 = new Libros(9823, "1984 G.Orwell", "8/06/1949", "Planeta", "Inglés", 328);
		Libros libro2 = new Libros(9832, "El señor de los anillos (Trilogía), de J. R. R. Tolkien", "1/08/1959", "Grupo editorial", "Español", 700);
		
		//Novelas
		
		Novelas novela1 = new Novelas(9925, "Orgullo y prejuicio", "18/03/1979", "Planeta", "Español", 345, "Romantica", "\"Orgullo y prejuicio\" es una novela que sigue la vida de Elizabeth Bennet, una joven inteligente y perspicaz, y su relación con el apuesto pero orgulloso Sr. Darcy. La historia se desarrolla en la Inglaterra rural del siglo XIX y aborda temas como el matrimonio, la clase social, el orgullo y el prejuicio.");
		Novelas novela2 = new Novelas(7869, "El extraño caso del Dr. Jekyll y Mr. Hyde", "19/02/1856", "El pais", "Español", 171, "Ciencia ficcion", "El extraño caso del Dr. Jekyll y Mr. Hyde\" es una novela corta escrita por Robert Louis Stevenson, publicada por primera vez en 1886. La obra cae dentro del género de la novela gótica y la literatura de horror. También se le ha asociado con el género de ciencia ficción, ya que explora temas relacionados con la dualidad humana y la experimentación científica");
		
		//Textos educativos
		Textos_Educativos texteducativo1 = new Textos_Educativos(5844, "La República de Platón", "13/03/1921", "Santillana", "Español", 203, 7, "Filosofia");
		Textos_Educativos texteducativo2 = new Textos_Educativos(5844, "¿Dónde está Wally? de Martin Handford", "13/09/1971", "Santillana", "Español", 203, 4, "Matematicas");
		
		//Revistas
		Revistas revista1 = new Revistas(3841, "El jueves", "1/1/1980", "El jueves", "Español", 70, 15, "Satira politica");
		Revistas revista2 = new Revistas(5743, "Auto Bild", "6/3/1990", "Auto Bild", "Español", 100, 5, "Automoción");
		
		//DVDs
		DVD dvd1 = new DVD(8574, "Deadpool", "19/11/2016", 1.36, "Comedia / Accion", new String []{"Español, Ingles"});
		DVD dvd2 = new DVD(8574, "Intelestellar", "29/12/2013", 1.36, "Ciencia Ficcion", new String []{"Aleman, Español, Ingles"});
		
		//VHSs
		Cintas_VHS vhs1 = new Cintas_VHS(3453, "El precio del poder", "1980", 1.20, "Accion", false, 5);
		Cintas_VHS vhs2 = new Cintas_VHS(3453, "El resplabdor", "1986", 1.20, "Suspense", true, 3);
		
		//Otros
		Mapas map1 = new Mapas(1222, "Mapa cartografico de Madrid", "15/10/2015");
		Manuscritos manuscrito = new Manuscritos(4432, "El Libro de Durrow", "1330 D.C");
		
		//Array con los materiales disponibles
		Material [] materialDisponible = {libro1, libro2, novela1, novela2, texteducativo1, texteducativo2, revista1, revista2, dvd1, dvd2, vhs1, vhs2, manuscrito, map1};
		
		//Array para almacenar de forma aleatoria 5 elementos
        Material[] elementosAleatorios = new Material[5];
        
		for (int i =0; i < 5; i++) {
			int indiceAleatorio = generadorAleatorio.nextInt(materialDisponible.length);
			elementosAleatorios[i] = materialDisponible[indiceAleatorio];
		}
		
		
		
		Material[] materialesConsultados = new Material[5];
		Material[] materialesPrestados = new Material[5];
        int prestadosCount = 0; // Contador para realizar un seguimiento de los materiales prestados
        
        System.err.println("Impresion de Array con 5 materiales escogidos a la zar");

        for (int i = 0; i < 5; i++) {
            materialesConsultados[i] = elementosAleatorios[i];
            materialesConsultados[i].detalleMaterial();
            System.out.println("******************************");
        }
		
		//Prestar los materiales ya consultados
				
        for (int i = 0; i < 5; i++) {
            if (materialesConsultados[i] instanceof Prestables) {
                ((Prestables) materialesConsultados[i]).prestado();
                materialesPrestados[prestadosCount] = materialesConsultados[i];
                prestadosCount++;
                
            }
            
        }
        
            
            System.out.println();
            System.err.println("Impresion de materiales prestados \n");
            
            for(int i = 0; i < prestadosCount; i++) {
            	materialesPrestados[i].detalleMaterial();
                System.out.println("******************************");
            	
            } 
	}
	
}

