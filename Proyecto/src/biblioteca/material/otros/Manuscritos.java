package biblioteca.material.otros;

import biblioteca.material.Consultables;
import biblioteca.material.Mantenibles;
import biblioteca.material.Material;

public class Manuscritos extends Material implements Consultables, Mantenibles {

	public Manuscritos(int id, String titulo, String fechaPublicacion) {
		super(id, titulo, fechaPublicacion);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void detalleMaterial() {
		String[] infoMaterial = { String.valueOf(super.id), super.titulo, super.fechaPublicacion };

		for (int i = 0; i < infoMaterial.length; i++) {
			System.out.println(infoMaterial[i]);
		}
	}

	@Override
	public void mantenible() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultables() {
		// TODO Auto-generated method stub
		
	}

}
