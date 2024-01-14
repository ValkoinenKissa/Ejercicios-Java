package biblioteca.material.publicaciones_escritas;

public class Textos_Educativos extends Libros {

	protected int nivel;
	protected String materia;

	public Textos_Educativos(int id, String titulo, String fechaPublicacion, String editorial, String idioma,
			int numPaginas, int nivel, String materia) {
		super(id, titulo, fechaPublicacion, editorial, idioma, numPaginas);
		this.nivel = nivel;
		this.materia = materia;
	}

	@Override
	public void detalleMaterial() {
		String[] infoMaterial = { String.valueOf(this.id), this.titulo, this.fechaPublicacion, this.editorial,
				this.idioma, String.valueOf(this.nivel), this.materia };

		for (int i = 0; i < infoMaterial.length; i++) {
			System.out.println(infoMaterial[i]);
		}
	}

}
