package bilibili.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
/**
 *    boolean hasNext() 如果仍有元素可以迭代，则返回 true。
 *    E next()  返回迭代的下一个元素。
 *    public interface Iterable<T>实现这个接口允许对象成为 "foreach" 语句的目标。
 * */
public class demo01Iterator {
    public static void main(String[] args) {
        Collection<String> aa=new ArrayList<>();
        demo02(aa);
        demo01(aa);
        demo03(aa);//public interface Iterable<T>实现这个接口允许对象成为 "foreach" 语句的目标。
    }
    private static void demo03(Collection<String> aa) {
        for(String s:aa)                    //增强for他的内就是使用了Iterator迭代器
            System.out.println(s);
    }
    private static void demo02(Collection<String> aa) {
        aa.add("001");
        aa.add("002");
        aa.add("003");
        aa.add("004");
        aa.add("005");
    }
    private static void demo01(Collection<String> aa) {
        System.out.println(aa);
        /**多态   接口          实现类对象*/
        Iterator<String> it=aa.iterator();
                            //这里获取迭代器的实现对象，并会把指针(索引)指向-1位置；

        System.out.println(it.hasNext());
        String s = it.next();
        System.out.println("s="+s);
        while(it.hasNext())//这里：判断这个集合中还有没有下一个元素
            System.out.println(it.next());//这里的it.next()做了两件事情，第一：返回下一个元素。第二：向后移动指针
        System.out.println(aa);
    }
}
