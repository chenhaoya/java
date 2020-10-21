package ThankingInJava.three;

import java.util.Arrays;
class aa{
    public static void main(String[] args) {
        Main.main(new String[]{"sdfa","554d","   "});
    }
}
public class Main {
    public static void main(String[] args) {
        for(String s:args)
            System.out.println(s);
        System.out.println(Arrays.toString(args));
    }

    /**
     * 第六课访问权限控制理解方法
     * 总结：不在同一个包里的文件通过import引入文件后可有访问public class，public method
     *       同一个package里的文件可有访问public class，public method，protected method；
     * */
    public void f(){
        System.out.println("我的位置在three的Main公共的f方法");
    }
    protected void x(){
        System.out.println("protected");
    }
}
