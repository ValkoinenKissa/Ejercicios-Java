package biblioteca.material.publicaciones_escritas;

import biblioteca.material.Material;

public class Publicaciones_escritas extends Material {
    protected String editorial;
    protected String idioma;

    public Publicaciones_escritas(int id, String titulo, String fechaPublicacion, String editorial, String idioma) {
        super(id, titulo, fechaPublicacion);
        this.editorial = editorial;
        this.idioma = idioma;
    }

	@Override
	public void detalleMaterial() {
		String [] infoMaterial = {"Identificador: " + String.valueOf(this.id), "Titulo: " +  this.titulo, "Fecha publicacion: " + this.fechaPublicacion, "Editorial: " + this.editorial, "Idioma: " + this.idioma};
		
		for(int i =0; i < infoMaterial.length; i++) {
			System.out.println(infoMaterial[i]);
		}
	}

}
