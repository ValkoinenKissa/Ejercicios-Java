package tercer_trimestre.bbdd_pruebas.clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Ejemplo1 {
    public static void main(String[] args) throws SQLException {
        String bbdd = "jdbc:mariadb://localhost:3306/mcgrawpeliculas";
        String usr = "root";
        String pass = "";
        //Try-with resources no es necesario cerrar la conex manualmente
        try (Connection conn = DriverManager.getConnection(bbdd, usr, pass)) {
            System.out.println("Conexion exitosa");
        } catch (SQLException e) {
            System.out.println("No se ha podido establecer la conexion con la BBDD " + e.getMessage());
        }
    }
}
