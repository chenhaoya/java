package aaaaa;

//继承与C++的原理类似  不同点 只能单继承
//一个类只能有一个直接父类
//继承(inheritance)  子类(subclass)  父类/超父类(superclass)
//关键词： extends 关键词  class Student extends Person{.......}
//如果没有extends子句，则该类默认为java.long.Object的子类##所有的类都是通过直接或间接地继承java.long.Object得到的
public class 继承 {
    public static void main(String[] args) {

        Per q=new Per();
        q.seyHello();

        Preson p=new Preson();
        p.seyHello();
    }
}
class Preson{//父类
    int age;
    String name;
    Preson(){this.name="ch";this.age=111;}
    void seyHello(){
        System.out.println("年龄："+age+"\n姓名："+name);
    }
}
class Per extends Preson{//Preson的子类
    String school;
    Per(){
        this.age=222;
        this.name="c";
        this.school="szxy";
    }
    @Override//子类Per同样也继承了父类Person的seyHello函数(方法)；这里是方法的覆盖 可以用@Override进行标识 也可以不写
    void seyHello(){//-----子类可以重新定义与父类同名的函数(方法)；实现对父类方法的覆盖
        System.out.println("年龄："+age+"\n姓名："+name+"\n学校："+school);
    }
}