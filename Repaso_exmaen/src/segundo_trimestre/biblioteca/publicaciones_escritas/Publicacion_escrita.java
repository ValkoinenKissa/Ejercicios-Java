package segundo_trimestre.biblioteca.publicaciones_escritas;

import segundo_trimestre.biblioteca.Material;

public class Publicacion_escrita extends Material {

	private String editorial;
	private String idioma;

	public Publicacion_escrita(int id, String titulo, int annoPublicacion, String editorial, String idioma) {
		super(id, titulo, annoPublicacion);
		this.editorial = editorial;
		this.idioma = idioma;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	@Override
	public void detalleMaterial() {
		System.out.println("El id es: " + this.getId() + " Titulo: " + this.getTitulo() + " Año publicacion: "
				+ this.getAnnoPublicacion() + " Editorial: " + this.getEditorial() + " El idioma: " + this.getIdioma());

	}

}
