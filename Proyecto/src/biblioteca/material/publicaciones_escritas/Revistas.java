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
		System.out.println("Consultando la info sobre: " + this.getTitulo());
	}

	@Override
	public void detalleMaterial() {
		String [] infoMaterial = {String.valueOf(this.id), this.titulo, this.fechaPublicacion, this.editorial, this.idioma, String.valueOf(this.edicion), this.tema};
		
		for(int i =0; i < infoMaterial.length; i++) {
			System.out.println(infoMaterial[i]);
		}
	}
	
	
	

}
