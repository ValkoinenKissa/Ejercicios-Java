package segundo_trimestre.simulacro_examen.figuras_geometricas;

/*
2.- Nos hemos dado cuenta de que las tres clases tiene un atributo en común, por lo que creamos una clase, Figura2D,
que tendrá como atributo el nombre de la figura. Modifica las clases anteriores para que hereden de Figura2D.
Recuerda que habrá que modificar algunos métodos para que no se repita código. (0,5 puntos)

4.- Modifica Figura2D para que sea una clase abstracta que implemente FiguraGeométrica y deja el metodo
calcularPerímetro() como abstracto (0,5 puntos).

5.- Modifica las clases círculo, rectángulo y triángulo para que implemente el metodo
calcularPerímetro(). (0,25 puntos).


 */
public abstract class Figura2D implements FiguraGeometrica{
    private String nombreFigura;


    public Figura2D(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    public String getNombreFigura() {
        return nombreFigura;
    }

    public void setNombreFigura(String nombreFigura) {
        this.nombreFigura = nombreFigura;
    }

    @Override
    public String toString() {
        return "Figura2D{" +
                "nombreFigura='" + nombreFigura + '\'' +
                '}';
    }

    @Override
    public abstract double calcularPerimetro();

}
