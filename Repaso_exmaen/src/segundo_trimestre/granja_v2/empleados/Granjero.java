package segundo_trimestre.granja_v2.empleados;

import segundo_trimestre.granja_v2.animales.Animal;

public class Granjero extends Empleado{
	
	private final String especialidad;

	public Granjero(String nombre, String especialidad) {
		super(nombre);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	@Override
	public void trabajar() {
		Animal animal = this.getAnimalAsignado();
		boolean eficiencia;
		String especieAnimal = animal.getEspecie();
		if(especialidad.equalsIgnoreCase(especieAnimal)) {
			eficiencia = true;
		}
		
		else {
			eficiencia = false;
		}
		animal.comer(eficiencia);
		animal.producir();
		super.trabajar();
	}
	
	

}
