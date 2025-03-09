package segundo_trimestre.empleados_empresa;

import java.util.ArrayList;
import java.util.List;

/*
Uso de polimorfismo:

En la clase Main, crea un array de empleados y almacena objetos de ambos tipos (EmpleadoTiempoCompleto y EmpleadoPorHoras).
Recorre el array e imprime la información de cada empleado, utilizando polimorfismo.

 */
public class Ejecutable {
    public static void main(String[] args) {
        Gestion g = new Gestion();
        Menu menu = new Menu();
        List<Empleado> empleados = new ArrayList<>();
        int opcion;
        do {
            opcion = menu.mostrarMenu();
            switch (opcion) {
                case 1:
                    g.crearEmpleadoTiempoCompleto(empleados);
                    break;
                case 2:
                    g.crearEmpleadoPorHoras(empleados);
                    break;
                case 3:
                    System.out.println("3.- Mostrar informacion de cada empleado.");
                    break;
                case 4:
                    System.out.println("Saliendo de la aplicacion");
                    break;
            }
        } while (opcion != 4);

    }
}
