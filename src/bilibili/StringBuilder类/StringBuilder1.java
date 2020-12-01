package bilibili.StringBuilder类;
/**
 * 构造方法
 * StringBuilder();创建一个空字符缓冲区对象
 * StringBuilder(String s);创建一个字符缓冲区对象
 * 成员方法
 * StringBuilder append(Object obj) 添加类容
 * StringBuilder reverse();         反转内容
 * String toString()      将缓冲区内容为字符串
 *
 * String       :字符串底层时用final修饰的数组，不能改变呃，是一个常量。
 *               如果需要改变则需要把原值放入字符缓冲区再与待拼接的字符串做运算
 * StringBuilder:可有看成一个可变长的字符串，底层也是一个数组，但没有被final修饰
 *               byte[] value=new byte[16];
 * */
public class StringBuilder1 {
    public static void main(String[] args) {
        demo1();//String和StringBuilder之间的互相转换
        demo2();//StringBuilder理解
    }
    private static void demo2() {
        StringBuilder bu=new StringBuilder("aaa");
        System.out.println("bu:"+bu);
        StringBuilder bu1=bu.append("abc");
        System.out.println("bu1:"+bu1);
        /***
         *  返回true可见，append方法返回的是当前对象自身
         *  他们的地址是相同的
         *  它们是同一个对象
         *  */
        System.out.println("bu1=bu?:  "+(bu1==bu));
        /**
         * 根据返回值是他自生可理解出：无需创建新的类来接收拼接后的对象
         * */
        StringBuilder bb=new StringBuilder("bb");
        System.out.println("bb:"+bb);
        bb.append("append");
        System.out.println("bb.append:"+bb);

        /**bb.append(1);
         bb.append(2.3);
         bb.append("aa");
         bb.append('中');
         System.out.println(bb);
         同时也可以写成下面
         */
        bb.append(1).append(2.3).append("aa").append('中').append(true);
        System.out.println(bb);
    }
    private static void demo1() {
        /**
         * 目的：String和StringBuilder之间的互相转换
         * */
        String ss="String";
        StringBuilder sb=new StringBuilder(ss);//通过StringBuilder的构造方法将String转换为StringBuilder
        String aa=sb.toString();
    }
}


