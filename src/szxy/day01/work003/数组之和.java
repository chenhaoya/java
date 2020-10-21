package szxy.day01.work003;
/**
 * 编写一个方法，计算给定的两个数组之和，格式如下
 * public static int[] sumArray(int[] a,int[]b)
 * 要求返回的数组是两个参数数组对应元素之和，不对应的元素直接赋值给对应的位置，例：{1,2,4} +{2,4,6,8}={3,6,10,8}
 * */
import java.util.*;
public class 数组之和 {
    public static void main(String[] args) {
        Scanner val=new Scanner(System.in);
        System.out.print("第一个数组长度：");
        int x=val.nextInt();
        int []aa=new int[x];
        for (int i=0;i<x;i++)
            aa[i]=val.nextInt();
        System.out.print("第二个数组长度：");
        int y=val.nextInt();
        int []bb=new int[y];
        for (int i=0;i<y;i++)
            bb[i]=val.nextInt();

        if(x>y){System.out.println(Arrays.toString(sumArray(aa,bb)));}
        else {System.out.println(Arrays.toString(sumArray(bb,aa)));}

    }
    public static int[] sumArray(int[]a,int[]b){
        for(int i=0;i<b.length;i++)
            a[i]+=b[i];
        return a;
    }
}
