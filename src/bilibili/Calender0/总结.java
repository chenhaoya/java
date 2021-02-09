package bilibili.Calender0;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class 总结 {
    public static void main(String[] args) throws ParseException {
        //demo1();
        demo2();
    }
    private static void demo2() {
        Calendar c=Calendar.getInstance();//返回对象
        System.out.println(c.getTime());
        Date d=c.getTime();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        String time= sdf.format(d);
        System.out.println(time);
    }
    private static void demo1() throws ParseException {
        Date d=new Date();
        DateFormat df=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒");
        String s= df.format(d);
        System.out.println(s);

        String str="2222年0月22日";
        DateFormat dff=new SimpleDateFormat("yyyy年MM月dd日");
        Date dd=dff.parse(str);
        System.out.println(dd);
    }
}
