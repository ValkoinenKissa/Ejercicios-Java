package tienda_electronica.dispositivos;

import tienda_electronica.Productos_electronicos;

public class TelefonoMovil extends Productos_electronicos {
	private int tamanoPantalla;
	private String versionSO;

	public TelefonoMovil(String marca, String modelo, double precioProducto, boolean encendidoDispositivo,
			int tamanoPantalla, String versionSO) {
		super(marca, modelo, precioProducto, encendidoDispositivo);
		this.tamanoPantalla = tamanoPantalla;
		this.versionSO = versionSO;
	}

	public int getTamanoPantalla() {
		return tamanoPantalla;
	}

	public void setTamanoPantalla(int tamanoPantalla) {
		this.tamanoPantalla = tamanoPantalla;
	}

	public String getVersionSO() {
		return versionSO;
	}

	public void setVersionSO(String versionSO) {
		this.versionSO = versionSO;
	}

	@Override
	public String mostarInformacion() {
		return super.mostarInformacion() + " tamaño pantalla telefono: " + tamanoPantalla + " la version del S.O es: "
				+ versionSO;
	}

	@Override
	public void encenderDispositivo() {
		this.setEncendidoDispositivo(true);
		System.out.println("El dispositivo " + this.getModelo() + " ha sido encendido...");

	}

	@Override
	public void apagarDispositivo() {
		this.setEncendidoDispositivo(false);
		System.out.println("El dispositivo " + this.getModelo() + " ha sido apagado...");

	}

}
