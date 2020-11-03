package szxy.day006;
/**
 *
 * */
public class a002 {
    public static void main(String[] args) {
        Person p =new Person();
        p.order(new Car());//掉用car的start
        p.order(new Truck());//调用truck的start
        Car c=new Car();
        Truck t=new Truck();
        p.order(c);
        p.order(t);
    }
}
class Vehicle{
    void start(){
        System.out.println("start!");
    }
}
class Car extends Vehicle{
    void start(){
        System.out.println("轿车以45千米/小时的速度行驶");
    }
}
class  Truck extends Vehicle{
    void start(){
        System.out.println("卡车以80千米/小时的速度行驶");
    }
}
class Person{
    void order(Vehicle v){
        v.start();
    }
}