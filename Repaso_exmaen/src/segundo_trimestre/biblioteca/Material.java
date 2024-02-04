package segundo_trimestre.biblioteca;

public abstract class Material {
	private int id;
	private String titulo;
	private int annoPublicacion;
	
	
	public Material(int id, String titulo, int annoPublicacion) {
		this.id = id;
		this.titulo = titulo;
		this.annoPublicacion = annoPublicacion;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public int getAnnoPublicacion() {
		return annoPublicacion;
	}


	public void setAnnoPublicacion(int annoPublicacion) {
		this.annoPublicacion = annoPublicacion;
	}
	
	public abstract void detalleMaterial();

}
