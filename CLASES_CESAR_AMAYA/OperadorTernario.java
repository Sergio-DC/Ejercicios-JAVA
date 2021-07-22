
public class OperadorTernario {
    public static void main(String[] args) {
        int calificacion =  100;
        String resultado1 =  (calificacion >= 50) ? "Aprobado":"Reprobado";
        System.out.println("Resulatado: " + resultado1);
        boolean bandera =  false;

        bandera = (100 > 202)? true:false;
        System.out.println("Valor de bandera: " + bandera);
    }
}
