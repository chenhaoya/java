package szxy.day03.work001;
class Computer{
    String brand;
    Computer(){brand="001";}
}
class Aaaa{
    int id;
    String name=null;
    int age;
    Computer comp;
    void study(){
        System.out.println(name+"我正在学习！使用计算机."+comp.brand);
    }
    Aaaa(){}
}
public class test {
    public static void main(String[] args) {
        Computer c1=new Computer();
        Computer c2;
        c2=new Computer();
        c1.brand="lenovo";
        c2.brand="华为";
        System.out.println(c1.brand);
        System.out.println(c2.brand);
            Aaaa stu1=new Aaaa();
            Computer comp1=new Computer();
            comp1.brand="联想";
            stu1.comp=comp1;
            stu1.study();
    }
}
