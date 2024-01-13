package biblioteca.material;

public abstract class Material {
	
	protected int id;
	protected String titulo;
	protected String fechaPublicacion;
	
	public Material(int id, String titulo, String fechaPublicacion) {
		this.id = id;
		this.titulo = titulo;
		this.fechaPublicacion = fechaPublicacion;
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

	public String getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}
	
	
	public abstract void detalleMaterial();
	

}
