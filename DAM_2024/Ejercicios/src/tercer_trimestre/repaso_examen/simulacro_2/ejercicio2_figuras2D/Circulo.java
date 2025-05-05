package tercer_trimestre.repaso_examen.simulacro_2.ejercicio2_figuras2D;

import java.util.Objects;

/*
        Circulo tendrá como atributos nombre y radio. Perímetro es 2* Math. PI*radio.

        Rectángulo tendrá como atributos, nombre, longitud de la base y longitud de la altura. El perímetro es la suma de la longitud de sus lados.

        Triángulo tendrá como atributos nombre, longitud de los tres lados. El perímetro es la suma de la longitud de sus lados.
 */
public class Circulo extends Figura2D {
    private final int radio;

    public Circulo(String nombreFigura, int radio) {
        super(nombreFigura);
        this.radio = radio;
    }


    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circulo circulo = (Circulo) o;
        return radio == circulo.radio;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radio);
    }

    @Override
    public String toString() {
        return super.toString() + " Circulo{" +
                "radio=" + radio +
                '}';
    }
}
