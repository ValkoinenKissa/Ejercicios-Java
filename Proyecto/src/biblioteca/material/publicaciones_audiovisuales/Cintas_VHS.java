package biblioteca.material.publicaciones_audiovisuales;

import biblioteca.material.interfaces.Consultables;
import biblioteca.material.interfaces.Mantenibles;

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
		super.detalleMaterial();
		System.out.println("La calidad de imagen es buena?: " + this.calidadImagen);
		System.out.println("Durabilidad del 1 al 10: " + this.durabilidad);
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
