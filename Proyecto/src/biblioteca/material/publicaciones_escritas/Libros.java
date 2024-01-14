package biblioteca.material.publicaciones_escritas;

import biblioteca.material.Mantenibles;
import biblioteca.material.Prestables;

public class Libros extends Publicaciones_escritas implements Prestables, Mantenibles {

	protected int numPaginas;
	protected boolean prestado;

	public Libros(int id, String titulo, String fechaPublicacion, String editorial, String idioma, int numPaginas) {
		super(id, titulo, fechaPublicacion, editorial, idioma);
		this.numPaginas = numPaginas;
	}

	@Override
	public void detalleMaterial() {
		String[] infoMaterial = { String.valueOf(this.id), this.titulo, this.fechaPublicacion, this.editorial,
				this.idioma, String.valueOf(this.numPaginas) };

		for (int i = 0; i < infoMaterial.length; i++) {
			System.out.println(infoMaterial[i]);
		}
	}

	@Override
	public void mantenible() {
		System.out.println("Los libros son mantenibles");
	}

	@Override
	public void prestado() {
		if (!prestado) {
			this.prestado = true;
			System.out.println("El Libro: " + super.getTitulo() + " ha sido prestado");

		}
	}

	@Override
	public void devolver() {
		
		if(prestado) {
			this.prestado = false;
			System.out.println("El Libro: " + super.getTitulo() + " ha sido devuelto");

		}
		
	}

}
