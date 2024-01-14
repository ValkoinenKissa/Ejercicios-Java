package biblioteca.material.publicaciones_audiovisuales;

import biblioteca.material.Consultables;
import biblioteca.material.Prestables;

public class DVD extends Publicaciones_Audiovisuales implements Prestables, Consultables {

	protected int idiomasDisp;
	protected boolean prestar;

	public DVD(int id, String titulo, String fechaPublicacion, double duraccion, String genero, int idiomasDisp, boolean prestar) {
		super(id, titulo, fechaPublicacion, duraccion, genero);
		this.idiomasDisp = idiomasDisp;
		this.prestar = prestar;
	}
	
	public DVD(int id, String titulo, String fechaPublicacion, double duraccion, String genero, int idiomasDisp) {
		super(id, titulo, fechaPublicacion, duraccion, genero);
		this.idiomasDisp = idiomasDisp;
	}

	@Override
	public void detalleMaterial() {
		String[] infoMaterial = { String.valueOf(this.id), this.titulo, this.fechaPublicacion,
				String.valueOf(duraccion), this.genero, String.valueOf(this.idiomasDisp) };

		for (int i = 0; i < infoMaterial.length; i++) {
			System.out.println(infoMaterial[i]);
		}
	}

	@Override
	public void consultables() {
		System.out.println("Consultando informacion sobre: " + this.titulo + "...");
	}

	@Override
	public void prestado() {
		if(!prestar) {
			
			this.prestar = true;
			
			System.out.println("El dvd: " + this.getTitulo() + " ha sido prestado");
			
		}
	}

	@Override
	public void devolver() {
		if(prestar) {
			this.prestar = false;
			
			System.out.println("El dvd: " + this.getTitulo() + " ha sido devuleto");
		}
		
	}

}
