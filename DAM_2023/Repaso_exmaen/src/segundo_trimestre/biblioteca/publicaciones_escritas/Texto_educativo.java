package segundo_trimestre.biblioteca.publicaciones_escritas;

public class Texto_educativo extends Libro{
	
	private int nivel;
	private String materia;

	public Texto_educativo(int id, String titulo, int annoPublicacion, String editorial, String idioma,
			int numPaginas, int nivel, String materia) {
		super(id, titulo, annoPublicacion, editorial, idioma, numPaginas);
		this.materia = materia;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public String getMateria() {
		return materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	@Override
	public void detalleMaterial() {
		super.detalleMaterial();
		System.out.println("El nivel del texto educativo es: " + nivel + " y la materia a la que pertenece: " + materia);
	}

}
