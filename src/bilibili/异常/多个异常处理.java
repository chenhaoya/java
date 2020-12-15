package bilibili.异常;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
public class 多个异常处理 {
    public static void main(String[] args) {
/**        1.多个异常多次处理
        try {
            int[] arr = new int[3];
            System.out.println(arr[3]);//java.lang.ArrayIndexOutOfBoundsException: 3
        }catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
            System.out.println(e);
        }
        try {
            List<Integer> list = Arrays.asList(1, 2, 3);
            System.out.println(list.get(3));//java.lang.ArrayIndexOutOfBoundsException: 3
        }catch(IndexOutOfBoundsException e){
//            e.printStackTrace();
            System.out.println(e);
        }*/
//        2.多个异常一次捕获多次处理
        /***
         * 一个try多个catch注意事项：
         *        catch里面定义的异常变量，如果有父子类关系，那么子类的异常变量就必须写在上面，否则就会报错
         */
/*        try{
            int[]arr=new int[3];
            //System.out.println(arr[3]);
            List<Integer> list = new LinkedList<Integer>();
            list.add(1);
            System.out.println(list.get(3));
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch (IndexOutOfBoundsException e){
            System.out.println(e.toString());
        }*/
//        3.多个异常一次捕获一次处理
/*        try{
            int[] arr=new int[3];
            //System.out.println(arr[3]);
            LinkedList<Object> list = new LinkedList<>();
            list.add(1);
            System.out.println(list.get(3));
        }catch (Exception e){
            e.printStackTrace();
        }*/
        /**
         * 以上均为运行时异常，被抛出可以不处理，即不捕获也不声明抛出
         * 默认给jvm处理，终止程序，什么时候不抛出运行时异常了再来继续执行程序
         */

        System.out.println("后续代码");
    }
}
