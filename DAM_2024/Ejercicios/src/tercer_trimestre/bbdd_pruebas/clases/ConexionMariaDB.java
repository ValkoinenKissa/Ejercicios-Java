package tercer_trimestre.bbdd_pruebas.clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMariaDB {
    public static void main(String[] args) throws SQLException {
        String bbdd = "jdbc:mariadb://localhost:3306/mcgrawpeliculas";
        String usr = "root";
        String pass = "";
        try (Connection conn = DriverManager.getConnection(bbdd, usr, pass)) {
            System.out.println("Conexion exitosa");
        } catch (SQLException e) {
            System.out.println("No se ha podido establecer la conexion con la BBDD " + e.getMessage());
        }
    }
}
