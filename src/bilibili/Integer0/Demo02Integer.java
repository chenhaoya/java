package bilibili.Integer0;
/**
 * 基本类型与字符串之间的转换
 * 基本类型-->字符串
 * 1.基本数据类型+"" (空字符串) 重点
 * 2.使用包装类的静态方法
 *      static String toString(int i)  返回一个表示指定整数的 String 对象。
 * 3.使用String类中的静态方法
 *      static String valueOf(int i)  返回 int 参数的字符串表示形式。
 *
 *字符串-->基本数据类型
 * 1.使用包装类静态方法parseXXX("字符串")
 *      Integer类: static int parseInt(String s)
 *      Double类： static double parseDouble(String s)
 *      ...
 * */
public class Demo02Integer {
    public static void main(String[] args) {
        demo1();//基本类型-->字符串
        demo2();//字符串-->基本数据类型
    }
    private static void demo2() {
        //1.
        int i = Integer.parseInt("1000");
        System.out.println(i+1);//1001
        //异常
        //int i1 = Integer.parseInt("a");
        //System.out.println(i1);//NumberFormatException: For input string: "a" 数字格式化异常
    }
    private static void demo1() {
        //1.
        String s=1000+"";
        System.out.println(s+111);//1000111
        //2.
        String s1 = Integer.toString(1000);
        System.out.println(s1+222);//1000222
        //3.
        String s2 = String.valueOf(1000);
        System.out.println(s2+333);//1000333
    }
}
