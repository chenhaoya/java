package bilibili.时间日历;

import sun.util.resources.cldr.aa.CalendarData_aa_ER;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
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
