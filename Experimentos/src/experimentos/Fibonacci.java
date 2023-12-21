package experimentos;
/**
 * @author alberto bollo
 * @since 18/10/2023
 */

/*
 * Este programa tratara de obtener la sucesion de los primeros 25
 * numeros de la serie Fibonacci
 * Formula general n = n-1 + n-2
 */

public class Fibonacci {

    public static void main(String[] args) {
    	 
        int num1 = 0, num2 = 1, suma = 1;
 
         
        for (int i = 1; i < 25; i++) {
             
            // muestro la suma
            System.out.print(suma + " ");
             
            //primero sumamos
            suma = num1 + num2;
            //Despues, cambiamos la segunda variable por la primera
            num1 = num2;
            //Por ultimo, cambiamos la suma por la segunda variable
            num2 = suma;
             
             
        }
    }
 

}
