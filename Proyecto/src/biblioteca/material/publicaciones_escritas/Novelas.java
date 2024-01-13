package biblioteca.material.publicaciones_escritas;

public class Novelas extends Libros {

	protected String genero;
	protected String sinopsis;

	public Novelas(int id, String titulo, String fechaPublicacion, String editorial, String idioma, int numPaginas) {
		super(id, titulo, fechaPublicacion, editorial, idioma, numPaginas);
	}

	@Override
	public void detalleMaterial() {
		String[] infoMaterial = { String.valueOf(super.id), super.titulo, super.fechaPublicacion, super.editorial,
				super.idioma, this.genero, this.sinopsis };

		for (int i = 0; i < infoMaterial.length; i++) {
			System.out.println(infoMaterial[i]);
		}
	}

}
