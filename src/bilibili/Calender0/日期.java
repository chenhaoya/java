package bilibili.Calender0;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class 日期 {
    public static void main(String[] args) {
        demo1();
    }
    private static void demo1() {
        Calendar aa=new GregorianCalendar();
        System.out.println(Calendar.YEAR);
        int year=aa.get(Calendar.YEAR);
        int month=aa.get(Calendar.MONTH);
        int day=aa.get(Calendar.DATE);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
}
