package experimentos;

public class Resaltado {
    public static void main(String[] args) {
        char caracter = 'A';
        
        // Pintar el carácter en cian utilizando la secuencia de escape ANSI
        String caracterCian = "\u001B[35m" + caracter + "\u001B[0m";
        
        // Imprimir el carácter pintado en cian
        System.out.println("Carácter pintado en cian: " + caracterCian);
    }
}
