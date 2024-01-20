package biblioteca.material.publicaciones_escritas.libros;

public class Novelas extends Libros {

	protected String genero;
	protected String sinopsis;

	public Novelas(int id, String titulo, String fechaPublicacion, String editorial, String idioma, int numPaginas,
			String genero, String sinopsis) {
		super(id, titulo, fechaPublicacion, editorial, idioma, numPaginas);
		this.genero = genero;
		this.sinopsis = sinopsis;
	}

	@Override
	public void detalleMaterial() {
		super.detalleMaterial();
		System.out.println("El genero es: " + this.genero);
		System.out.println("La sinopsis esta basada en: " + this.genero);
	}

}
