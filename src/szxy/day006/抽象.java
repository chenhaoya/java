package szxy.day006;
/**
 *
 * */
public class 抽象 {
    public static void main(String[] args) {
        Cat c=new Cat("cady");
        Bird b=new Bird("Bird");
        c.go();
        b.go();
    }
}
abstract class Animals{          //抽象类
    String name;                //普通成员变量
    abstract void go();        //抽象方法
}
class Cat extends Animals{
    Cat(String name){
        this.name=name;
    }
    void go(){              //抽象方法实现
        System.out.println(name+" can run.");
    }
}
class Bird extends Animals{
    Bird(String name){
        this.name=name;
    }
    void go(){              //抽象方法实现
        System.out.println(name+" can fly");
    }
}