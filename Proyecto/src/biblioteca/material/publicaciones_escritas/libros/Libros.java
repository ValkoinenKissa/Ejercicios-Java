package biblioteca.material.publicaciones_escritas.libros;

import biblioteca.material.interfaces.Mantenibles;
import biblioteca.material.interfaces.Prestables;
import biblioteca.material.publicaciones_escritas.Publicaciones_escritas;

public class Libros extends Publicaciones_escritas implements Prestables, Mantenibles {

	protected int numPaginas;
	protected boolean prestado;

	public Libros(int id, String titulo, String fechaPublicacion, String editorial, String idioma, int numPaginas) {
		super(id, titulo, fechaPublicacion, editorial, idioma);
		this.numPaginas = numPaginas;
	}
	

	@Override
	public void detalleMaterial() {
		super.detalleMaterial();
		
        System.out.println("Número de páginas: " + this.numPaginas);
        System.out.println("Prestado: " + this.prestado);
	}


	@Override
	public void mantenible() {
		System.out.println("Los libros son mantenibles");
	}

	@Override
	public void prestado() {
		if (!prestado) {
			this.prestado = true;
			System.out.println("El Libro: " + this.titulo + " ha sido prestado");

		}
	}

	@Override
	public void devolver() {
		
		if(prestado) {
			this.prestado = false;
			System.out.println("El Libro: " + this.titulo + " ha sido devuelto");

		}
		
	}

}
