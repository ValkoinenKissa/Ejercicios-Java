package tercer_trimestre.metodos_validacion;

public class ValidadorDNI {
    public static void validar(String dni) throws ExcepcionValidacion {
        if (dni == null) {
            throw new ExcepcionValidacion("El DNI no puede ser null");
        }

        //Comprobacion de que el dni tiene 9 caracteres + la letra también
        if (dni.length() != 9) {
            throw new ExcepcionValidacion("El DNI debe tener 9 caracteres");
        }

        // Parte numérica
        String numeros = dni.substring(0, 8);
            if (!numeros.matches("\\d{8}")) {
                throw new ExcepcionValidacion("Los primeros 8 caracteres del DNI deben ser números");
            }

        // Letra (mayúscula)
        char letra = dni.charAt(8);
        if (letra < 'A' || letra > 'Z') {
            throw new ExcepcionValidacion("La letra del DNI debe ser una letra mayúscula");
        }
    }
}
