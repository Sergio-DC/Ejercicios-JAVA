
public class OperadoresLogicos {
    public static void main(String[] args) {
        int a =0;//valores para operadores &, |
        int b = 5;
        int c = 0;//valores para operadores perezosos &&,||
        int d = 5;

        if(a==0 | b++>2){//Evalua ambas condiciones y b se incrementa
            System.out.println("Cierto (a==0 |  b++ > 2)-> a: " + a + " b: " + b);
        }
        if(c == 0 || d++ >2){//Evalua solo la 1° condicion y asume que la 2° es verdadera
            System.out.println("Cierto (c==0 || d++ > 2)-> c: " + c + " d: " + d);
        }
        System.out.println();
        if (a > 0 & b++ < 5){//Evalua ambas condiciones, b se incrementa nuevamente.

        }else{
            System.out.println("Falso (a>0 &  b++  a: " + a + " b: " + b);
        }
        if(c > 0 && d++ < 5){//Evalua solo la primera condicion y asume que la segunda condicion es falsa

        }else{
            System.out.println("Falso (c>0 && d++ <5) -> c: " + c + " d: " + d);
        }
    }



}

