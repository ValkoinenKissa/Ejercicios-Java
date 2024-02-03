package segundo_trimestre.granja_v2.empleados;

import segundo_trimestre.granja_v2.animales.Animal;

public class Empleado {
	private String nombre;
	private double nomina = 1000;
	private Animal animalAsignado;

	public Empleado(String nombre) {
		this.nombre = nombre;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getNomina() {
		return nomina;
	}

	public void setNomina(double nomina) {
		this.nomina = nomina;
	}

	public Animal getAnimalAsignado() {
		return animalAsignado;
	}

	public void setAnimalAsignado(Animal animalAsignado) {
		this.animalAsignado = animalAsignado;
	}

	private void aumentoNomina() {
		nomina += (nomina * 0.01);
	}

	public void trabajar() {
		System.out
				.println("Mi nombre es: " + nombre + " y he trabajado con el animal: " + animalAsignado.getEtiqueta());
		aumentoNomina();
	}

}
