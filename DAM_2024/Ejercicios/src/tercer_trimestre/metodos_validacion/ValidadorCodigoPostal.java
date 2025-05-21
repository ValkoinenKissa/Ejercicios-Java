package tercer_trimestre.metodos_validacion;

public class ValidadorCodigoPostal {
    public static void validar(String cp) throws ExcepcionValidacion {
        if (cp == null) {
            throw new ExcepcionValidacion("El código postal no puede ser null");
        }
        if (!cp.matches("\\d{5}")) {
            throw new ExcepcionValidacion("El código postal debe tener 5 dígitos");
        }

        int valor = Integer.parseInt(cp);
        if (valor < 1000 || valor > 52999) {
            throw new ExcepcionValidacion("El código postal fuera de rango");
        }
    }
}
