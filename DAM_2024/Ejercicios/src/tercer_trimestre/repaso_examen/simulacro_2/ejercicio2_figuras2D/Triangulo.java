package tercer_trimestre.repaso_examen.simulacro_2.ejercicio2_figuras2D;

import java.util.Objects;

/*
 Triángulo tendrá como atributos nombre, longitud de los tres lados. El perímetro es la suma de la longitud de sus lados.
 */
public class Triangulo extends Figura2D {
    private final double longitudLado1;
    private final double longitudLado2;
    private final double longitudLado3;

    public Triangulo(String nombreFigura, double longitudLado1, double longitudLado2, double longitudLado3) {
        super(nombreFigura);
        this.longitudLado1 = longitudLado1;
        this.longitudLado2 = longitudLado2;
        this.longitudLado3 = longitudLado3;
    }

    @Override
    public double calcularPerimetro() {
        return (longitudLado1 + longitudLado2 + longitudLado3);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Triangulo triangulo = (Triangulo) o;
        return Double.compare(longitudLado1, triangulo.longitudLado1) == 0 && Double.compare(longitudLado2, triangulo.longitudLado2) == 0 && Double.compare(longitudLado3, triangulo.longitudLado3) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), longitudLado1, longitudLado2, longitudLado3);
    }

    @Override
    public String toString() {
        return super.toString() + " Triangulo{" +
                "longitudLado1=" + longitudLado1 +
                ", longitudLado2=" + longitudLado2 +
                ", longitudLado3=" + longitudLado3 +
                '}';
    }
}
