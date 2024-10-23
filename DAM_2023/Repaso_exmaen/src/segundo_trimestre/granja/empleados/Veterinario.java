package segundo_trimestre.granja.empleados;

import segundo_trimestre.granja.animales.Animal;

public class Veterinario extends Empleado{
	
	private int experiencia;
	
	public Veterinario (String nombre) {
		super(nombre);
		experiencia = 0;
		this.setNomina(2000);
	}
	
	
	public void trabajar() {	
		Animal animal = this.getAnimal();
		boolean experiencia = this.experiencia++ > 10;
		animal.recibirCuidados(experiencia);
		super.trabajar();
		
	}

}