package bilibili.Calender0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * DateFormat类& SimpleDateFormat类
 * 构造      SimpleDateFormat(String s)//用s指定格式化对象
 * 成员方法：public final String format(Date date)将一个 Date 格式化为日期/时间字符串
 *          public Date parse(String source) throws ParseException从给定字符串的开始解析文本，以生成一个日期。该方法不使用给定字符串的整个文本。
 *
 * */
public class 时间输出转换为文本 {
    public static void main(String[] args)  {
        //demo1();
        demo2();
    }
    private static void demo2() {
        SimpleDateFormat date = new SimpleDateFormat("yyy年-MM月-dd日 HH时:mm分:ss秒");
            /**
             * 将文本转换为时间 date.parse返回的是date
             * */
        try {
            Date date1 = date.parse("2020年-2月-31日 23时:02分:16秒");
            String ss=date.format(date1);
            System.out.println(ss);
            System.out.println(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
    private static void demo1() {
        Date date=new Date();
        SimpleDateFormat demo1=new SimpleDateFormat("yyy年-MM月-dd日 HH时:mm分:ss秒");
        String text=demo1.format(date);//返回字符串
        System.out.println( text );
        System.out.println( date );
    }
}
