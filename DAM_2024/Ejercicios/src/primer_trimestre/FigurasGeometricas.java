package primer_trimestre;

import java.util.Scanner;

/*
 *Calcula el área y perímetro de una de las siguientes figuras.
 *La aplicación pregunta al usuario qué figura quiere calcular el área y el perímetro.
 *Dichas figuras son el cuadrado, rectángulo y triángulo.
 *Una vez el usuario indica qué figura se calcula el área y el perímetro de dicha figura y el programa termina.
 */
public class FigurasGeometricas {
    public static void main(String[] args) {
        //Declaración de variables y scaner
        Scanner sc = new Scanner(System.in);
        double base, altura, lado, area, perimetro, ladoA, ladoB, ladoC;
        String opcion;
        //Variable control bucle
        boolean stop = false;
        //Bucle do-while siempre se ejecuta al menos una vez para la aparición del menu
        do {
            System.out.println("Indica la figura para calcular el área y el perímetro:");
            System.out.println("Escribe 'SALIR' para finalizar el programa.");
            System.out.println("Opciones: CUADRADO, RECTANGULO, TRIANGULO, SALIR");
            System.out.println();
            System.out.println("CUADRADO");
            System.out.println("RECTANGULO");
            System.out.println("TRIANGULO");
            System.out.println("SALIR");
            opcion = sc.nextLine();
            opcion = opcion.toUpperCase();


            //Comprobación entrada usuario

            if (opcion.equals("CUADRADO") || opcion.equals("RECTANGULO") || opcion.equals("TRIANGULO")) {
                //Menu de opciones
                switch (opcion) {
                    case "CUADRADO":
                        System.out.println("Ingrese la longitud del lado del cuadrado (en cm): ");
                        lado = sc.nextDouble();
                        //Limpieza de buffer para excluir el caracter de espace \n y así no provocar errores de entrada
                        sc.nextLine();
                        //Clase Math, clase estatica no necesita instanciar, metodo para realizar la potencia
                        area = Math.pow(lado, 2);
                        perimetro = 4 * lado;
                        System.out.println("El area del cuadrado es: " + area + " cm");
                        System.out.println("El perimetro del cuadrado es: " + perimetro + " cm");
                        break;

                    case "RECTANGULO":
                        System.out.println("Ingrese la longitud de la base del rectangulo (en cm): ");
                        base = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Introduce la altura del rectangulo (en cm): ");
                        altura = sc.nextDouble();
                        sc.nextLine();
                        area = base * altura;
                        perimetro = 2 * (base + altura);
                        System.out.println("El area del rectangulo es: " + area + " cm");
                        System.out.println("El perimetro del rectangle es: " + perimetro + " cm");
                        break;

                    case "TRIANGULO":
                        System.out.println("Ingrese la longitud de la base del triangulo (en cm): ");
                        base = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Introduce la altura del triangulo (en cm): ");
                        altura = sc.nextDouble();
                        sc.nextLine();
                        area = (base * altura) / 2;
                        System.out.println("Introduce el lado A del triangulo (en cm): ");
                        ladoA = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Introduce el lado B del triangulo (en cm): ");
                        ladoB = sc.nextDouble();
                        sc.nextLine();
                        System.out.println("Introduce el lado C del triangulo (en cm): ");
                        ladoC = sc.nextDouble();
                        sc.nextLine();
                        perimetro = ladoA + ladoB + ladoC;
                        System.out.println("El area del triangulo es: " + area + " cm");
                        System.out.println("El perimetro del triangulo es: " + perimetro + " cm");
                        System.out.println();
                        break;
                }
            } else if (opcion.equals("SALIR")) {
                System.out.println("Se ha finalizado el programa");
                stop = true;

            } else {
                System.err.println("La opción introducida no es valida, por favor revisala");
            }

        } while (!stop);
    }
}