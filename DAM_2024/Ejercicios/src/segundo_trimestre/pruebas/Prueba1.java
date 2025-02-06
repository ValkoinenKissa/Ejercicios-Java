package segundo_trimestre.pruebas;

import java.util.Scanner;

/*
    Usando los métodos correspondientes de la clase Integer y de la clase
    String, realiza un programa que pida un número desde el teclado y
    muestre por pantalla la cantidad de cifras que contiene.
    */
public class Prueba1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un numero para contar cuantos digitos tiene");
        int num = sc.nextInt();
        System.out.println("El numero introducido es: " + num);
        String numStr = Integer.toString(num);
        System.out.println("El numero tiene " + numStr.length() + " digitos");


    }
}
