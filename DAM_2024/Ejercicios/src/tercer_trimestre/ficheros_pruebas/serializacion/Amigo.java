package tercer_trimestre.ficheros_pruebas.serializacion;

import java.io.Serializable;

/*
Vamos a crear una clase y dejarla preparada para que los objetos creados a partir de la misma puedan
ser almacenados directamente en un fichero.

Genera una clase Amigo para guardar la información de diferentes amigos con sus nombres, sus apellidos,
su fecha nacimiento y su edad.

Al almacenar estos objetos en el fichero, la edad no deberá guardarse, ya que puede calcularse a partir de la fecha
de nacimiento.
 */
public class Amigo implements Serializable {
    private final String nombre;
    private final String apellido;
    private final transient int edad;
    private final String fechaNacimiento;


    public Amigo(String nombre, int edad, String apellido, String fechaNacimiento) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Amigo{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                '}';
    }
}
