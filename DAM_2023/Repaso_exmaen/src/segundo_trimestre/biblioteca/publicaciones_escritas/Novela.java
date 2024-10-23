package segundo_trimestre.biblioteca.publicaciones_escritas;

public class Novela extends Libro{
	
	private String genero;
	private String sinopsis;

	public Novela(int id, String titulo, int annoPublicacion, String editorial, String idioma, int numPaginas, String genero, String sinopsis) {
		super(id, titulo, annoPublicacion, editorial, idioma, numPaginas);
		this.genero = genero;
		this.sinopsis = sinopsis;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	

	public String getSinopsis() {
		return sinopsis;
	}

	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}

	@Override
	public void detalleMaterial() {
		// TODO Auto-generated method stub
		super.detalleMaterial();
		System.out.println("El genero de la novela es: " + genero);
	}
	
	

}
