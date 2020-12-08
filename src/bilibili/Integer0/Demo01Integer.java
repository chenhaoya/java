package bilibili.Integer0;

import java.util.ArrayList;

public class Demo01Integer {
    public static void main(String[] args) {
        demo1();
    }

    private static void demo1() {
        Integer i=222;//相当于：Integer i=new Integer(222);
        int j=i;      //        int j=i.intValue();
        System.out.println("Integer:"+i+"\nint:"+j);

        /**
         * 由于ArrayList集合不能存储整数，但能存储包装类
         * */
        ArrayList<Integer> list=new ArrayList<>();
        //向里面存放数据
        list.add(1);//这里存放的整数1就发生了自动装箱  list.add(new Integer(1));
        //取数据
        Integer integer = list.get(0);//可以用Integer来存放

        //也可用int ii=list.get(0);//这样就相当于int ii = list.get(0).intValue();
        // 这里就发生了自动拆箱
    }
}
