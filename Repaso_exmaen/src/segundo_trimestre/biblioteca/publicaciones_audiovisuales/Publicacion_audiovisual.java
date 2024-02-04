package segundo_trimestre.biblioteca.publicaciones_audiovisuales;

import segundo_trimestre.biblioteca.Material;

public class Publicacion_audiovisual extends Material {

	private double duraccion;
	private String genero;

	public Publicacion_audiovisual(int id, String titulo, int annoPublicacion, double duraccion, String genero) {
		super(id, titulo, annoPublicacion);
		this.duraccion = duraccion;
		this.genero = genero;
	}

	@Override
	public void detalleMaterial() {
		System.out.println("El id es: " + this.getId() + " Titulo: " + this.getTitulo() + " Año publicacion: "
				+ this.getAnnoPublicacion() + " duraccion: " + duraccion + " El genero es " + genero);

	}

	public double getDuraccion() {
		return duraccion;
	}

	public void setDuraccion(double duraccion) {
		this.duraccion = duraccion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
