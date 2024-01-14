package biblioteca.material.otros;

import biblioteca.material.Consultables;
import biblioteca.material.Mantenibles;
import biblioteca.material.Material;

public class Mapas extends Material implements Consultables, Mantenibles {

	public Mapas(int id, String titulo, String fechaPublicacion) {
		super(id, titulo, fechaPublicacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void detalleMaterial() {
		String[] infoMaterial = { String.valueOf(this.id), this.titulo, this.fechaPublicacion };

		for (int i = 0; i < infoMaterial.length; i++) {
			System.out.println(infoMaterial[i]);
		}
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
