package szxy.day006;
import java.util.*;
/**
 * 定义了司机抽象类和驾驶抽象方法
 * 男司机和女司机继承时通过构造方法初始化类里的元素
 * */
public class a0055 {
    public static void main(String[] args) {
        MaleDriver m=new MaleDriver();//实例化男司机
        FemaleDriver f=new FemaleDriver();//实例化女司机
        m.drive();
        f.drive();
    }
}
abstract class Driver {
    String name;
    abstract void drive();
}
class FemaleDriver extends Driver {
     void drive(){
         System.out.println(name+"(Female) drives a vehicle");
    }
   FemaleDriver(){
         String s;
         System.out.print("请输入男司机名：");
         Scanner val=new Scanner(System.in);
         s=val.next();
         this.name=s;
   }
}
class MaleDriver extends Driver {
    void drive(){
        System.out.println(name+"(Male) drives a vehicle");
    }
    MaleDriver(){
        String s;
        System.out.print("请输入女司机名：");
        Scanner val=new Scanner(System.in);
        s=val.next();
        this.name=s;
    }
}