package granja.empleados;
import granja.animales.Animal;
public class Veterinario  extends Empleado{
	private double nomina = 2000;
	private int experiencia = 0;
	public Veterinario(String nombreEmpleado) {
		super(nombreEmpleado);
	}
	public double getNomina() {
		return nomina;
	}
	public void setNomina(double nomina) {
		this.nomina = nomina;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
	public void trabajar(Animal animal) {
		boolean expVeterinario = false;
		boolean salud = false;
		if (experiencia > 10) {
			expVeterinario = true;
			salud = true;
			animal.setMarcadorSalud(salud);
			animal.recibirCuidados(expVeterinario);
		}
		
		else {
			expVeterinario = false;
			salud = false;
			animal.setMarcadorSalud(salud);
			animal.recibirCuidados(expVeterinario);
		}
		
		int aumentoExperiencia = getExperiencia();
		aumentoExperiencia ++;
		setExperiencia(aumentoExperiencia);
	}
	
	

}
