package biblioteca.material.publicaciones_escritas;

import biblioteca.material.Mantenibles;
import biblioteca.material.Prestables;

public class Libros extends Publicaciones_escritas implements Prestables, Mantenibles {

	protected int numPaginas;

	public Libros(int id, String titulo, String fechaPublicacion, String editorial, String idioma, int numPaginas) {
		super(id, titulo, fechaPublicacion, editorial, idioma);
		this.numPaginas = numPaginas;
	}

	@Override
	public void detalleMaterial() {
		String[] infoMaterial = { String.valueOf(super.id), super.titulo, super.fechaPublicacion, super.editorial,
				super.idioma, String.valueOf(this.numPaginas) };

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
	}

}
