package segundo_trimestre.granja;
import java.util.Random;
import segundo_trimestre.granja.animales.Animal;
import segundo_trimestre.granja.animales.Cerdo;
import segundo_trimestre.granja.animales.Gallina;
import segundo_trimestre.granja.animales.Vaca;
import segundo_trimestre.granja.empleados.Empleado;
import segundo_trimestre.granja.empleados.Granjero;
import segundo_trimestre.granja.empleados.Veterinario;

public class Aplicacion {
	public static void main(String[] args) {
		Granjero g1= new Granjero ("Pedro",Animal.CERDO);
		Granjero g2= new Granjero ("Juan",Animal.GALLINA);
		Granjero g3= new Granjero ("Enrique",Animal.VACA);
		Veterinario v1 = new Veterinario ("Rodolfo");
		Veterinario v2 = new Veterinario ("Ruperto");	
		
		Empleado[] empleados = {g1,g2,g3,v1,v2};
		
		
		Animal[] animales = poblarGranja(1000);
		
		
		for(int i =0;i<10000;i++) {
			Empleado empleado = empleadoAleatorio(empleados);
			Animal animal = animalAleatorio(animales);
			empleado.setAnimal(animal);
			empleado.trabajar();
		}
		
		for (Animal animal : animales) {
			System.out.println(animal.getEtiqueta()+" "+animal.getPeso());
		}
		
		
	}
	
	public static  Animal[] poblarGranja(int numAnimales) {
		Animal[] animales = new Animal[numAnimales];
		Random generador = new Random();		
		int animalAleatorio;
		String etiqueta;
		for(int i = 0; i < numAnimales;i++) {
			animalAleatorio = generador.nextInt(3);			
			switch(animalAleatorio) {
			case 0:
				etiqueta="A"+i+"C";
				animales[i] = new Cerdo(etiqueta);
				break;
			case 1:
				etiqueta="A"+i+"G";
				animales[i] = new Gallina(etiqueta);
				break;
			case 2:
				etiqueta="A"+i+"V";
				animales[i] = new Vaca(etiqueta);
				break;
			}
		}
		return animales;
	}
	
	public static  Empleado empleadoAleatorio(Empleado[] empleados) {		
		Random generador = new Random();		
		int empleadoAleatorio= generador.nextInt(empleados.length);
		return empleados[empleadoAleatorio];
	}
	public static  Animal animalAleatorio(Animal[] animales) {		
		Random generador = new Random();		
		int animalAleatorio= generador.nextInt(animales.length);
		return animales[animalAleatorio];
	}
	

}
