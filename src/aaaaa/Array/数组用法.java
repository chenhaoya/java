package aaaaa.Array;
/**
 * 描述：1.java中每个数组都有长度记录工具 .length
 *      2.数组只读式遍历 for(elemetype i:aa) sout i;
 *      3.Array.toString(aa)将aa数组转化为字符串输出或赋值给String型变量
 *      4.
 * */
import java.util.Arrays;
import java.util.Scanner;

public class 数组用法 {
    public static void main(String[] args) {
        int []a=new int[5];//一维数组

        int[][] b=new int[5][5];//二维数组

        Scanner val=new Scanner (System.in);
        //java中 每一个数组都有一个length属性描述这个数组的长度
        for(int i=0;i<a.length;i++){
            a[i]=val.nextInt();
        }

        //数组输出方法一
        for(int i:a)
            System.out.print(i);//只读式遍历
        System.out.println();
        //把数组a的值交给i 冒号相当于in
        //数组输出方法二
       //System.out.println(Arrays.toString(a));

        /*
        * 利用Array类中的toString方法
        * 调用Array.toString(a)，返回一个包含数组元素的字符串，这些元素被放置在括号内，并用逗号分开
        * 说明：System.out.println(array);这样是不行的，这样打印是的是数组的首地址。
        * */

        //数组的复制
        int[] source ={1,2,3,4,5,6};//源数组
        int[] dest={10,9,8,7,6,5,4,3,2,1,0};//目的数组
        /*复制源数组中从下标0开始的source.length个元素到
        * 目的数组，从下标1的位置开始存储
        * */           //源数组   源数组起始位置    目标/接受数组   从第几位开始存放     拿source多长的数据到dest
        System.arraycopy(source,     0,        dest,    1,           source.length);
        String dd;
        System.out.println(Arrays.toString(dest));
        dd= Arrays.toString(source);
        System.out.println(dd);
    }
}
