package test;

import java.util.Date;

public class test2 {
    public static void main(String[] args) {
        demo01();
        demo02();
    }

    private static void demo02() {
        Date date2=new Date(1605797932664l);
        System.out.println(date2);
    }

    private static void demo01() {
        Date date=new Date();
        System.out.println(date);
        System.out.println(date.getTime());
    }
}