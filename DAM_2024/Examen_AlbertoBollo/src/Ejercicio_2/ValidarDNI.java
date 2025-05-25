package Ejercicio_2;

public class ValidarDNI {

    //Construtor vacio
    public ValidarDNI() {
    }

    public void ejecutarValidacion(String dni) {

        //Aqui verificamos que el dni tenga
        // exactamente 8 digitos (la parte numerica + la letra)
        if (dni.length() < 9) {
            throw new InvalidDNIException("El DNI debe de contener exactamente 9 digitos (inlcuida la letra): ");
        }
        // Letra (mayúscula)
        //Con el metodo charAt nos posicionamos en la posicion 8 y obtenemos la letra del DNI como caracter
        //Cada caracter tiene un codigo numerico unicode asigando, por ello podemos utilzar los operadores de mayor y
        //menor para comparar si el caracter es diferente de A o de Z
        if (dni.charAt(8) < 'A' || dni.charAt(8) > 'Z') {
            throw new InvalidDNIException("La letra del DNI debe ser una letra mayúscula: ");
        }
    }
}