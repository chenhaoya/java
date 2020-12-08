package ThankingInJava.接口;

public class 接口 {
    static void tune(Instrument1 i){
        i.play("MIDDLE_C");
    }
    static void tuneAll(Instrument1 []i){
        for (Instrument1 e:i){
            e.play("MIDDLE_C");
        }
    }
    public static void main(String[] args) {
        Instrument1[] orchestra ={
                new Wind1(),
                new Brass1(),
                new Woodwind1(),
                new Stringed1()
        };
        tuneAll(orchestra);
        Instrument1 ccccc=new Stringed1();
        ccccc.aaa("接口的默认方法实现，每一个实现类都可以调用");
    }
}
interface Instrument1{
    int VALUE=5;
    void play(String s);
    void adjust();
    default void aaa(String s){//接口默认方法实现测试
        System.out.println(s);
    }
}
class Wind1 implements Instrument1{
    public void play(String s){
        System.out.println(this+".play() "+s);
    }
    public void adjust(){
        System.out.println(this+".adjust() ");
    }
    public String toString(){
        return "Wind1";
    }
}
class Percussion1 implements Instrument1{
    @Override
    public void play(String s) {
        System.out.println(this+".play() "+s);
    }
    public void adjust(){
        System.out.println(this+".adjust()");
    }
    @Override
    public String toString() {
        return "Percussion";
    }
}
class Stringed1 implements Instrument1{
    @Override
    public void play(String s) {
        System.out.println(this+".play() "+s);
    }
    public void adjust(){
        System.out.println(this+".adjust()");
    }
    @Override
    public String toString() {
        return "Stringed1";
    }
}
class Brass1 extends Wind1{
    public String toString(){
        return "Brass1";
    }
}
class Woodwind1 extends Wind1{
    public String toString(){
        return "Woodwind1";
    }
}

