import java.util.Scanner;

public class MensajesService {
    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();

        System.out.println("Tu nombre");
        String nombre = sc.nextLine();

        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutorMensaje(nombre);
        MensajesDAO.crearMensaje(registro);
    }

    public static void listarMensajes() {
        MensajesDAO.leerMensajesDB();
    }

    public static void borrarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("indica el ID del mensaje a borrar");
        int id_mensaje= sc.nextInt();
        MensajesDAO.borrarMensajesDB(id_mensaje);
    }
    public static void editarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe tu nuevo mensaje");
        String mensaje = sc.nextLine();

        System.out.println("indica el ID del mensaje a editar");
        int id_mensaje= sc.nextInt();
        Mensajes actualizacion = new Mensajes();
        actualizacion.setIdMensaje(id_mensaje);
        actualizacion.setMensaje(mensaje);
        MensajesDAO.actualizarMensajeDB(actualizacion);
    }
}
