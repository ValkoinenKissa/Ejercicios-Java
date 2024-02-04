package segundo_trimestre.biblioteca.publicaciones_escritas;

import segundo_trimestre.biblioteca.interfaces.Consultables;

public class Revista extends Publicacion_escrita implements Consultables{
	
	private int edicion;
	private String tema;

	public Revista(int id, String titulo, int annoPublicacion, String editorial, String idioma, int edicion, String tema) {
		super(id, titulo, annoPublicacion, editorial, idioma);
		this.edicion = edicion;
		this.tema = tema;
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	@Override
	public void Consultar() {
		System.out.println("Consultando los datos de la revista....");
		detalleMaterial();
		
	}

	@Override
	public void detalleMaterial() {
		// TODO Auto-generated method stub
		super.detalleMaterial();
		System.out.println("Edicion de revista: " + edicion + " tema de la misma: " + tema);
	}
	
	

}
