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
		String [] infoMaterial = {String.valueOf(super.id), super.titulo, super.fechaPublicacion, this.editorial, this.idioma};
		
		for(int i =0; i < infoMaterial.length; i++) {
			System.out.println(infoMaterial[i]);
		}
	}

}
