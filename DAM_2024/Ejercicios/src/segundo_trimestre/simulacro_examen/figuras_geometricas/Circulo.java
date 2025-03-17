package segundo_trimestre.simulacro_examen.figuras_geometricas;

import java.util.Objects;

/*
.- Crea las clases Circulo, Rectangulo y Triangulo.  Cada clase definirá el metodo toString que imprimirá por
 pantalla todos sus atributos y el metodo equals que indicará que un objeto es igual a otro, únicamente,
 si son iguales todos sus atributos. (1,5 puntos).

  Circulo tendrá como atributos nombre y radio. Perímetro es 2* Math.PI*radio.
 */
public class Circulo extends Figura2D{
    //Ya que no hay getters y setters este atributo se establece como final para ser modificado solo por getters y setters
    private final double radio;

    //Se hereda el constructor que recibe el nombre de la clase Figura2D y se incluye nombre en el paso de parametros.

    public Circulo(String nombreFigura, double radio) {
        super(nombreFigura);
        this.radio = radio;
    }

    @Override
    public String getNombreFigura() {
        return super.getNombreFigura();
    }

    @Override
    public void setNombreFigura(String nombreFigura) {
        super.setNombreFigura(nombreFigura);
    }

    @Override
    public double calcularPerimetro() {
        //Perímetro es 2* Math.PI*radio.
        return 2*Math.PI*radio;
    }

    @Override
    public String toString() {
        return super.toString() + "Circulo{" +
                "radio=" + radio +
                '}';
    }

    //Metodo equals que nos dice cuando dos objetos de esta instancia son iguales
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Circulo circulo = (Circulo) o;
        return Double.compare(radio, circulo.radio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(radio);
    }
}
