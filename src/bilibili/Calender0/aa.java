package bilibili.Calender0;
//这里使用的是中八时间
import java.util.Date;
public class aa {
    public static void main(String[] args) {
        demo01();//当前时间
        demo02();
        System.out.println("System.currentTimeMillis():"+System.currentTimeMillis());
    }
    /**
     * 带参数构造方法date（long）
     * 历元加上参数值
     * */
    private static void demo02() {
        Date date=new Date(0l);
        System.out.println("历元："+date);
        date=new Date(1605798142092l);
        System.out.println("历元加当前时间的毫秒："+date);
    }
    /**
     * 空参数构造方法
     * 获取的就是当前的系统时间
     * 当时时间减去历元
     * */
    private static void demo01() {
        Date date=new Date();
        System.out.println("历元到当前时间："+date);
        System.out.println("当前时间转换为毫秒："+date.getTime());
        long time=date.getTime();
        System.out.println("time:"+time);
    }
}
