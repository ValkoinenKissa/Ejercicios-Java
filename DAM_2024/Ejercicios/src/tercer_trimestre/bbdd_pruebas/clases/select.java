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
            // Ejecutar la consulta y obtener la información resultado
            ResultSet rs = stmt.executeQuery("SELECT nombreDirector, edadDirector FROM director");
            while (rs.next()) {
                String nombreDirector = rs.getString("nombreDirector");
                int edadDirector = rs.getInt("edadDirector");
                System.out.println("Director: " + nombreDirector + ", Edad: " + edadDirector);
            }
            // Cerrar la conexión
            con.close();
        } catch (SQLException e) {
            // En caso de producirse un error, informar al usuario
            System.out.println("No se ha podido establecer la conexión con la BDD.");
        }
    }
}
