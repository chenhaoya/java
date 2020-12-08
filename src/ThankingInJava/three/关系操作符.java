package ThankingInJava.three;

public class 关系操作符 {
    public static void main(String[] args) {
        Dog g1=new Dog();
        Dog g2=new Dog();
        g1.setDog("11");
        g2.setDog("11");
        g1.getDog();
        g2.getDog();

        System.out.println(g1==g2);
        System.out.println(g1.equals(g2));

        Integer a=new Integer(11);
        Integer b=new Integer(11);
        System.out.println(a==b);
        System.out.println(a.equals(b));
    }
}

class Dog{
    String name;
    String says;
    void setDog(String a) {
        this.name = a;
    }
    void getDog(){
        System.out.println("name:"+this.name);
    }
}
