public class Test1 {

    public int multiplicar(int a, int b) {
        return a * b;
    }

    public int factorial(int numero) {
       if(numero <= 1){
           return 1;
       }
       return numero * factorial(numero -1);
    }
}
