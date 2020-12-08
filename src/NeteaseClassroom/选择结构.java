package NeteaseClassroom;
//import java.util.Arrays;
//import java.util.Scanner;
//同时java的方法，也有与C++同样的函数重载：overloading 采取签名(signature)、参数个数、参数类型不同方式共编译器识别
public class 选择结构 {
    public static void main(String[] args) {
        Person p = new Person();
        p.age = 90;
        p.name = "abc";
        System.out.println(p.age + "\n" + p.name);
        p.sayHello();
        p.sayHello("bbb");//-------------------涵盖'overloading' 'this'
    }
}
    class Person{
        //field字段：类的属性 用变量来表示
        //字段又称为域、域变量、属性、成员变量等
        String name;
        int age;
        //**************************************************
        //method方法：是类的功能和操作，是用函数来表示的
        void sayHello(){//-----------------------------------这里的方法具有封装性和安全性
            System.out.println("name="+name);
        }
        void sayHello(String name){//------------------------overloading
            //this 还有个特殊调用是啥来着。。。pending
            this.name=name;//--------------------------------this表示当前这个对象实例本身的name
            System.out.println("overloading:"+name);
        }
        //*****************************************
        //是一种特树的方法，用来初始化(new)该类的一个新的对象，构造方法和类名同名，而且不用返回数据类型
        //与C++的构造函数类似
        Person() {age=0;name=null;}
}























