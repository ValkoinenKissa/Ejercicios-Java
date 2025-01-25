package segundo_trimestre.ejercicio_presencial;

import java.util.ArrayList;

public class Cliente {
    protected String nombre, dni, apellidos;

    ArrayList<Vehiculo> arrayVehiculos = new ArrayList<Vehiculo>();

    protected Cliente() {
    }

    protected Cliente(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
