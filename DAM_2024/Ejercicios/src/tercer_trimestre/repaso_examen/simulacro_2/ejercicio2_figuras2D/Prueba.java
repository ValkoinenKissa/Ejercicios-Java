package tercer_trimestre.repaso_examen.simulacro_2.ejercicio2_figuras2D;

import java.util.ArrayList;

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

3.- Crea la interfaz FiguraGeométrica con el metodo "double calcularPerimetro()".  (0,5 puntos).

4.- Modifica Figura2D para que sea una clase abstracta que implemente FiguraGeométrica y deja el metodo calcularPerímetro() como abstracto (0,5 puntos).

5.- Modifica las clases círculo, rectángulo y triángulo para que implemente el metodo calcularPerímetro(). (0,25 puntos).

6.- Crea una clase Prueba que contenga en el main. En ella declara un ArrayList de tipo Figura 2D,
que contenga objetos de la clase círculo, rectángulo y triángulo.
Recorre la estructura y muestra por pantalla el nombre y el perímetro de cada figura. (0,25 puntos)
 */
public class Prueba {
    public static void main(String[] args) {
        ArrayList<Figura2D> figuras = new ArrayList<>();
        Circulo c = new Circulo("Circulo", 5);
        figuras.add(c);
        Rectangulo r = new Rectangulo("Rectangulo", 5, 10);
        figuras.add(r);
        Triangulo t = new Triangulo("Triangulo", 10, 5, 5);
        figuras.add(t);

        for (Figura2D f : figuras) {
            double perimetro;
            if (f instanceof Triangulo) {
                perimetro = f.calcularPerimetro();
                System.out.println("El perimtero del triangulo es: " + perimetro);
                System.out.println(f);
            }

            if (f instanceof Rectangulo) {
                perimetro = f.calcularPerimetro();
                System.out.println("El perimtero del Rectangulo es: " + perimetro);
                System.out.println(f);
            }

            if (f instanceof Circulo) {
                perimetro = f.calcularPerimetro();
                System.out.println("El perimtero del Circulo es: " + perimetro);
                System.out.println(f);
            }
        }

    }
}
