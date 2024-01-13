package biblioteca.material.publicaciones_escritas;

public class Textos_Educativos extends Libros {

	protected int nivel;
	protected String materia;

	public Textos_Educativos(int id, String titulo, String fechaPublicacion, String editorial, String idioma,
			int numPaginas) {
		super(id, titulo, fechaPublicacion, editorial, idioma, numPaginas);
	}

	@Override
	public void detalleMaterial() {
		String[] infoMaterial = { String.valueOf(super.id), super.titulo, super.fechaPublicacion, super.editorial,
				super.idioma, String.valueOf(nivel), this.materia };

		for (int i = 0; i < infoMaterial.length; i++) {
			System.out.println(infoMaterial[i]);
		}
	}

}
