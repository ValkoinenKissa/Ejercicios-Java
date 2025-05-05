package ejercicio2;

public class InvalidZipCode extends RuntimeException {
    public InvalidZipCode(String message) {
        super(message);
    }
}
