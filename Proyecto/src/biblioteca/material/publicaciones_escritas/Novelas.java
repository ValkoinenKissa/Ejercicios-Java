package biblioteca.material.publicaciones_escritas;

public class Novelas extends Libros {

	protected String genero;
	protected String sinopsis;

	public Novelas(int id, String titulo, String fechaPublicacion, String editorial, String idioma, int numPaginas, String genero, String sinopsis) {
		super(id, titulo, fechaPublicacion, editorial, idioma, numPaginas);
		this.genero = genero;
		this.sinopsis = sinopsis;
	}

	@Override
	public void detalleMaterial() {
		String[] infoMaterial = { String.valueOf(this.id), this.titulo, this.fechaPublicacion, this.editorial,
				this.idioma, this.genero, this.sinopsis };

		for (int i = 0; i < infoMaterial.length; i++) {
			System.out.println(infoMaterial[i]);
		}
	}

}
