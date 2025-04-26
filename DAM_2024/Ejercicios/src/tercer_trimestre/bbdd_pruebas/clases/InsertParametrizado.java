package tercer_trimestre.bbdd_pruebas.clases;

import org.mariadb.jdbc.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertParametrizado {
    public static void main(String[] args) {
        // Indicar el tipo y el lugar de la base de datos
        String bdd = "jdbc:mariadb://localhost:3306/mcgrawpeliculas";
        // Usuario de la base de datos con el que vamos a realizar el login
        String usr = "root";
        // Contraseña para ese usuario en esa base de datos
        String pwd = "";
        try {
            Connection con = (Connection) DriverManager.getConnection(bdd, usr, pwd);
            // Creamos la consulta parametrizada
            String sql = "INSERT into mcgrawpeliculas.director VALUES (?,?, ?, ?, ?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setNull(1, java.sql.Types.INTEGER); //Utilizamos esto para introducir un null ya que utilizamos autoIncrement
            // Indicamos el primer parámetro de la consulta
            stmt.setString(2, "Stephen Hillenburg");
            // Indicamos el segundo parámetro de la consulta
            stmt.setInt(3, 59);
            //tercer parametro
            stmt.setInt(4, 1);
            //Cuarto parametro
            stmt.setInt(5, 100000);
            // Ejecutamos la consulta
            int n = stmt.executeUpdate();
            // Mostramos el número de registros afectados por la consulta
            System.out.println(n + " registros insertados.");
            con.close();
        } catch (Exception e) {
            System.out.println("No se ha podido establecer la conexión con la BBDD.");
        }
    }
}
