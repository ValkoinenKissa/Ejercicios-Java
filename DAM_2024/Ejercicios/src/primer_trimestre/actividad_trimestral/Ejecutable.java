package primer_trimestre.actividad_trimestral;
/*
CALCULAR EL SUELDO DE UN TRABAJADOR
Crea una aplicación que permite calcular salario que recibe un trabajador cada mes,
a partir de las horas trabajadas en la semana y la clase a la que pertenece:
•
Trabajadores de clase “A”, se les paga 25 euros por hora.
•
Trabajadores de clase “B”, se paga 20 euros por hora.
•
Trabajadores de clase “C”, se les paga 15 euros por hora y
•
Trabajadores de clase “D”, 10 euros por hora.
Utiliza constantes para definir las clases de trabajadores.
El usuario final de la aplicación debe ingresar el número de horas trabajadas e indicar
la clase a la que pertenece dicho trabajador.

También se le debe retener un 15% de IRPF, si su salario no supera los 1200€ o un 20% si supera los 1200€
La aplicación termina cuando el usuario lo indique. (bucle)
 */
public class Ejecutable {
    public static void main(String[] args) {

        //Declaración de constantes y variables

        final int TRABAJADORES_CLASE_A = 25;
        final int TRABAJADORES_CLASE_B = 20;
        final int TRABAJADORES_CLASE_C = 15;
        final int TRABAJADORES_CLASE_D = 10;

        final double RETENCION_FISCAL_BASE = 15;
        final double RETENCION_FISCAL_AMPLIADA = 15;

        double horasTrabajadas, salarioFinal, retencionFiscal;

    }
}
