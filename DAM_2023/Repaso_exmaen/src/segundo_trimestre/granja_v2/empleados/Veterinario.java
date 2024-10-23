package segundo_trimestre.granja_v2.empleados;

import segundo_trimestre.granja_v2.animales.Animal;

public class Veterinario extends Empleado {
	private int experiencia = 0;

	public Veterinario(String nombre) {
		super(nombre);
		this.setNomina(2000);
	}

	public int getExperiencia() {
		return experiencia;
	}

	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}

	@Override
	public void trabajar() {
		Animal animal = this.getAnimalAsignado();
		boolean experiencia = this.experiencia++ > 10;
		animal.recibirCuidados(experiencia);
		super.trabajar();
	}

}
