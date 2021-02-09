package szxy.day03.work001;
class Student{
    private String account;
    private String password;
    public Student(String account,String password){
        this.account=account;
        this.password=password;
    }
    String getAccount(){
        return account;
    }
    String getPassword(){
        return password;
    }
}
class LoginService{
    private Student t;
    public String isLogin(Student t){
        if(t.getAccount()=="admin"&&t.getAccount()=="admin")
            return "ok";
        else return "登录失败";
    }
}
public class test3 {
    public static void main(String[] args) {
        Student t1=new Student("admin","admin");
        LoginService ls=new LoginService();
        String result=ls.isLogin(t1);
        System.out.println(result);

        Student t2=new Student("admin","265444");
        LoginService mm=new LoginService();
        String s1=mm.isLogin(t2);
        System.out.println(s1);
    }
}
