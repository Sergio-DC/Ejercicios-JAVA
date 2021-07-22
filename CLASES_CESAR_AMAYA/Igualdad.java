
public class Igualdad {
    public static void main(String[] args) {
        int a = 100;
        char b = 'b';
        boolean res = true;

        char [] letras1 = {'a','b','c','d'};
        char [] letras2 = {'a','b','c','d'};
        if (a == 100L){
            System.out.println("100 y 100L son iguales");
        }
        /*if(res != (b & gt;a)){
            System.out.println("res distinto a (b>;a)");
        }*/
        if (letras1 == letras2){
            System.out.println("iguales");
        }else{
            System.out.println("distintos");
        }
        letras2 = letras1;
        if(letras1 == letras2){
            System.out.println("Iguales");
        }else {
            System.out.println("Distintos");
        }
    }
}
