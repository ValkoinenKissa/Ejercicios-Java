package segundo_trimestre.empleados_empresa;
/*
Desarrolla un sistema para gestionar diferentes tipos de empleados en una empresa. Todos los empleados comparten algunas características básicas, pero cada tipo de empleado tiene su propia forma de calcular el salario.

Clase abstracta:

Crea una clase abstracta llamada Empleado con los siguientes atributos:
nombre (String)
salarioBase (double)
Debe contener un metodo abstracto calcularSalario(), que será implementado en las clases hijas.
Implementa un constructor y un metodo mostrarInformacion() que muestre el nombre y el salario.
Clases concretas:

Crea dos clases que hereden de Empleado e implementen calcularSalario() de manera diferente:
EmpleadoTiempoCompleto: Recibe un bono adicional del 10% sobre el salarioBase.
EmpleadoPorHoras: Recibe un pago basado en la cantidad de horas trabajadas (horasTrabajadas) y una tarifa por hora (tarifaPorHora).
Interfaz:

Crea una interfaz Beneficios con un metodo obtenerBeneficios(), que devuelva los beneficios del empleado en forma de String.
Implementación de la interfaz:

Ambas clases (EmpleadoTiempoCompleto y EmpleadoPorHoras) deben implementar Beneficios, pero cada una devolverá beneficios distintos:
EmpleadoTiempoCompleto: "Seguro médico y vacaciones pagadas".
EmpleadoPorHoras: "Bonos por horas extras trabajadas".
Uso de polimorfismo:

En la clase Main, crea un array de empleados y almacena objetos de ambos tipos (EmpleadoTiempoCompleto y EmpleadoPorHoras).
Recorre el array e imprime la información de cada empleado, utilizando polimorfismo.

 */
public class Ejecutable {
    public static void main(String[] args) {

    }
}
