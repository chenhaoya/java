package bilibili.Generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 不使用泛型的
 *  好处：默认类型就是object类，可以存储各种数据类型
 *  弊端：不安全会发生异常
 * */
public class 泛型 {
    public static void main(String[] args) {
        //demo01();//不使用泛型
        demo02();//使用泛型
    }

    private static void demo02() {
        /**
         * 使用泛型好处：避免了数据类型的转换，存储什么类型的数据，取出来就是什么类型的
         * 使用泛型弊端:只能存储一种数据类型
         * 特点：把运行期异常提升到了编译期
         * */
        ArrayList<String> list = new ArrayList<>();
        list.add("aaa");
        //list.add(111);报错
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String s=it.next();
            System.out.println(s);

            System.out.println(s.length());
        }
    }

    private static void demo01 () {
        ArrayList list=new ArrayList();//这里就没有写它的泛型；没有尖括号默认就是Object型
        list.add("aaa");
        list.add(111);
        Iterator it= list.iterator();
        while (it.hasNext()){
            //取出元素也是Object类型
            Object obj = it.next();
            System.out.println(obj);
            /**
             * 想要使用String类特有的方法，length获取字符串的长度；不能使用因为超类不能使用子类的特有方法  多态Object obj="abc";
             * 需要向下转型
             * 会抛出ClassCastException类型转换异常，不能把这里的Integer类型转换为String类型
             * */
         //   String s = (String) obj;报错
        //    System.out.println(s.length());
        }
    }
}
