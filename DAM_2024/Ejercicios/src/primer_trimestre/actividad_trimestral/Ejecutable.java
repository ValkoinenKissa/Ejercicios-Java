package primer_trimestre.actividad_trimestral;

import java.util.Scanner;

/*
CALCULAR EL SUELDO DE UN TRABAJADOR
Crea una aplicación que permite calcular salario que recibe un trabajador cada mes,
a partir de las horas trabajadas en la semana y la clase a la que pertenece:

Trabajadores de clase “A”, se les paga 25 euros por hora.

Trabajadores de clase “B”, se paga 20 euros por hora.

Trabajadores de clase “C”, se les paga 15 euros por hora y

Trabajadores de clase “D”, 10 euros por hora.
Utiliza constantes para definir las clases de trabajadores.
El usuario final de la aplicación debe ingresar el número de horas trabajadas e indicar
la clase a la que pertenece dicho trabajador.

También se le debe retener un 15% de IRPF, si su salario no supera los 1200€ o un 20% si supera los 1200€
La aplicación termina cuando el usuario lo indique. (bucle)
 */
public class Ejecutable {
    public static void main(String[] args) {

        //Declaración de constantes, variables y scanner

        Scanner sc = new Scanner(System.in);
        final int TRABAJADORES_CLASE_A = 25;
        final int TRABAJADORES_CLASE_B = 20;
        final int TRABAJADORES_CLASE_C = 15;
        final int TRABAJADORES_CLASE_D = 10;
        final double RETENCION_FISCAL_BASE = 15;
        final double RETENCION_FISCAL_AMPLIADA = 20;

        double horasTrabajadas, salarioFinal, retencionFiscal, retencionAplicada;
        boolean stop = false;
        char clase, decision;
        System.out.println();
        System.out.println("Hola usuario, introduce las horas y clase del trabajador, para calcular su salario");
        System.out.println("No se diferencia entre mayusculas y minusculas.");
        System.out.println("Clases disponibles:");
        System.out.println("A: 25€/hora | B: 20€/hora | C: 15€/hora | D: 10€/hora\n");

        do {

            System.out.println("Introduce las horas mesuales efectuadas por el trabajador.");
            System.out.println("recuerda que las horas cotizadas de forma ordinaria no pueden superar las 160H mensuales.");


            do {

                System.out.print("Introduce las horas trabajadas: ");
                horasTrabajadas = sc.nextDouble();

                if (horasTrabajadas > 160) {
                    System.out.println("Las horas introducidas no pueden ser mayor que 160H, intentalo de nuevo.");

                } else {
                    System.out.println("Las horas han sido registradas correctamente en el sistema. \n");
                }

            } while (horasTrabajadas > 160);

            System.out.println("Ahora introduce la clase a la que pertenetce el trabajador cuyas horas trabajadas son:" +
                    " " + horasTrabajadas);

            while (true) {

                System.out.print("Introduce la categoría del trabajador (A, B, C, D): ");

                clase = sc.next().toUpperCase().charAt(0);
                switch (clase) {
                    case 'A':
                        salarioFinal = horasTrabajadas * TRABAJADORES_CLASE_A;
                        break;
                    case 'B':
                        salarioFinal = horasTrabajadas * TRABAJADORES_CLASE_B;
                        break;
                    case 'C':
                        salarioFinal = horasTrabajadas * TRABAJADORES_CLASE_C;
                        break;
                    case 'D':
                        salarioFinal = horasTrabajadas * TRABAJADORES_CLASE_D;
                        break;
                    default:
                        System.out.println("La categoria del trabajador no exixte, introducela de nuevo.");
                        continue;
                }
                break;
            }


            if (salarioFinal > 1200) {
                retencionFiscal = (salarioFinal * RETENCION_FISCAL_AMPLIADA) / 100;
                retencionAplicada = RETENCION_FISCAL_AMPLIADA;

            } else {
                retencionFiscal = (salarioFinal * RETENCION_FISCAL_BASE) / 100;
                retencionAplicada = RETENCION_FISCAL_BASE;

            }
            salarioFinal -= retencionFiscal;

            System.out.println("\n======= RESULTADO =======");
            System.out.println("Horas trabajadas: " + horasTrabajadas);
            System.out.println("Clase del trabajador: " + clase);
            System.out.println("Salario bruto: " + (salarioFinal + retencionFiscal) + "€");
            System.out.println("Retención aplicada: " + retencionAplicada + "% (" + retencionFiscal + "€)");
            System.out.println("Salario neto: " + salarioFinal + "€");
            System.out.println("=========================\n");

            do {

                System.out.println("¿Quieres seguir calculando salarios o deseas salir del programa?" +
                        " (Introduce 'S' para continuar o 'N' para finalizar el programa");
                decision = sc.next().toUpperCase().charAt(0);

                if (decision == 'N') {
                    stop = true;
                    System.out.println("Programa finalizado correctamente, ¡Hasta pronto!");
                } else if (decision == 'S') {

                    System.out.println("Has decidido continuar");
                } else {
                    System.out.println("La opción que has introducido no es valida, prueba de nuevo");
                }

            } while (decision != 'N' && decision != 'S');


        } while (!stop);

        sc.close();
    }
}
