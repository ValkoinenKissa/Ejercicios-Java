package tercer_trimestre.bbdd_pruebas.clases;

import org.mariadb.jdbc.Connection;

import java.sql.*;

/*
Utilizando la base de datos de Películas (mcgrawpeliculas_2021.sql):

1.- Inserta un nuevo actor indicando de forma errónea su nacionalidad.

2.- Reemplaza la nacionalidad del actor por la correcta.

3.- Inserta un nuevo actor con todos los datos incorrectos.

4.- Elimina el último actor insertado.
 */
public class CRUD {
    public static void main(String[] args) throws SQLException {
        String bbdd = "jdbc:mariadb://localhost:3306/mcgrawpeliculas";
        String usuario = "root";
        String pwd = "";
        try (Connection conn = (Connection) DriverManager.getConnection(bbdd, usuario, pwd)) {
            System.out.println("Conexion exitosa");
            //Operacion de insercion
            String insert = "INSERT into mcgrawpeliculas.director VALUES (?,?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(insert);
            stmt.setNull(1, java.sql.Types.INTEGER); //Utilizamos esto para introducir un null ya que utilizamos autoIncrement
            stmt.setString(2, "Cristopher Nolan");
            // Indicamos el segundo parámetro de la consulta
            stmt.setInt(3, 54);
            //tercer parametro
            stmt.setInt(4, 1);
            //Cuarto parametro
            stmt.setInt(5, 2000000);

            int filasAfectadas = stmt.executeUpdate();
            System.out.println("Se han insertado los registros con exito: " + filasAfectadas);

            //Select para obtener el id del director que acabamos de insertar
            Statement stm = conn.createStatement();
            String select = "SELECT director.idDirector from mcgrawpeliculas.director WHERE director.nombreDirector LIKE '%Cristopher Nolan%'";
            ResultSet rs = stm.executeQuery(select);
            int idDirector = 0;
            while (rs.next()) {
                idDirector = rs.getInt(1);
            }

            //Actualizacion
            String update = "UPDATE mcgrawpeliculas.director SET nacionalidadDirector = ? WHERE idDirector = ?";
            stmt = conn.prepareStatement(update);
            stmt.setInt(1, 2);
            stmt.setInt(2, idDirector);
            filasAfectadas = stmt.executeUpdate();
            System.out.println("Se ha actualizado los registros con exito: " + filasAfectadas);

            //Inserccion incorrecta

            String insertErroneo = "INSERT into mcgrawpeliculas.director VALUES (?,?, ?, ?, ?)";
            stmt = conn.prepareStatement(insertErroneo);
            stmt.setNull(1, java.sql.Types.INTEGER); //Utilizamos esto para introducir un null ya que utilizamos autoIncrement
            stmt.setString(2, "Yo");
            // Indicamos el segundo parámetro de la consulta
            stmt.setInt(3, 15);
            //tercer parametro
            stmt.setInt(4, 1);
            //Cuarto parametro
            stmt.setInt(5, 3500000);

            filasAfectadas = stmt.executeUpdate();
            System.out.println("Se han insertado los registros con exito: " + filasAfectadas);

            //Select para obtener el id del director que acabamos de insertar
            stm = conn.createStatement();
            select = "SELECT director.idDirector from mcgrawpeliculas.director WHERE director.nombreDirector LIKE '%Yo%'";
            rs = stm.executeQuery(select);
            idDirector = 0;
            while (rs.next()) {
                idDirector = rs.getInt(1);
            }

            String delete = "DELETE from mcgrawpeliculas.director WHERE idDirector = ?";
            stmt = conn.prepareStatement(delete);
            stmt.setInt(1, idDirector);
            filasAfectadas = stmt.executeUpdate();
            System.out.println("Se han borrado los registros con exito: " + filasAfectadas);


        } catch (SQLException e) {
            System.out.println("No se ha podido establecer la conexion con la bbdd" + e.getMessage());
        }
    }
}
