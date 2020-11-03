package ThankingInJava.接口;
/**
 * 通过继承，在接口中添加新的方法声明，
 * 还可以通过继承在新街口中组合数个接口
 * 这两种情况都可以获得新的接口
 * */
public class 扩展接口 {
    static void u(Monster b){b.menace();}
    static void v(DangerousMonster d){d.menace();d.destroy();}
    static void w(Lethal l){l.kill();}
    public static void main(String[] args) {
        DangerousMonster barney=new DragonZilla();
        u(barney);
        v(barney);
        Vampire vlad=new VeryBadVampire();
        u(vlad);
        v(vlad);
        w(vlad);
    }
}
interface Monster{
    void menace();
}
interface DangerousMonster extends Monster{
    void destroy();
}
interface  Lethal{
    void kill();
}
class DragonZilla implements DangerousMonster{
    @Override
    public void menace() {    }
    public void destroy(){    }
}
interface Vampire extends DangerousMonster,Lethal{
    void drinkBlood();
}
class VeryBadVampire implements Vampire {
    public void menace() {    }
    public void destroy() {    }
    public void kill() {    }
    public void drinkBlood(){   }
}
/**
 * DangerousMonster时Monster的直接扩展，它产生了一个新接口。DragonZilla中实现了这个接口。
 * 在Vampire中使用的语法仅适用于接口继承，一般情况下，只可以将extends用于单一类，但是可以引用多个基类接口。注意：接口需要用逗号一一分开即可
 * */