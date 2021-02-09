package java_experiment.exp5;
import java.util.GregorianCalendar;
public class experiment004 {
    public static void main(String[] args) {
        MyDate d1 = new MyDate(2014, 3, 12);
        MyDate d2 = new MyDate(2012, 5, 5);
        MyDate d3 = new MyDate(2013, 3, 12);
        d1.print("d1");
        d2.print("d2");
        d3.print("d3");
        System.out.println("d3 是该星期的第 " + d3.getDayOfWeek() + " 天");
        System.out.println("d3 是该月的第 " + d3.getDayOfMonth() + " 天");
        System.out.println("d3 是该年的第 " + d3.getDayOfYear() + " 天");
        d1.getAfterDate(50).print("d1 的 50 天后");
        d2.getBeforeDate(365).print("d2 的 365 天前");
        System.out.println("d2 和 d3 间相差 " + d2.daysBetweenWith(d3) + " 天");
    }
}
          class MyDate extends GregorianCalendar {
            MyDate(int year, int month, int day) {
                  super(year, month - 1, day);
              }
              int getYear() {
                  return super.get(YEAR);
              }
             int getMonth() {
                  return super.get(MONTH) + 1;
             }
              int getDayOfYear() {
                  return super.get(DAY_OF_YEAR);
              }
              int getDayOfMonth() {
                  return super.get(DAY_OF_MONTH);
              }
              int getDayOfWeek() {
                 return super.get(DAY_OF_WEEK);
             }
              MyDate getBeforeDate(int beforeDays) {
                  long time = super.getTimeInMillis() - beforeDays * 24L * 60 * 60 * 1000;
                  GregorianCalendar gc = new GregorianCalendar();
                  gc.setTimeInMillis(time);
                 return new MyDate(gc.get(YEAR), gc.get(MONTH) + 1, gc.get(DAY_OF_MONTH));
              }
              MyDate getAfterDate(int afterDays) {
                 long time = super.getTimeInMillis() + afterDays * 24L * 60 * 60 * 1000;
                 GregorianCalendar gc = new GregorianCalendar();
                  gc.setTimeInMillis(time);
                  return new MyDate(gc.get(YEAR), gc.get(MONTH) + 1, gc.get(DAY_OF_MONTH));
              }
              int daysBetweenWith(MyDate d) {
                  long t1 = super.getTimeInMillis();
                  long t2 = d.getTimeInMillis();
                  return (int) (Math.abs(t1 - t2) / (24 * 60 * 60 * 1000));
              }
              void print(String name) {
    System.out.printf("%-4s: %d-%d-%d\n", name, getYear(), getMonth(), getDayOfMonth());
              }
  }
