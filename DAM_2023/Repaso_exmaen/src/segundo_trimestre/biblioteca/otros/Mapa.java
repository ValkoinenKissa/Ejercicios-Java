package segundo_trimestre.biblioteca.otros;

import segundo_trimestre.biblioteca.Material;
import segundo_trimestre.biblioteca.interfaces.Consultables;
import segundo_trimestre.biblioteca.interfaces.Mantenibles;

public class Mapa extends Material implements Consultables, Mantenibles {

	public Mapa(int id, String titulo, int annoPublicacion) {
		super(id, titulo, annoPublicacion);
	}

	@Override
	public void mantenimiento() {
		System.out.println("Se esta aplicando el mantenimiento a: " + this.getId() + " " + this.getTitulo());

	}

	@Override
	public void Consultar() {
		System.out.println("Consultando la informacion sobre el Mapa...");
		detalleMaterial();
	}

	@Override
	public void detalleMaterial() {
		System.out.println("El id es: " + this.getId() + " Titulo: " + this.getTitulo() + " Año publicacion: "
				+ this.getAnnoPublicacion());
	}

}
