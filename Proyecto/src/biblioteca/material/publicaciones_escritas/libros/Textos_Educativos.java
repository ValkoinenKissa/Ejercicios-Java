package biblioteca.material.publicaciones_escritas.libros;

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
		super.detalleMaterial();
		System.out.println("El nivel del texto es: " + this.nivel);
		System.out.println("La materia del texto es: " + this.nivel);
	}
	

}
