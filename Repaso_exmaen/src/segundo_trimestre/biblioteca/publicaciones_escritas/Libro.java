package segundo_trimestre.biblioteca.publicaciones_escritas;

import segundo_trimestre.biblioteca.interfaces.Consultables;
import segundo_trimestre.biblioteca.interfaces.Mantenibles;
import segundo_trimestre.biblioteca.interfaces.Prestables;

public class Libro  extends Publicacion_escrita implements Prestables, Consultables, Mantenibles{
	
	private int numPaginas;

	public Libro(int id, String titulo, int annoPublicacion, String editorial, String idioma, int numPaginas) {
		super(id, titulo, annoPublicacion, editorial, idioma);
		this.numPaginas = numPaginas;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	@Override
	public void detalleMaterial() {
		super.detalleMaterial(); 
		System.out.println(" el numero de pags del libro son: " + numPaginas);
	}

	@Override
	public void mantenimiento() {
		System.out.println("Se esta aplicando el mantenimiento a: " + this.getId() + " " + this.getTitulo());
		
	}

	@Override
	public void Consultar() {
		System.out.println("Consultando informacion del libro....");
		detalleMaterial();
		
	}

	@Override
	public void prestar() {
		System.out.println("Se esta prestando.. " + this.getId() + " " + this.getTitulo());
	}
	
	

}
