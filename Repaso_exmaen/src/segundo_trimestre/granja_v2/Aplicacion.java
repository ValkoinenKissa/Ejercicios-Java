package segundo_trimestre.granja_v2;

import java.util.Random;

import segundo_trimestre.granja_v2.animales.Animal;
import segundo_trimestre.granja_v2.animales.Cerdo;
import segundo_trimestre.granja_v2.animales.Gallina;
import segundo_trimestre.granja_v2.animales.Vaca;
import segundo_trimestre.granja_v2.empleados.Empleado;
import segundo_trimestre.granja_v2.empleados.Granjero;
import segundo_trimestre.granja_v2.empleados.Veterinario;

public class Aplicacion {
	
	public static void main(String []args) {
		Granjero g1= new Granjero ("Pedro",Animal.CERDO);
		Granjero g2= new Granjero ("Juan",Animal.GALLINA);
		Granjero g3= new Granjero ("Enrique",Animal.VACA);
		Veterinario v1 = new Veterinario ("Rodolfo");
		Veterinario v2 = new Veterinario ("Ruperto");	
		
		Empleado[] empleados = {g1, g2, g3, v1, v2};
		Animal[] animales = poblarGranja(1000);
		
		for(int i =0; i<1000; i++) {
			
			Empleado empleado = empleadoAleatroio(empleados);
			Animal animal = animalAleatorio(animales);
			empleado.setAnimalAsignado(animal);
			empleado.trabajar();			
		}
		
		for (Animal animal : animales) {
			System.out.println("La etiqueta es: " + animal.getEtiqueta() + " y el peso del animal es: " + animal.getPeso());
		}
		
	}
	
	
	public static Animal [] poblarGranja(int numAnimales) {
		Random generador = new Random();
		Animal animales [] = new Animal[numAnimales];
		String etiqueta;
		for(int i=0; i<numAnimales; i++) {
			int selectAleatorio = generador.nextInt(3);
			switch(selectAleatorio) {
			case 0:
				etiqueta = "A" + i + "C";
				animales[i] = new Cerdo(etiqueta);
				break;
				
			case 1:
				etiqueta = "A" + i + "G";
				animales[i] = new Gallina(etiqueta);
				break;
			
			case 2:
				etiqueta = "A" + i +"V";
				animales[i] = new Vaca(etiqueta);
				break;

			}
		}
		
		return animales;
	}
	
	public static Empleado empleadoAleatroio(Empleado[] empleados) {

		Random generador = new Random();

		int empleadoAleatorio = generador.nextInt(empleados.length);
		
		return empleados[empleadoAleatorio];

	}
	
	
	public static Animal animalAleatorio(Animal [] animales) {
		Random generador = new Random();

		int animalAleatorio = generador.nextInt(animales.length);
		
		return animales[animalAleatorio];
	}

}
