package segundo_trimestre.biblioteca.otros;

import segundo_trimestre.biblioteca.Material;
import segundo_trimestre.biblioteca.interfaces.Consultables;
import segundo_trimestre.biblioteca.interfaces.Mantenibles;

public class Manuscrito extends Material implements Consultables, Mantenibles{

	public Manuscrito(int id, String titulo, int annoPublicacion) {
		super(id, titulo, annoPublicacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mantenimiento() {
		System.out.println("Se esta aplicando el mantenimiento a: " + this.getId() + " " + this.getTitulo());

		
	}

	@Override
	public void Consultar() {
		System.out.println("Consultando la informacion sobre el Manuscrito...");
		detalleMaterial();
		
	}

	@Override
	public void detalleMaterial() {
		System.out.println("El id es: " + this.getId() + " Titulo: " + this.getTitulo() + " Año publicacion: "
				+ this.getAnnoPublicacion());
	}
	
	

}
