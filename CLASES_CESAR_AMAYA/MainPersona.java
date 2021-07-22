
public class MainPersona {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Empleado();
        Empleado e1 =  new Tecnico();
        Tecnico t1 = new Tecnico();
        Boolean b = false;
        /*b = p1 is instanceof Persona;
b = p1 is instanceof Modales;
b = p1 is instanceof Object;
b = p1 is instanceof Empleado;
b = p1 is instanceof Tecnico;
b = p2 is instanceof Persona;
b = p2 is instanceof Empleado;
b = p2 is instanceof Modales;
b = p2 is instanceof Tecnico;
b = e1 is instanceof Empleado;
b = e1 is instanceof Modales;
b = e1 is instanceof Persona;
b = e1 is instanceof Tecnico;
b = t1 is instanceof Persona;
b = t1 is instanceof Modales;
b = t1 is instanceof Empleado;
b = t1 is instanceof Tecnico;
b = null is instanceof Persona;
b = e1 is instanceof String;*/
        b =  p1 instanceof Persona;
        System.out.println("Objerto P1 es instacia de Persona " + b);
        b = p1  instanceof Object;
        System.out.println("Objerto P1 es instacia de Object " + b);
        b = p1  instanceof Empleado;
        System.out.println("Objerto P1 es instacia de Empleado " + b);
        b = p1  instanceof Tecnico;
        System.out.println("Objerto P1 es instacia de Tecnico " + b);
        System.out.println("--------------------------------------------");
        b =  p2 instanceof Persona;
        System.out.println("Objerto P2 es instacia de Persona " + b);
        b = p2  instanceof Object;
        System.out.println("Objerto P2 es instacia de Object " + b);
        b = p2  instanceof Empleado;
        System.out.println("Objerto P2 es instacia de Empleado " + b);
        b = p2  instanceof Tecnico;
        System.out.println("Objerto P2 es instacia de Tecnico " + b);
        System.out.println("--------------------------------------------");
        b =  e1 instanceof Persona;
        System.out.println("Objerto e1 es instacia de Persona " + b);
        b = e1  instanceof Object;
        System.out.println("Objerto e1 es instacia de Object " + b);
        b = e1  instanceof Empleado;
        System.out.println("Objerto e1 es instacia de Empleado " + b);
        b = e1  instanceof Tecnico;
        System.out.println("Objerto e1 es instacia de Tecnico " + b);
        System.out.println("--------------------------------------------");
        b =  t1 instanceof Persona;
        System.out.println("Objerto t1 es instacia de Persona " + b);
        b = t1  instanceof Object;
        System.out.println("Objerto t1 es instacia de Object " + b);
        b = t1  instanceof Empleado;
        System.out.println("Objerto t1 es instacia de Empleado " + b);
        b = t1  instanceof Tecnico;
        System.out.println("Objerto t1 es instacia de Tecnico " + b);

    }
}
