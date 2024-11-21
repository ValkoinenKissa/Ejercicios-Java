package primer_trimestre;

import java.util.Scanner;

/*
1.- Realiza un programa que permite realizar las siguientes tareas:

a.- Dado un número por teclado debe indicar si es par o impar.

b.- Elaborar un programa para calcular el sueldo de un trabajador, a partir de las horas trabajadas en la semana y
la clase a la que pertenece:

Trabajadores de clase “A”, se les paga 25 euros por hora.
Trabajadores de clase “B”, se paga 20 euros por hora.
Trabajadores de clase “C”, se les paga 15 euros por hora y
Trabajadores de clase “D”, 10 euros por hora.
Ingresar el número de horas trabajadas y la clase a la que pertenece, y a continuación, devuelve el sueldo del trabajador.
Debes de usar constantes para cada clase.

c.- Escribe un programa que calcule el precio final de un producto según su base imponible (precio antes de impuestos),
el tipo de IVA aplicado (general, reducido o superreducido) y el código promocional. Los tipos de IVA general, reducido
y superreducido son del 21%, 10% y 4% respectivamente.

Los códigos promocionales pueden ser nopro, mitad, meno5 o 5porc que significan, respectivamente,
que no se aplica promoción, el precio se reduce a la mitad, se descuentan 5 euros o se descuenta el 5%.

Ejemplo:
      Introduzca la base imponible: 25
      Introduzca el tipo de IVA (general, reducido o superreducido): reducido
      Introduzca el código promocional (nopro, mitad, meno5 o 5porc): mitad
      Base imponible        25.00
      IVA (10%)              2.50
      Precio con IVA        27.50
      Cód. promo. (mitad): -13.75
      TOTAL                 13.75


 */
public class EjerciciosMenuSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Primera fase del ejercicio (A)
        int num;
        System.out.println("Introduce un numero por tecaldo para comprobar si es par o impar: ");
        num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("El numero es par!!");

        } else {
            System.out.println("El numero es impar!!");
        }
        System.out.println();

        //Segunda fase del ejercicio (B)

        //Clase de trabajadores

        final int TRABAJADORES_CLASE_A = 25;
        final int TRABAJADORES_CLASE_B = 20;
        final int TRABAJADORES_CLASE_C = 15;
        final int TRABAJADORES_CLASE_D = 10;

        int horasTrabajadas;
        int salarioFinal;
        boolean stop = false;
        char clase;

        System.out.println("Hola usuario, introduce las horas y clase del trabajador, para calcular su salario");
        System.out.println("Para introducir la clase utiliza solo el caracter de la misma, por ejemplo:");
        System.out.println("para los trabajadores de la clase A, solo debes de introducir la 'A'");
        System.out.println("No se diferencia entre mayusculas y minusculas");
        System.out.println();
        System.out.println("Trabajadores clase A 25/hora");
        System.out.println("Trabajadores clase B 20/hora");
        System.out.println("Trabajadores clase C 15/hora");
        System.out.println("Trabajadores clase D 10/hora");
        System.out.println();
        do {

            System.out.println("Introduce las horas que ha realizado el trabajador: ");

            horasTrabajadas = sc.nextInt();

            if (horasTrabajadas <= 40) {
                System.out.println("Se han registrado las horas correctamente");
                stop = true;
            } else {
                System.out.println("Eres un explotador!! Un trabajador no puede realizar mas de 40h semanales!!");
                System.out.println("Vuelve a introducir las horas de nuevo...");
            }

        } while (!stop);

        System.out.println("Ahora introduce la clase a la que este trabajador pertenece: ");

        clase = sc.next().charAt(0);
        clase = Character.toUpperCase(clase);

        switch (clase) {
            case 'A':
                salarioFinal = horasTrabajadas * TRABAJADORES_CLASE_A;
                System.out.println("El salario final para la clase " + clase + " es de " + salarioFinal + " €");

                break;
            case 'B':
                salarioFinal = horasTrabajadas * TRABAJADORES_CLASE_B;
                System.out.println("El salario final para la clase " + clase + " es de " + salarioFinal + " €");

                break;
            case 'C':
                salarioFinal = horasTrabajadas * TRABAJADORES_CLASE_C;
                System.out.println("El salario final para la clase " + clase + " es de " + salarioFinal + " €");

                break;

            case 'D':
                salarioFinal = horasTrabajadas * TRABAJADORES_CLASE_D;
                System.out.println("El salario final para la clase " + clase + " es de " + salarioFinal + " €");


                break;
            default:
                System.out.println("La categoria del trabajador no exixte");
        }


        //Tercera fase del ejercicio (C)

        double baseImponible;
        double promocionAplicada = 0;
        double precioFinal;
        double total;
        String tipoIva;
        String codigoPromocional;
        double ivaSeleccionado = 0;
        double promocionSeleccionada = 0;
        final double IVA_GENERAL = 21;
        final double IVA_REDUCIDO = 10;
        final double IVA_SUPERREDUCIDO = 4;
        final int NOPRO = 0;
        final double MITAD = 2;
        final int MENO_5 = 5;
        final double PORC_5 = 5;

        System.out.println("Introduzca la base imponible");
        baseImponible = sc.nextDouble();
        sc.nextLine();

        System.out.println("Introduzca el tipo de IVA, no se diferencia mayusculas o minusculas" +
                "  (general, reducido o superreducido)");
        tipoIva = sc.nextLine();
        tipoIva = tipoIva.toUpperCase();

        switch (tipoIva) {
            case "GENERAL":
                ivaSeleccionado = IVA_GENERAL;
                break;

            case "REDUCIDO":
                ivaSeleccionado = IVA_REDUCIDO;
                break;
            case "SUPERREDUCIDO":
                ivaSeleccionado = IVA_SUPERREDUCIDO;
                break;

            default:
                System.out.println("El iva seleccionado no es correcto");
        }

        System.out.println("Introduzca el código promocional, no se diferencia mayusculas o minusculas" +
                "  (nopro, mitad, meno5 o 5porc)");

        codigoPromocional = sc.nextLine();
        codigoPromocional = codigoPromocional.toUpperCase();

        switch (codigoPromocional) {
            case "NOPRO":
                promocionSeleccionada = NOPRO;
                break;

            case "MITAD":
                promocionSeleccionada = MITAD;
                break;
            case "MENO5":
                promocionSeleccionada = MENO_5;
                break;

            case "5PORC":
                promocionSeleccionada = PORC_5;
            default:
                System.out.println("El codigo de promocional no es correcto");

        }

        System.out.println("Base imponible " + baseImponible);
        System.out.println("IVA (" + String.format("%.1f", ivaSeleccionado) + "%) " + (baseImponible * ivaSeleccionado) / 100);
        precioFinal = ((baseImponible * ivaSeleccionado) / 100) + baseImponible;
        System.out.println("Precio con IVA " + String.format("%.2f", precioFinal));
        promocionAplicada = switch (codigoPromocional) {
            case "NOPRO" -> promocionSeleccionada;
            case "MITAD" -> precioFinal / promocionSeleccionada;
            case "MENO5" -> precioFinal - 5;
            case "5PORC" -> (precioFinal * MENO_5) /100;
            default -> promocionAplicada;
        };
        System.out.println("Cod. Promo" + " (" + codigoPromocional + "): " + " -" + promocionAplicada);
        if (promocionAplicada > precioFinal) {
            total = promocionAplicada - precioFinal;
        } else {
            total = precioFinal - promocionAplicada;
        }
        System.out.println("TOTAL " + total);


    }
}
