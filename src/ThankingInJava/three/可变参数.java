package ThankingInJava.three;
/**
 * 形参可有可无
 */
import java.util.Arrays;
public class 可变参数 {
    public static void main(String[] args) {
        f(1,"ssss");
        f(2);
        f(3,new String[]{"111","2222","    ","3333"});
        x(3);
        x();
    }
    public static void f(int i,String...s){//不定个数形参
        System.out.println("i:"+i+"\nS:"+ Arrays.toString(s));
    }
    public static void x(int...v){
        System.out.println(Arrays.toString(v));
    }
}
