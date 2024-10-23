package segundo_trimestre.granja.empleados;

import segundo_trimestre.granja.animales.Animal;

public class Empleado {
	private String nombre;
	private double nomina = 1000;
	private Animal animal;

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

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	private void aumentarNomina() {
		nomina = nomina * 1.001;
	}

	public void trabajar() {
		System.out.println(nombre + " ha trabajado con " + animal.getEtiqueta());
		aumentarNomina();
	}

}