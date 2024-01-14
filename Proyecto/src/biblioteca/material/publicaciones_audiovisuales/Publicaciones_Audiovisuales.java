package biblioteca.material.publicaciones_audiovisuales;
import biblioteca.material.Material;


public class Publicaciones_Audiovisuales extends Material{
	protected double duraccion;
	protected String genero;
	
	public Publicaciones_Audiovisuales(int id, String titulo, String fechaPublicacion, double duraccion, String genero) {
		super(id, titulo, fechaPublicacion);
		this.duraccion = duraccion;
		this.genero = genero;
	}

	@Override
	public void detalleMaterial() {
		String [] infoMaterial = {String.valueOf(this.id), this.titulo, this.fechaPublicacion, String.valueOf(duraccion), this.genero};
		
		for(int i =0; i < infoMaterial.length; i++) {
			System.out.println(infoMaterial[i]);
		}
	}
	
}
