package tercer_trimestre.bbdd_pruebas.clases;

import org.mariadb.jdbc.Connection;
import org.mariadb.jdbc.Statement;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class select {
    public static void main(String[] args) {
        // Indicar el tipo y el lugar de la base de datos
        String bdd = "jdbc:mariadb://localhost:3306/mcgrawpeliculas";
        // Usuario de la base de datos con el que vamos a realizar el login
        String usr = "root";
        // Contraseña para ese usuario en esa base de datos
        String pwd = "";
        try {
            // Establece la conexión
            Connection con = (Connection) DriverManager.getConnection(bdd, usr, pwd);
            // Creamos un objeto de tipo sentencia a partir de la conexión
            Statement stmt = con.createStatement();
            // Ejecutar la consulta y obtener la información de los directores estadounidenses
            ResultSet rs = stmt.executeQuery("SELECT nombreDirector, edadDirector FROM mcgrawpeliculas.director where nacionalidadDirector = 1");
            // Mientras haya registros que leer...
            while (rs.next()) {
                // Obtener el valor del campo nombre del registro actual
                String nombreDirector = rs.getString(1);
                // Obtener el valor del campo edad del registro actual
                int edadDirector = rs.getInt(2);
                // Imprimir la información por pantalla
                System.out.println("Director: " + nombreDirector + ", Edad: " + edadDirector);
            }
            // Cerrar la conexión
            con.close();
        } catch (SQLException e) {
            // En caso de producirse un error, informar al usuario
            System.out.println("No se ha podido establecer la conexión con la BBDD.");
        }
    }
}
