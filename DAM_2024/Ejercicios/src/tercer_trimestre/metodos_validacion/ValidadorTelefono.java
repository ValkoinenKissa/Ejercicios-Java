package tercer_trimestre.metodos_validacion;

public class ValidadorTelefono {
    public static void validar(String telefono) throws ExcepcionValidacion {
        if (telefono == null) {
            throw new ExcepcionValidacion("El teléfono no puede ser null");
        }
        // Validar longitud fija de 9 dígitos y solo dígitos
        if (!telefono.matches("\\d{9}")) {
            throw new ExcepcionValidacion("El teléfono debe tener 9 dígitos");
        }
        // Primer dígito válido: 6,7 o 9
        char primer = telefono.charAt(0);
        if (primer != '6' && primer != '7' && primer != '9') {
            throw new ExcepcionValidacion("El teléfono debe empezar por 6, 7, 8 o 9");
        }
    }
}
