package ThankingInJava.six;
import java.util.Arrays;
import java.util.Vector;
public class vector {
    public static void main(String[] args) {
        Vector aa=new Vector();
        Vector aa1=new Vector();
        aa.add("sdf");
        aa.add(2132);
        System.out.println("aa:"+aa);
        aa.add(1,"0000");
        System.out.println("aa:"+aa);
        System.out.println("aa.size():"+aa.size());//返回元素个数


        aa1.addAll(aa);
        System.out.println("aa1"+aa1);
        System.out.println("aa1.size():"+aa1.size());

        aa1.addElement(aa);
        System.out.println("aa1"+aa1);
        System.out.println("aa1.size():"+aa1.size());



        aa.add("sdf");aa.add(2132);aa.add("sdf");aa.add(2132);aa.add("sdf");
        aa.add(2132);aa.add("sdf");aa.add(2132);aa.add("sdf");aa.add("sdf");
        aa.add(2132);aa.add(2132);aa.add(2132);aa.add(2132);
        System.out.println("aa.size()="+aa.size());
        System.out.println("aa的容量="+aa.capacity());//当前容量，不是元素个数

        aa.addAll(0,aa1);
        System.out.println(aa);
    }
}
/**
 * public void add(int index, E element)//基本插入
 * 从index索引的位置添加element元素，后面的元素都往后移一位。
 *
 * public boolean addAll(int index, Collection<? extends E> c)
 * 从index索引位置开始添加c集合里所有的元素，后面的元素都往后移c.size()位。
 *
 * public void addElement(E obj)
 * 在集合后面添加一个元素，无论该元素是什么类型的，都会把他的toString()的返回值添加进去。
 *
 * public int capacity()
 * 返回此向量的当前容量，不是元素个数。
 *
 * public void copyInto(Object[] anArray)
 * 把集合中的元素复制到anArray数组中去
 *
 * public E elementAt(int index)
 *  返回索引位置的元素
 *
 *  public Enumeration<E> elements()
 * 返回集合的枚举
 *
 * public void ensureCapacity(int minCapacity)
 * 增加集合的容量，如果增大的容量小于10，那么无效，也就是增大容量要是10倍数
 * */