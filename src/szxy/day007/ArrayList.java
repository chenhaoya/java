package szxy.day007;
import com.sun.javafx.image.impl.IntArgb;
import java.util.*;
 class ArrayList {
    public static void main(String[] args) {
        List<String> list=new java.util.ArrayList<String>();
        list.add("Beijing");
        list.add(0,"");
        list.add("Anhui");
        list.add("shanghai");
        list.remove(0);
        list.remove("Anhui");
        System.out.println(list);
    }
}
