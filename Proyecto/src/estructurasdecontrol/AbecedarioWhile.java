package estructurasdecontrol;

public class AbecedarioWhile {

	public static void main(String[] args) 
	{
		char letra = 'a';
		int valor = 'a';
		while (letra <= 'z') {
			System.out.println(letra + "=" + valor);
			letra++;
			valor++;
		}
	}

}
