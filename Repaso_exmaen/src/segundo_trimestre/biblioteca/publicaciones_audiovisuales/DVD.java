package segundo_trimestre.biblioteca.publicaciones_audiovisuales;

import segundo_trimestre.biblioteca.interfaces.Consultables;
import segundo_trimestre.biblioteca.interfaces.Prestables;

public class DVD extends Publicacion_audiovisual implements Prestables, Consultables{
	private int idiomasDisp;

	public DVD(int id, String titulo, int annoPublicacion, double duraccion, String genero, int idiomasDisp) {
		super(id, titulo, annoPublicacion, duraccion, genero);
		this.idiomasDisp = idiomasDisp;
	}

	public int getIdiomasDisp() {
		return idiomasDisp;
	}

	public void setIdiomasDisp(int idiomasDisp) {
		this.idiomasDisp = idiomasDisp;
	}

	@Override
	public void Consultar() {
		System.out.println("Consultando la info sobre el DVD...");
		detalleMaterial();
		
	}

	@Override
	public void prestar() {
		System.out.println("Se esta prestando.. " + this.getId() + " " + this.getTitulo());
	}

	@Override
	public void detalleMaterial() {
		super.detalleMaterial();
		System.out.println("El numero de idiomas disponible en el DVD es de: " + idiomasDisp);
	}
	
	

}
