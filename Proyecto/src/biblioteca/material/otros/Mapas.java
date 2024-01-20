package biblioteca.material.otros;

import biblioteca.material.Material;
import biblioteca.material.interfaces.Consultables;
import biblioteca.material.interfaces.Mantenibles;

public class Mapas extends Material implements Consultables, Mantenibles {

	public Mapas(int id, String titulo, String fechaPublicacion) {
		super(id, titulo, fechaPublicacion);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void detalleMaterial() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mantenible() {
		System.out.println("Realizando mantenimiento sobre: " + this.getTitulo());

	}

	@Override
	public void consultables() {
		System.out.println("Consultando la info sobre: " + this.getTitulo());

	}
}
