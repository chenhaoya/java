package szxy.day007;
import java.sql.SQLOutput;
import java.util.*;

import static java.lang.System.*;

public class 交通管理系统 {
    public static void main(String[] args) {
        Taxi taxi=new Taxi();
        Bus bus=new Bus();
    }
}
abstract class MotorVehicles{
    void brake(String s){};
}
interface  MoneyFare{
    void charge(String c);
}
interface ControlTemperture {
    void controlAirTemperature(String t);
}
class Bus extends MotorVehicles implements MoneyFare{
    String a,b;

    Bus(){
        /**
         * 这里将bus的属性放在构造中，当然也可以放入实现方法中
         * */
        out.print("请输入公交车采用的刹车方式和票价(元)：");
        Scanner val=new Scanner(in);
        a=val.next();
        b=val.next();

        charge(b);
        brake(a);
    }
    public void charge(String c) {//public
        out.println("公交车："+c+"元/张，不算公里数");
    }
    void brake(String s){
        out.println("公交车使用的刹车技术："+s);
    }
}
class Taxi extends MotorVehicles implements MoneyFare,ControlTemperture{
    Taxi(){
        String a,b,c;
        out.print("请输入出租车使用的刹车技术、票价、安装的空调样式：");
        Scanner val=new Scanner(in);
        a=val.next();
        b=val.next();
        c=val.next();
        brake(a);
        charge(b);
        controlAirTemperature(c);
    }
    public void charge(String c){
        out.println("出租车："+c+"元/公里，起步价3元");
    }
    public void controlAirTemperature(String t) {
        out.println("出租车安装了"+t+"空调");
    }
    void brake(String s){
        out.println("出租车使用的刹车技术："+s);
    }
}
