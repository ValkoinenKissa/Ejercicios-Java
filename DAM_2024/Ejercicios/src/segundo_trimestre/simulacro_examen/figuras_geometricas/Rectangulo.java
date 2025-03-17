package segundo_trimestre.simulacro_examen.figuras_geometricas;

import java.util.Objects;

/*
1.- Crea las clases Circulo, Rectangulo y Triangulo.  Cada clase definirá el metodo toString que imprimirá por
 pantalla todos sus atributos y el metodo equals que indicará que un objeto es igual a otro, únicamente,
 si son iguales todos sus atributos. (1,5 puntos).

  Circulo tendrá como atributos nombre y radio. Perímetro es 2* Math.PI*radio.

  Rectángulo tendrá como atributos, nombre, longitud de la base y longitud de la altura.
  El perímetro es la suma de la longitud de sus lados.

    Triángulo tendrá como atributos nombre, longitud de los tres lados.
    El perímetro es la suma de la longitud de sus lados.
 */
public class Rectangulo extends Figura2D{
    //Atributos de clase
    private final double longitudBase;
    private final double longitudDeLaAltura;


    //Constructores

    //Se hereda el constructor que recibe el nombre de la clase Figura2D y se incluye nombre en el paso de parametros.

    public Rectangulo(String nombreFigura, double longitudBase, double longitudDeLaAltura) {
        super(nombreFigura);
        this.longitudBase = longitudBase;
        this.longitudDeLaAltura = longitudDeLaAltura;
    }

    //Getters y setters

    @Override
    public void setNombreFigura(String nombreFigura) {
        super.setNombreFigura(nombreFigura);
    }

    @Override
    public String getNombreFigura() {
        return super.getNombreFigura();
    }

    @Override
    public double calcularPerimetro() {
        // El perímetro es la suma de la longitud de sus lados.
        return longitudBase*2 + longitudDeLaAltura*2;
    }

    //To string hereda de forma descendente, asi que cuando se invoca, muestra la info del padre

    @Override
    public String toString() {
        return super.toString() + "Rectangulo{" +
                "longitudBase=" + longitudBase +
                ", longitudDeLaAltura=" + longitudDeLaAltura +
                '}';
    }

    //Metodo equals que nos dice cuando dos objetos de esta instancia son iguales

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Rectangulo that = (Rectangulo) o;
        return Double.compare(longitudBase, that.longitudBase) == 0 && Double.compare(longitudDeLaAltura, that.longitudDeLaAltura) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(longitudBase, longitudDeLaAltura);
    }
}
