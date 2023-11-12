package poo;

public class Uso_Coche {

	public static void main(String[] args) {
		
		Coche opel = new Coche();
		
		opel.establece_color("amarillo");
		
		System.out.println(opel.dime_datos_generales());
		
		System.out.println(opel.ver_color());
		
		opel.configura_asientos("no");
		
		System.out.println(opel.dime_asientos());


	}

}
