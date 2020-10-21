package aaaaa;

import java.util.Random;

public class 随机数值 {
    public static void main(String[] args){
        //获取一个0到1000的int型随机数到grade
        int grade;
        grade=new Random().nextInt(30);
        //grade=(int)(Math.random()*1000);
        System.out.println(grade);
        //***********************************************

    }
}
