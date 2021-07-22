public class Bottom extends Top{
    public Bottom(String s){
        super(s);
        System.out.println("D");
    }
    public static void main(String[] args) {
        new Bottom("C");
        System.out.println(" ");
    }
}
