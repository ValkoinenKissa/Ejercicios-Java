package biblioteca.material.publicaciones_audiovisuales;

import biblioteca.material.interfaces.Consultables;
import biblioteca.material.interfaces.Prestables;

public class DVD extends Publicaciones_Audiovisuales implements Prestables, Consultables {

	protected String[] idiomasDisp;
	protected boolean prestar;

	public DVD(int id, String titulo, String fechaPublicacion, double duraccion, String genero, String [] idiomasDisp, boolean prestar) {
		super(id, titulo, fechaPublicacion, duraccion, genero);
		this.idiomasDisp = idiomasDisp;
		this.prestar = prestar;
	}
	
	public DVD(int id, String titulo, String fechaPublicacion, double duraccion, String genero, String[] idiomasDisp) {
		super(id, titulo, fechaPublicacion, duraccion, genero);
		this.idiomasDisp = idiomasDisp;
	}



	@Override
	public void detalleMaterial() {
		super.detalleMaterial();
		System.out.println("El numero de idiomas disponibles son: " + this.idiomasDisp);
		System.out.println("Esta disponible? " + this.prestar);
		
	}

	@Override
	public void consultables() {
		System.out.println("Consultando informacion sobre: " + this.titulo + "...");
	}

	@Override
	public void prestado() {
		if(!prestar) {
			
			this.prestar = true;
			
			System.out.println("El dvd: " + this.titulo + " ha sido prestado");
			
		}
	}

	@Override
	public void devolver() {
		if(prestar) {
			this.prestar = false;
			
			System.out.println("El dvd: " + this.titulo + " ha sido devuleto");
		}
		
	}

}
