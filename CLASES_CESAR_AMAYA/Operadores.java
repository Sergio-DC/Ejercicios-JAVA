public class Operadores {
    public static void operadorAsignacion(){
        int a = 5,b;

        double c = 10.0,d;

        float e = 3.4f,f;

        short g = 2,h;

        byte i = 1,j;

        long k = 1234567891,l;

        b = a ;
        d = c;
        f = e;
        h = g;
        j = i;
        l = k;
        ClaseA claseA =  new ClaseA();
        ClaseB claseB = new ClaseB();


        System.out.println("Asignacion con primitivos");
        System.out.println("Original:" + b + "se le asigno el valor de " + a );
        System.out.println("Original:" + d + "se le asigno el valor de " + c );
        System.out.println("Original:" + f + "se le asigno el valor de " + e );
        System.out.println("Original:" + g + "se le asigno el valor de " + h );
        System.out.println("Original:" + i + "se le asigno el valor de " + j );
        System.out.println("Original:" + k + "se le asigno el valor de " + l );
        System.out.println("ASignacion con objetos:");
        System.out.println();
    }
}
