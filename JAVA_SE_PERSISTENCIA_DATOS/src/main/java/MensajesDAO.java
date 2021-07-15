import java.sql.Connection;
import java.sql.PreparedStatement;

public class MensajesDAO {
    public static void crearMensaje(Mensajes mensaje) {
        Conexion dbConnect = new Conexion();
        try(Connection connection = dbConnect.getConnection()) {
            String sql = "INSERT INTO mensaje(mensaje, autor_mensaje) VALUES (?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, mensaje.getMensaje());
            preparedStatement.setString(2, mensaje.getAutorMensaje());
            preparedStatement.executeUpdate();
            System.out.println("El mensaje fue creado");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void leerMensajesDB() {

    }

    public static void borrarMensajesDB(int idMensaje) {

    }

    public static void actualizarMensajeDB(Mensajes mensaje) {

    }
}
