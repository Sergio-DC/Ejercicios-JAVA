

public class Resto {
    public static void main(String[] args) {
        restoStatement();
    }
    public static void restoStatement(){
        int dividendo =  15;
        int divisor =  2;
        int resto =  dividendo % divisor;
        System.out.println("Resto:" + resto);
        int expresion =  3 + dividendo % divisor;
        System.out.println("Expresion:" + expresion);
    }
    public static void concatenatorString(){
        String sujeto = "Ellos";
        String predicado = "estudiaba java";
        String frase = sujeto + " " + predicado;
        System.out.println("La frase es:" + frase);
    }
}

