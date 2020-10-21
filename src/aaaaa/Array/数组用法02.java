package aaaaa.Array;
/**
 * 目的：数组和字符串之间的转换
 */

import java.util.*;
public class 数组用法02 {
    public static void main(String[] args) {
        /*将Sting转换为数组存储*/
        Scanner val=new Scanner (System.in);
        String ss;
        ss=val.nextLine();
        //定义字符串并从键盘获取

        //将字符串抓换为数组
        char []sz=ss.toCharArray();
        //或者：char []数组名=“word”.tocharArray();

        //将数组转换为字符串
        String ss2=new String(sz);
        //或者：String ss2=new String(new char[]{'w','o','r','d'});

        /**String ss3=String.valueOf(new char[]{'w','o','r','d'});//结果同上
         * 此知识点参考：常用使用类中字符串的相关API;
         * */

        char []newsz= Arrays.copyOf(sz,2*sz.length);
        //这里创建了一个newsz数组，他的长度是sz的二倍，并将括号内的条件值赋值过去

        char []newsz2=Arrays.copyOfRange(sz,1,sz.length);
        //这里创建了一个更新的newsz2数组，
        System.out.println(newsz2.length);
        System.out.println(Arrays.toString(newsz2));
    }
}
