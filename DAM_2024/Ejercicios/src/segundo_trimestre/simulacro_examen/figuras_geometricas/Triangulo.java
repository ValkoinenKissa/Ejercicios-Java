package segundo_trimestre.simulacro_examen.figuras_geometricas;
/*
 Triángulo tendrá como atributos nombre, longitud de los tres lados.
    El perímetro es la suma de la longitud de sus lados.
 */

import java.util.Objects;

public class Triangulo extends Figura2D{
    private final double longitudLado;

    public Triangulo(String nombreFigura, double longitudLado) {
        super(nombreFigura);
        this.longitudLado = longitudLado;
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
        return longitudLado * 3;

    }

    @Override
    public String toString() {
        return super.toString() +  "Triangulo{" +
                "longitudLado=" + longitudLado +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triangulo triangulo = (Triangulo) o;
        return Double.compare(longitudLado, triangulo.longitudLado) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(longitudLado);
    }
}
