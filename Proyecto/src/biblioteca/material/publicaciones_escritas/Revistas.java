package biblioteca.material.publicaciones_escritas;

import biblioteca.material.Consultables;

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
	}

}
