package ThankingInJava.接口;
/**
 * 目的：了解Java抽象类和抽象方法
 * 描述：抽象类不可被实例化
 * */
import java.util.*;

public class 抽象002 {
    public static void main(String[] args) {
        Instrument[] orchestra={
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };
        Music aa=new Music();
        aa.tuneAll(orchestra);
        //aaa d=new aaa();                  //不可实例化
        //Instrument aaa=new Instrument() ; //不可实例化
    }
}
class Music{
    void tune(Instrument i){
        i.play("Music");
    }
    void tuneAll(Instrument[] e){
        for(Instrument i:e)
            tune(i);
    }
}
abstract class aaa{//测试实例化类
    abstract void play();
    void play(String s){
        System.out.println(s);
    }
}
abstract class Instrument{
    private int i;
    abstract void play(String n);
    String what(){
        return "Instrument";
    }
    abstract void adjust();
}
class Wind extends Instrument{
    void play(String s){
        System.out.println("Wind.play."+s);
    }
    String what(){
        return "Wind";
    }
    void adjust(){
        System.out.println("Wind.adjust");
    }
}
class Percussion extends Instrument{
    void play(String s){
        System.out.println("Percussion.play."+s);
    }
    String what(){
        return "Percussion";
    }
    void adjust(){
        System.out.println("Percussion.adjust");
    }
}
class Stringed extends Instrument{
    void play(String s){
        System.out.println("Stringed.play."+s);
    }
    String what(){
        return "Stringed";

    }
    void adjust(){
        System.out.println("Stringed.adjust");
    }
}
class Brass extends Wind{
    void play(String s){
        System.out.println("Brass.play."+s);
    }
    void adjust(){
        System.out.println("Brass.adjust");
    }
}
class Woodwind extends Wind{
    void play(String s){
        System.out.println("Woodwind.play."+s);
    }
    String what(){
        return "Woodwind";
    }
}
