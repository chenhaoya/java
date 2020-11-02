package ThankingInJava.复用类;

public class 执行顺序 extends Insect {
    private int k=printInit("执行顺序k");
    public 执行顺序(){
        System.out.println("k="+k);
        System.out.println("j="+j);
    }
    private static int x1=printInit("执行顺序.INsect.p");
    public static void main(String[] args) {
        System.out.println("main");
        执行顺序 b=new 执行顺序();
    }
}
class Insect{
    private int i=9;
    protected int j;
    Insect(){
        System.out.println("i="+i+",j="+j);
        j=39;
    }
    private static int x1=printInit("");
    static int printInit(String a){
        System.out.println(a);
        return 47;
    }
}