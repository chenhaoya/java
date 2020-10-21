package ThankingInJava.three;
//目的：理解实例的赋值
public class 类赋值 {

    public static void main(String[] args) {
        Tank t1=new Tank();;
        Tank t2=new Tank();
        t1.level=1;
        t2.level=2;
        System.out.println("t1="+t1.level+"\nt2="+t2.level);

        t1=t2;//t1 and t2此从指向同一个对象；t1曾指向的对象交给垃圾回收器
        //我们大概率理解t1和t2是相互独立的，但由于赋值操作的是一个对象的引用
        t1.level=90;
        t2.level=20;
        System.out.println("t1="+t1.level+"\nt2="+t2.level);
    }
}
class Tank{
    int level;
}