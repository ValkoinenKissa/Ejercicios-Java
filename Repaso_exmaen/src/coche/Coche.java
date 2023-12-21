package coche;
public class Coche {
	
	private final int numRuedas=4;	
	private final int numPuertas=5;	
	
	
	private String matricula;
	private int potencia;
	private String color;
	
	private boolean hibrido;
	
	private int combustible;
	private int kilometraje;
	
	public Coche() {
		matricula="";
		potencia=0;
		color="Blanco";
		hibrido=true;
		combustible = 0 ;
		kilometraje = 0;
	}
	public Coche (String matricula,int potencia) {
		this.matricula=matricula;
		this.potencia=potencia;
		color="Blanco";
		hibrido=true;
		combustible = 0 ;
		kilometraje = 0;
	}
	public Coche (String matricula,int potencia,String color,boolean hibrido) {
		this.matricula=matricula;
		this.potencia=potencia;
		this.color=color;
		this.hibrido=hibrido;
		combustible = 0 ;
		kilometraje = 0;	
	}
	public int getCombustible() {
		return combustible;
	}
	public String aString() {
		
		String esHibrido=" es híbrido";
		if(!hibrido) {
			esHibrido=" no es híbrido";
		}
		String resultado = "Matricula: "+matricula+" Potencia: "+potencia+" Color: "+color
				+esHibrido;
		return resultado;
	}
	
	public boolean arrancar() {
		boolean arrancado=false;
		if(combustible > 0) {
			combustible--;
			if(potencia < 100) {
				System.out.println("brumbrum");
			}else {
				System.out.println("BRUMMMMMBRUMMMMMMM");
			}
			arrancado=true;
		}
		return arrancado;
			
	}
	public boolean repostar(int gas) {
		int gasMax=100;
		if(hibrido) {
			gasMax=50;
		}
		if(combustible+gas>gasMax) {
			System.out.println("El depósito no admite tanto combustible");
			return false;
		}else {
			combustible = combustible + gas;
			return true;
		}
	}
	
	public void recorrer(int distancia) {
		
		if(hibrido) {
			
			
		}else {
			
		}
	}
	

}