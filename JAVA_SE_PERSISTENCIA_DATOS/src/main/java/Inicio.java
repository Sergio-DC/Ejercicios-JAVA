import java.sql.Connection;

public class Inicio {
    public static void main(String[] args) {
        try(Connection connection = new Conexion().getConnection()){
            System.out.println("Entre");
        } catch (Exception e) {
            System.out.println("Error al intentar conectar: " + e);
        }
    }
}
