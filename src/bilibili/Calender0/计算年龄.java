package bilibili.Calender0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
/**
 * 1.使用Scanner获取出生日期
 * 2.使用DateFormat类中的方法parse，把字符传的出生日期转换为Date格式
 * 3.把Date格式的出生日期转换为毫秒值
 * 4.获取当前的日期，转换为毫秒
 * 5.使用当前日期的毫秒值-出生日期的毫秒值
 * 6.把毫秒值转换为天(s/1000/60/60/20)
 * */
public class 计算年龄 {
    public static void main(String[] args) throws ParseException {
       //1.使用Scanner获取出生日期
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入出生日期：格式为“yyyy-MM-dd”");
        String birthdayDateString=sc.next();
        //2.使用DateFormat类中的方法parse，把字符传的出生日期转换为Date格式
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate=sdf.parse(birthdayDateString);
        //3.把Date格式的出生日期转换为毫秒值
        long birthdayTime=birthdayDate.getTime();
        //4.获取当前的日期，转换为毫秒
        long today=new Date().getTime();
        //5.使用当前日期的毫秒值-出生日期的毫秒值
        long time=today-birthdayTime;
        //6.把毫秒值转换为天(s/1000/60/60/20)
        System.out.println(time/1000/60/60/24/365);
    }
}
