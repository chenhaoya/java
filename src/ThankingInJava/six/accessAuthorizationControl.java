package ThankingInJava.six;
import java.util.*;
import ThankingInJava.three.Main;//加入其它包的public类和方法
//或者import ThankingInJava.three.*;引入three package里所有文件
//这里引入了three package里的Main文件
//则可访问Main函数里的所有public的class和method
/**
 * 第六课访问权限控制理解方法
 * 总结：不在同一个包里的文件通过import引入文件后可有访问public class，public method
 *       同一个package里的文件可有访问public class，public method，protected method；
 * */
public class accessAuthorizationControl {
    public static void main(String[] args) {
        new Main().f();
    }
}
