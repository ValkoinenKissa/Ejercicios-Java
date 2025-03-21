package segundo_trimestre.ejercicio_concesionario;

import java.util.ArrayList;

/*
El concesionario también dispone de un taller en el que los mecánicos reparan los coches que llevan los clientes.
Un mecánico repara varios coches a lo largo del día, y un coche puede ser reparado por varios mecánicos.
Los mecánicos tienen un dni, nombre, apellidos, fecha de contratación y salario.
Se desea guardar también la fecha en la que se repara cada vehículo
y el número de horas que se ha tardado en arreglar cada automóvil.
 */
public class Reparaciones {
    private final String matriculaAReparar;
    private final ArrayList<String> dniMecanicosInvolucrados;
    private final String fechaReparacion;
    int numHorasReparacion;

    public Reparaciones(String matriculaAReparar, int numHorasReparacion, String fechaReparacion, ArrayList<String> dniMecanicosInvolucrados) {
        this.matriculaAReparar = matriculaAReparar;
        this.numHorasReparacion = numHorasReparacion;
        this.fechaReparacion = fechaReparacion;
        this.dniMecanicosInvolucrados = dniMecanicosInvolucrados;
    }

    @Override
    public String toString() {
        return "Reparaciones{" +
                "matriculaAReparar='" + matriculaAReparar + '\'' +
                ", dniMecanicosInvolucrados=" + dniMecanicosInvolucrados +
                ", fechaReparacion='" + fechaReparacion + '\'' +
                ", numHorasReparacion=" + numHorasReparacion +
                '}';
    }
}
