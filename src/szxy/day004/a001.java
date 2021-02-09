package szxy.day004;
class Student1{
    private String name;
    static int number=0;
    public Student1(String name){number++;
    this.name=name;}
    public String getName(){return name;}
}
public class a001 {
    public static void main(String[] args) {
        System.out.println("当前学生对象的个数为："+Student1.number);
        Student1 s1=new Student1("王翰");
        System.out.println("当前学生对象的个数为："+s1.number);
        Student1 s2=new Student1("李媛");
        System.out.println("当前学生对象的个数为："+s1.getName());
        System.out.println("当前学生对象的个数为："+s2.getName());
        System.out.println("当前学生对象的个数为："+s1.number);
        System.out.println("当前学生对象的个数为："+s1.number);
        System.out.println("当前学生对象的个数为："+s2.number);
        System.out.println("当前学生对象的个数为："+Student1.number);
    }
}
