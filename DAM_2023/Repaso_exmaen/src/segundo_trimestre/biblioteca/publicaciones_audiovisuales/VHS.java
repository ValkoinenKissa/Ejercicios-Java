package segundo_trimestre.biblioteca.publicaciones_audiovisuales;

public class VHS extends Publicacion_audiovisual {
	private int durabilidadRest;
	private boolean calidadImagen;

	public VHS(int id, String titulo, int annoPublicacion, double duraccion, String genero, int durabilidadRest,
			boolean calidadImagen) {
		super(id, titulo, annoPublicacion, duraccion, genero);
		this.durabilidadRest = durabilidadRest;
		this.calidadImagen = calidadImagen;
	}

	public int getDurabilidadRest() {
		return durabilidadRest;
	}

	public void setDurabilidadRest(int durabilidadRest) {
		this.durabilidadRest = durabilidadRest;
	}

	public boolean isCalidadImagen() {
		return calidadImagen;
	}

	public void setCalidadImagen(boolean calidadImagen) {
		this.calidadImagen = calidadImagen;
	}

	@Override
	public void detalleMaterial() {
		super.detalleMaterial();
		System.out.println("La durabilidad restante de la cinta es de: " + durabilidadRest
				+ " y la calidad de la imagen es: " + calidadImagen);

	}

}
