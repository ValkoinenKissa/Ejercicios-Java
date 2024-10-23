package segundo_trimestre.granja_v2.animales;

public class Animal {
	private double peso;
	private String etiqueta;
	private boolean buenaSalud;
	private final String especie;
	private final double dosisComida;
	public static final String CERDO = "Cerdo";
	public static final String VACA = "Vaca";
	public static final String GALLINA = "Gallina";

	public Animal(int peso, String etiqueta, String especie, int dosisComida) {
		this.peso = peso;
		this.etiqueta = etiqueta;
		this.especie = especie;
		this.dosisComida = dosisComida;
	}

	public double getPeso() {
		return peso;
	}

	public void setEtiqueta(String etiqueta) {
		this.etiqueta = etiqueta;
	}

	public String getEtiqueta() {
		return etiqueta;
	}

	public boolean buenaSalud() {
		return buenaSalud;
	}

	public void setBuenaSalud(boolean buenaSalud) {
		this.buenaSalud = buenaSalud;
	}

	public String getEspecie() {
		return especie;
	}

	public void hacerSonido() {
		System.out.println(etiqueta + " MMMMMM");
	}

	public void comer(boolean eficiente) {
		if (buenaSalud && eficiente)
			peso += (dosisComida / 10);
		else
			peso += (dosisComida / 100);
		
	}

	public void recibirCuidados(boolean experienciaVeterinario) {
		buenaSalud = experienciaVeterinario;
		if (buenaSalud)
			hacerSonido();
	}

	public void producir() {
		hacerSonido();
	}
	
	public void producir(String produccion) {
		System.out.println("Mi nombre es " + etiqueta + " peso" + peso + " kg" + " mi especie es: " + especie
				+ " mi estado de salud es : " + buenaSalud + " y produzco: " + produccion);
	}

}
