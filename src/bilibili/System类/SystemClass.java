package bilibili.System类;

import java.util.Arrays;
/**
 * System.currentTimeMillis()属于System类的方法，其作用就是获取当前系统时间
 * 格式为毫秒
 * 通常用于计算一个循环等的前一时刻和后一时刻之间所用的时间
 *
 * 格式：public static void arraycopy(Object src,int srcPos, Object dest,int destPos,int length)
 * src:源数组     srcPos：原数组起点    解释：准备从src这数组的srcPos位置开始拷贝
 * Dest：目标数组 destPos：目标数组起点 解释：把从src数组拷贝的东西放入目标数组，从destPos位置开始放入，放入多少根据length参数
 * length：拷贝多少，放入多少
 * */
public class SystemClass {
    public static void main(String[] args) {
        //demo1();//时间
        //demo2();//复制数组
    }
    private static void demo2() {
        int [] src={1,2,3,4,5};
        int [] dest={6,7,8,9,10};
        System.arraycopy(src,0,dest,0,3 );//function
        System.out.println(Arrays.toString(dest));//function
    }
    private static void demo1() {
        long s = System.currentTimeMillis();//function
        for(int i=0;i<10000;i++){
            System.out.println(i);
        }
        System.out.println();
        long e = System.currentTimeMillis();//function
        System.out.println((e-s));
    }
}
