package ThankingInJava.six;
public class _getClass {
    public static void main(String[] args) {
        //f();
    }
    static void f(Character...a){
        System.out.println("first");
        for(Character i:a)
            System.out.println(a);
    }
    static void f(Integer...a){
        System.out.println("second");
        for(Integer i:a)
            System.out.println(i+"");
    }
    static void f(Long...l) {
        System.out.println("third");
    }
}
