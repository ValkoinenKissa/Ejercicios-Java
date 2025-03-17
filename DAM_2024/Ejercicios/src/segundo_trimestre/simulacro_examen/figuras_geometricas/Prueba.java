package segundo_trimestre.simulacro_examen.figuras_geometricas;

import java.util.ArrayList;

/*
Supongamos que se desea implementar una aplicación para calcular el perímetro de diferentes figuras geométricas.
Las figuras son: círculo, rectángulo y triángulo.

Para ello, se definirá una clase Figura2D, de la que heredarán las figuras anteriores y una interfaz, FiguraGeometrica,
con un metodo para calcular el perímetro que implementará Figura2D.

VAMOS PASO A PASO:

1.- Crea las clases Circulo, Rectangulo y Triangulo.  Cada clase definirá el metodo toString que imprimirá por
 pantalla todos sus atributos y el metodo equals que indicará que un objeto es igual a otro, únicamente,
 si son iguales todos sus atributos. (1,5 puntos).

  Circulo tendrá como atributos nombre y radio. Perímetro es 2* Math.PI*radio.

  Rectángulo tendrá como atributos, nombre, longitud de la base y longitud de la altura.
  El perímetro es la suma de la longitud de sus lados.

    Triángulo tendrá como atributos nombre, longitud de los tres lados.
    El perímetro es la suma de la longitud de sus lados.

2.- Nos hemos dado cuenta de que las tres clases tiene un atributo en común, por lo que creamos una clase, Figura2D,
que tendrá como atributo el nombre de la figura. Modifica las clases anteriores para que hereden de Figura2D.
Recuerda que habrá que modificar algunos métodos para que no se repita código. (0,5 puntos)

3.- Crea la interfaz FiguraGeométrica con el metodo "double calcularPerimetro()".  (0,5 puntos).

4.- Modifica Figura2D para que sea una clase abstracta que implemente FiguraGeométrica y deja el metodo
calcularPerímetro() como abstracto (0,5 puntos).

5.- Modifica las clases círculo, rectángulo y triángulo para que implemente el metodo
calcularPerímetro(). (0,25 puntos).

6.- Crea una clase Prueba que contenga en metodo main.
En ella declara un ArrayList de tipo Figura 2D, que contenga objetos de la clase círculo,
rectángulo y triángulo. Recorre la estructura y muestra por pantalla el nombre y el perímetro de cada figura. (0,25 puntos).
 */
public class Prueba {

    public static void main(String[] args) {
        ArrayList<Figura2D> listaFiguras = new ArrayList<>();

        //Instanciacion de objetos con diferentes atributos

        //Lammada a clase figura 2D para utilizar polimorfismo:

        Figura2D figura;

        //Instanciacion de tres objetos

        figura = new Circulo("Circulo", 3.27);
        listaFiguras.add(figura);
        figura = new Triangulo("Triangulo", 10);
        listaFiguras.add(figura);
        figura = new Rectangulo("Rectangulo", 5, 20);
        listaFiguras.add(figura);

        //Se recorre el arrayList para mostrar los diferentes datos sobre los objetos instanciados

        for (Figura2D f : listaFiguras) {
            double resultadoCalculoPerimetro;
            if (f instanceof Triangulo) {
                System.out.println(f);
                resultadoCalculoPerimetro = f.calcularPerimetro();
                System.out.println("El perimetro del triangulo es: " + resultadoCalculoPerimetro);
                System.out.println();
            }

            if (f instanceof Rectangulo) {
                System.out.println(f);
                resultadoCalculoPerimetro = f.calcularPerimetro();
                System.out.println("El perimetro del rectangulo es: " + resultadoCalculoPerimetro);
                System.out.println();
            }

            if (f instanceof Circulo) {
                System.out.println(f);
                resultadoCalculoPerimetro = f.calcularPerimetro();
                System.out.println("El perimetro del circulo es: " + resultadoCalculoPerimetro);
                System.out.println();
            }
        }

    }
}
