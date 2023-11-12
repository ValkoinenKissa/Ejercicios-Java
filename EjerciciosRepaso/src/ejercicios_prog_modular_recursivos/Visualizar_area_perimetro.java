package ejercicios_prog_modular_recursivos;
import java.util.*;
/*
 * Visualice en pantalla el área y perímetro de un rectángulo. Utilice el paso de parámetros por
 * valor y funciones que retornen los resultados.
 */
public class Visualizar_area_perimetro {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Este programa calcula el area y perimetro de un rectangulo");
		System.out.println();
		int altura = introAltura();
		int base = introBase();
		int area = calcArea(base, altura);
		int perimetro = calcPerimetro(base, altura);
		printResultados(area, perimetro);
		
	}
	
	/////////////////////////////////////////////////////////////////////////
	
	public static int introAltura() {
		System.out.println("Introduce la altura de tu rectangulo: ");
		int altura = entrada.nextInt();
		return altura;
	}
	
	//////////////////////////////////////////////////////////////////////////////
	
	
	public static int introBase() {
		System.out.println("Introduce la base de tu rectangulo: ");
		int base = entrada.nextInt();
		return base;
		
}
	
	public static int calcArea(int base, int altura) {
		
		int resultArea = base * altura;
		
		return resultArea;
	}
	
	
	//////////////////////////////////////////////////////////////////////////////////
	
	
	public static int calcPerimetro(int base, int altura) {
		
		int resultPerimetro = base*2 + altura*2;
		
		return resultPerimetro;
	}
	
	/////////////////////////////////////////////////////////////////////////////////////
	
	
	public static void printResultados(int resultArea, int resultPerimetro) {
		
		System.out.println("El area del rectangulo que has introducido es: " + resultArea);
		System.out.println();
		System.out.println("El perimetro del rectangulo que has introducido es: " + resultPerimetro);

		
		
	}
	
}
