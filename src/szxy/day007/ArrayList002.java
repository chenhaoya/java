package szxy.day007;
import java.util.*;
class ArrayList002 {
    public static void main(String[] args) {
        java.util.List list=new java.util.ArrayList<String>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("first");
        System.out.println(list);
        Set set=new java.util.HashSet<String>();
        set.addAll(list);
        System.out.println(set);
        Iterator<String> it=set.iterator();
        System.out.println("集合中的元素是：");
        while(it.hasNext()){
            System.out.println(it.next()+"  ");
        }
    }
}
