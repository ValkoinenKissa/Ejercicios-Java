package biblioteca.material.publicaciones_escritas.libros;

import biblioteca.material.interfaces.Consultables;

public class Revistas extends Libros implements Consultables{
	
	protected int edicion;
	protected String tema;

	public Revistas(int id, String titulo, String fechaPublicacion, String editorial, String idioma, int numPaginas, int edicion, String tema) {
		super(id, titulo, fechaPublicacion, editorial, idioma, numPaginas);
		this.edicion = edicion;
		this.tema = tema;
	}

	@Override
	public void consultables() {
		System.out.println("Consultando la info sobre: " + this.getTitulo());
	}

	@Override
	public void detalleMaterial() {
		super.detalleMaterial();
		System.out.println("La edicion es: " + this.edicion);
		System.out.println("El tema de la publicación es: " + this.tema);
	}

}
