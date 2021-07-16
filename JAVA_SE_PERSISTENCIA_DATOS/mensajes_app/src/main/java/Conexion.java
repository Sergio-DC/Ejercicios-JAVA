import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
   public Connection getConnection() {
      Connection connection = null;
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", "hola");
         if(connection != null)
            System.out.println("Se establecio la conexion");
      } catch (SQLException sqe) {
         System.out.println("excepcion en Conexion: " + sqe);
      } finally {
         return connection;
      }
   }
}
