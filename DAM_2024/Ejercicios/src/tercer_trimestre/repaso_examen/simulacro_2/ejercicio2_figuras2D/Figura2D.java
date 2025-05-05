package tercer_trimestre.repaso_examen.simulacro_2.ejercicio2_figuras2D;

import java.util.Objects;

/*
1.- Crea las clases Circulo, Rectangulo y Triangulo.  Cada clase definirá el metodo toString que imprimirá por pantalla
 todos sus atributos y el metodo equals que indicará que un objeto es igual a otro, únicamente,
 si son iguales todos sus atributos. (1,5 puntos).

        Circulo tendrá como atributos nombre y radio. Perímetro es 2* Math. PI*radio.

        Rectángulo tendrá como atributos, nombre, longitud de la base y longitud de la altura. El perímetro es la suma de la longitud de sus lados.

        Triángulo tendrá como atributos nombre, longitud de los tres lados. El perímetro es la suma de la longitud de sus lados.

2.- Nos hemos dado cuenta de que las tres clases tiene un atributo en común, por lo que creamos una clase, Figura2D,
que tendrá como atributo el nombre de la figura. Modifica las clases anteriores para que hereden de Figura2D.
Recuerda que habrá que modificar algunos métodos para que no se repita código. (0,5 puntos)
 */
public abstract class Figura2D implements FiguraGeometrica {
   private final String nombreFigura;

    public Figura2D(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    @Override
    public abstract double calcularPerimetro();

    @Override
    public String toString() {
        return "Figura2D{" +
                "nombreFigura='" + nombreFigura + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Figura2D figura2D = (Figura2D) o;
        return Objects.equals(nombreFigura, figura2D.nombreFigura);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nombreFigura);
    }
}
