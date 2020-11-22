package bilibili.collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * 1. boolean add(E e);        向集合中添加元素
 * 2. boolean remove(E e);     删除集合中的某个元素
 * 3. void clear();            清空集合中所有元素
 * 4. boolean contains(E e);   判断集合中是否含有某个元素
 * 5. boolean isEmpty();       判断集合是否为空
 * 6. int size();              获取集合的长度
 * 7. Object[] toArray();      将集合转换为一个数组
 * */

public class test01 {
    //static Collection<String> coll=new ArrayList<>();
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<>();
        demo01(coll);
        //demo02(coll);
        //demo03(coll);
        //demo04(coll);
        demo07(coll);
    }

    private static void demo07(Collection<String> coll) {
        Object[] arr = coll.toArray();
       /// for(Object a:arr)
        //    System.out.println(a);
        for (int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }

    private static void demo04(Collection<String> coll) {
        System.out.println("时候存在某个元素："+coll.contains("hello4"));
    }

    private static void demo03(Collection<String> coll) {
        coll.clear();
        System.out.println(" 清 除 所 有："+coll);
    }

    private static void demo02(Collection<String> coll) {
        System.out.println("  删  除  前："+coll);
        System.out.println("是否删除成功："+coll.remove("hello2"));
        System.out.println("  删  除  后："+coll);
    }
    private static void demo01(Collection<String> coll) {
        coll.add("hello1");
        coll.add("hello2");
        coll.add("hello3");
        coll.add("hello4");
        coll.add("hello5");
    }
}
