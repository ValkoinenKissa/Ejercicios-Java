package experimentos;
import java.util.Scanner;
public class Peso_Ideal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int genero;
		
		do {
			System.out.println("Introduce tu genero (1-Hombre, 2-Mujer)");
			genero = sc.nextInt();
		}while(genero != 1 && genero != 2);
		
		System.out.println("Introduce tu altura en cm");
		int altura = sc.nextInt();
		
		int pesoIdeal = 0;
		
		if(genero == 1) {
			pesoIdeal=altura-110;
		}
		if(genero == 2) {
			pesoIdeal = altura-120;
		}
		
		System.out.println("Tu peso ideal es de " + pesoIdeal + " kg");
		
		sc.close();
	}

}
