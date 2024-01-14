package biblioteca.material.publicaciones_audiovisuales;

import biblioteca.material.Consultables;
import biblioteca.material.Mantenibles;

public class Cintas_VHS extends Publicaciones_Audiovisuales implements Mantenibles, Consultables{
	
	protected boolean calidadImagen;
	protected int durabilidad;

	public Cintas_VHS(int id, String titulo, String fechaPublicacion, double duraccion, String genero, boolean calidadImagen, int durabilidad) {
		super(id, titulo, fechaPublicacion, duraccion, genero);
		this.calidadImagen = calidadImagen;
		this.durabilidad = durabilidad;
	}

	@Override
	public void detalleMaterial() {
		String [] infoMaterial = {String.valueOf(this.id), this.titulo, this.fechaPublicacion, String.valueOf(duraccion), this.genero, String.valueOf(this.calidadImagen), String.valueOf(this.durabilidad)};
		
		for(int i =0; i < infoMaterial.length; i++) {
			System.out.println(infoMaterial[i]);
		}
				
	}
	

	@Override
	public void consultables() {
		System.out.println("Consultando informacion sobre: " + this.titulo + ".");
		
		
	}

	@Override
	public void mantenible() {
		System.out.println("Mantenimiento sobre: " + this.titulo + ".");

		
	}
	
	
	
	

}
