package segundo_trimestre.control_excepciones.espacios_en_blanco;

public class ViolacionEspaciosEnBlanco extends RuntimeException {
    public ViolacionEspaciosEnBlanco(String message) {
        super(message);
    }
}
