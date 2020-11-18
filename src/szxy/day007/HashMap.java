package szxy.day007;
import java.util.*;
public class HashMap {
    public static void main(String[] args) {
        Book books=new Book();
        java.util.HashMap<Integer,String> map2=new java.util.HashMap< Integer,String>();
        map2.put(1,"赵");
        map2.put(2,"钱");
        map2.put(3,"孙");
        map2.put(4,"李");
        System.out.println(map2);
        System.out.println(map2.size());
        System.out.println(map2.get(3));
        map2.remove(2);
        System.out.println(map2);
        System.out.println(map2.size());
    }
}
class Book{
    java.util.HashMap<Integer,String> map=new java.util.HashMap<Integer,String>();
    Book(){
        map.put(195,"三字经");
        map.put(576,"百家姓");
        map.put(283,"千字文");
        map.put(476,"弟子规");
    }
    String getName(int amount){
        if(map.containsKey(amount)){
            return map.get(amount);
        }
        return "NOT Found";
    }

}