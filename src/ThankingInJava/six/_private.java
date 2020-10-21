package ThankingInJava.six;
/**
 * 构造器设置为私有：保护某个或全部构造器被直接访问
 * 这里如果想要实例Sundea对象只能通过调用makeASundea()方法来实现
 * 118p
 * */
class Sundea{
    private int a;
    private int b;
    private Sundea(int a,int b){
        this.a=a;this.b=b;
    }
    static Sundea  makeASundea(int a,int b){
        return new Sundea(a,b);
    }
    void getSundea(){
        System.out.println("a="+a+"\nb="+b);
    }
}
public class _private {
    public static void main(String[] args) {
        Sundea x=Sundea.makeASundea(3,5);
        x.getSundea();
    }
}
