package biblioteca.material.publicaciones_audiovisuales;

import biblioteca.material.Consultables;
import biblioteca.material.Prestables;

public class DVD extends Publicaciones_Audiovisuales implements Prestables, Consultables {

	int idiomasDisp;

	public DVD(int id, String titulo, String fechaPublicacion, double duraccion, String genero) {
		super(id, titulo, fechaPublicacion, duraccion, genero);
	}

	@Override
	public void detalleMaterial() {
		String[] infoMaterial = { String.valueOf(super.id), super.titulo, super.fechaPublicacion,
				String.valueOf(duraccion), this.genero, String.valueOf(this.idiomasDisp) };

		for (int i = 0; i < infoMaterial.length; i++) {
			System.out.println(infoMaterial[i]);
		}
	}

	@Override
	public void consultables() {
		System.out.println("Consultando informacion sobre: " + super.titulo + ".");
	}

	@Override
	public void prestado() {
		if(!prestadoAun) {
			
		}
	}

}
