package ThankingInJava.接口;
/**
 * 说明：这里四个方法把上路接口和具体类作为参数、
 * 当hero实例化后，它可以被传递给这些方法中的任何一个
 * 意味着它依次被向上转型为每一个接口
 * */
public class 多重继承 {
    public static void t(CanFight x){x.fight();}
    public static void u(CanFly x){x.fly();}
    public static void v(CanSwim x){x.swim();}
    public static void x(ActionCharacter x){x.fly();}
    public static void main(String[] args) {
        Hero a=new Hero();
        t(a);
        u(a);
        v(a);
        x(a);
    }
}
interface CanFight{
    void fight();
}
interface CanSwim{
    void swim();
}
interface CanFly{
    void fly();
}
class ActionCharacter{
    public void fly(){
        System.out.println("ActionCharacter.fly");
    }
}
/**
 * 特别说明：Hero组合了具体类ActionCharacter和接口CanFly,CanSwim,CanFight
 * 当一个具体类和多个几口组合在一起时，这个类必须放在前面，否则编译器报错；
 * */
class Hero extends ActionCharacter implements CanFly,CanSwim,CanFight{
        public void swim(){
            System.out.println("Hero.swim");}
        public void fight(){
            System.out.println("Hero.fight");
        }
        //可以看到这里并没有fly方法，他是继承ActionCharacter来的
}
