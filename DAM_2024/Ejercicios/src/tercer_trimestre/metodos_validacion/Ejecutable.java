package tercer_trimestre.metodos_validacion;

public class Ejecutable {
    public static void main(String[] args){
        try {
            ValidadorTelefono.validar("612345678");
            ValidadorDNI.validar("12345678Z");
            ValidadorCodigoPostal.validar("28080");
            ValidadorCorreo.validar("ejemplo@correo.com");
            System.out.println("Validación correcta.");
        } catch (ExcepcionValidacion e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
