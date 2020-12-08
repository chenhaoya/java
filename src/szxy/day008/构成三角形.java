package szxy.day008;
/**
 *
 * */
public class 构成三角形 {
    public static void main(String[] args) throws MyException1{
        Triangle s1=new Triangle();
        try {
            s1.sanjiao(0, 5, 6);
        }catch(MyException1 e){
            System.out.println(e.aa());
            System.out.println(e);
        }
    }
}
class Triangle{
    void sanjiao(int a,int b,int c)throws MyException1{
        boolean d=false;
        if(a+b>c&&a+c>b&&c+b>a)
            System.out.println("可以构成三角形");
        else
            throw new MyException1("lllegalArgumentException");
    }
}
class MyException1 extends Exception{
    String a;
    MyException1(String a){
        this.a=a;
    }
    String aa(){
        return a;
    }
}