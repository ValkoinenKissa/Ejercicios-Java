package tercer_trimestre.repaso_examen.simulacro_2.ejercicio2_figuras2D;

import java.util.Objects;

/*
 Rectángulo tendrá como atributos, nombre, longitud de la base y longitud de la altura. El perímetro es la suma de la longitud de sus lados.

 */
public class Rectangulo extends Figura2D {
    private final double longitudBase;
    private final double longitudAltura;

    public Rectangulo(String nombreFigura, double longitudBase, double longitudAltura) {
        super(nombreFigura);
        this.longitudBase = longitudBase;
        this.longitudAltura = longitudAltura;
    }

    @Override
    public double calcularPerimetro() {
        return longitudBase*2 + longitudAltura*2;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangulo that = (Rectangulo) o;
        return Double.compare(longitudBase, that.longitudBase) == 0 && Double.compare(longitudAltura, that.longitudAltura) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), longitudBase, longitudAltura);
    }

    @Override
    public String toString() {
        return super.toString() + " Rectangulo{" +
                "longitudBase=" + longitudBase +
                ", longitudAltura=" + longitudAltura +
                '}';
    }
}
