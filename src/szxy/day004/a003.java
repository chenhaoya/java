package szxy.day004;
class Person{
    private String name;
    private int age;
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    void setPerson(String name,int age){
        this.name=name;this.age=age;
    }
    void speak(){
        System.out.println("姓名："+name+"\n年龄："+age);
    }
}
public class a003 {
    public static void main(String[] args) {
        Person a=new Person();
        a.setPerson("小明",20);
        a.speak();

        System.out.println("getnam():"+a.getName()+"\ngetage():"+a.getAge());
    }
}
