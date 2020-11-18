package szxy.day008;

public class StringUnusual {
    public static void main(String[] args) {
        String str="好好学习天天向上！";
        try{
            System.out.println("这是一个自定义异常类的例子1");
            if(str.length()>5)
                throw new MyException(str);
        }catch (MyException e){
            System.out.println(e.toString());
        }
    }
}
class MyException extends Exception{
    private int len;
     MyException(String n){
        len=n.length();
    }
    public String toString() {
        return ("输入字符串长度为"+len+"，超出允许的最大长度5出现异常");
    }
}