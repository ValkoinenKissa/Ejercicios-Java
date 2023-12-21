package ies;

public class Fecha {
	private int dia;
	private int mes;
	private int anno;
	public Fecha (int dia,int mes,int anno) {
		this.dia=dia;
		this.mes=dia;
		this.anno=dia;
	}
	public void printFecha() {
		System.out.println("La fecha es: "+dia+"/"+mes+"/"+anno);
	}
}