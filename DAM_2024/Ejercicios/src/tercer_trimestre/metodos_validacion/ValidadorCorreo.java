package tercer_trimestre.metodos_validacion;

public class ValidadorCorreo {
    public static void validar(String correo) throws ExcepcionValidacion {
        if (correo == null) {
            throw new ExcepcionValidacion("El correo no puede ser null");
        }

        int arroba = correo.indexOf('@');
        int ultimoPunto = correo.lastIndexOf('.');

        if (arroba <= 0) { // no tiene @ o está al inicio
            throw new ExcepcionValidacion("Correo debe contener '@' y no estar al inicio");
        }

        if (ultimoPunto < arroba + 2) { // el punto debe ir al menos dos caracteres después de '@'
            throw new ExcepcionValidacion("Correo debe tener un '.' después del '@'");
        }

        if (ultimoPunto == correo.length() - 1) { // el punto no puede ser el último
            throw new ExcepcionValidacion("El correo no puede terminar con '.'");
        }
    }
}
