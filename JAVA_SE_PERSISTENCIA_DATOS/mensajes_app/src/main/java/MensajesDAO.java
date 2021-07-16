import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MensajesDAO {
    public static void crearMensaje(Mensajes mensaje) {
        Conexion dbConnect = new Conexion();
        try(Connection connection = dbConnect.getConnection()) {
            String sql = "INSERT INTO mensajes(mensaje, autor_mensaje) VALUES (?,?)";
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
        Conexion db_connect = new Conexion();

        PreparedStatement ps=null;
        ResultSet rs=null;

        try(Connection conexion = db_connect.getConnection())  {
            String query="SELECT * FROM mensajes";
            ps=conexion.prepareStatement(query);
            rs=ps.executeQuery();

            while(rs.next()){
                System.out.println("ID: "+rs.getInt("id_mensaje"));
                System.out.println("Mensaje: "+rs.getString("mensaje"));
                System.out.println("Autor: "+rs.getString("autor_mensaje"));
                System.out.println("Fecha: "+rs.getString("fecha_mensaje"));
                System.out.println("");
            }
        }catch(SQLException e){
            System.out.println("no se pudieron recuperar los mensajes");
            System.out.println(e);
        }
    }

    public static void borrarMensajesDB(int idMensaje) {
        Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.getConnection())  {
            PreparedStatement ps=null;

            try {
                String query="DELETE FROM mensajes WHERE id_mensaje = ?";
                ps=conexion.prepareStatement(query);
                ps.setInt(1, idMensaje);
                ps.executeUpdate();
                System.out.println("el mensaje ha sido borrado");
            }catch(SQLException e) {
                System.out.println(e);
                System.out.println("no se pudo borrar el mensaje");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }

    public static void actualizarMensajeDB(Mensajes mensaje) {
        Conexion db_connect = new Conexion();

        try(Connection conexion = db_connect.getConnection())  {
            PreparedStatement ps=null;

            try{
                String query="UPDATE mensajes SET mensaje = ? WHERE id_mensaje = ?";
                ps=conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setInt(2, mensaje.getIdMensaje());
                ps.executeUpdate();
                System.out.println("mensaje se actualizó correctamente");
            }catch(SQLException ex){
                System.out.println(ex);
                System.out.println("no se pudo actualizar el mensaje");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }

}
