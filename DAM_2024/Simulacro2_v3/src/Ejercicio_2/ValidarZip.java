package Ejercicio_2;

public class ValidarZip {

    protected void validarCodigoPostal(String zip) throws InvalidZipException{
        //Comprobacion de nulos
        if (zip == null){
            throw new InvalidZipException("El codigo postal no puede ser nulo ni estar vacio");
        }

        //Comprobacion de que exactamente el CP tenga 5 digitos
        if (!zip.matches("\\d{5}")) {
            throw new InvalidZipException("El codigo postal no puede tener menos o mas de 5 digitos");
        }

        //Rango CP madrid
        if (Integer.parseInt(zip) < 28001 || Integer.parseInt(zip) > 28999){
            throw new InvalidZipException("El codigo postal debe de ser de la C. de Madrid (28001 a 28999)");
        }
    }
}