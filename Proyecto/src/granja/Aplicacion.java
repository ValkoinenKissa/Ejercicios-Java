package granja;
import granja.animales.Cerdos;
import granja.animales.Gallina;
import granja.animales.Vacas;
import granja.animales.Animal;
import java.util.Random;
import granja.empleados.*;

public class Aplicacion {
	static Random random = new Random();
	public static void main(String[] args) {
	    // ********* Creación de empleados *********
	    Granjero granjero1 = new Granjero("Alarico", "Vacas");
	    Granjero granjero2 = new Granjero("Witerico", "Cerdos");
	    Granjero granjero3 = new Granjero("Chindasvinta", "Gallina");

	    Veterinario veterinario1 = new Veterinario("Paquito");
	    Veterinario veterinario2 = new Veterinario("Manolo");

	    Empleado[] empleados = new Empleado[]{granjero1, granjero2, granjero3, veterinario1, veterinario2};

	    // ********* Creación de animales *********
	    Animal[] animales = new Animal[1000];

	    for (int i = 0; i < 1000; i++) {
	        int tipoAnimalAleatorio = random.nextInt(3);

	        switch (tipoAnimalAleatorio) {
	            case 0:
	                animales[i] = new Vacas("Vaca" + i);
	                break;
	            case 1:
	                animales[i] = new Cerdos("Cerdo" + i);
	                break;
	            case 2:
	                animales[i] = new Gallina("Gallina" + i);
	                break;
	        }
	    }

	    // ********* Asignación aleatoria de animales a empleados y trabajo *********
	    for (int i = 0; i < 10000; i++) {
	        int empleadoAleatorio = random.nextInt(5);
	        int animalAleatorio = random.nextInt(1000);

	        Empleado empleado = empleados[empleadoAleatorio];
	        Animal animal = animales[animalAleatorio];

	        empleado.setAnimal(animal.getNombreEspecie());
	        empleado.trabajar(animal);
	    }

	    // ********* Mostrar etiqueta y peso de cada animal *********
	    System.out.println("\nResultados Finales:");
	    for (Animal animal : animales) {
	        System.out.println(animal.getEtiqueta() + ", Peso: " + animal.getPeso());
	    }
	}


}
