package bilibili.Generic;

public class GenericClass {
    public static void main(String[] args) {
        demoObject();
        demoString();
        demoInteger();
    }
    private static void demoInteger() {
        Generic01<Integer> gg=new Generic01<>();
        gg.setName(123);
        System.out.println(gg.getName());
    }
    private static void demoString() {
        Generic01<String> gg=new Generic01<>();
        gg.setName("String");
        System.out.println(gg.getName());
    }
    private static void demoObject() {
        Generic01 gg=new Generic01();
        gg.setName("Object");
        Object obj = gg.getName();
        System.out.println(obj);
    }
}
class Generic01 <E>{
    private E name;
    public void setName(E name) {
        this.name = name;
    }
    public E getName(){
        return name;
    }
}