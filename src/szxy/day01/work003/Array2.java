package szxy.day01.work003;
import java.util.*;
public class Array2 {
    public static void main(String[] args) {
        int [][]aa=new int[3][5];
        int sum=0,max=22222222,min=-222222222;//更好的方式是：先从键盘获取两个数分别给max和min在做比较
        Scanner val=new Scanner (System.in);
        for (int i=0;i<3;i++)
            for(int j=0;j<5;j++){
                aa[i][j]=val.nextInt();
                sum+=aa[i][j];
                if(max<aa[i][j])
                    max=aa[i][j];
                if(min>aa[i][j])
                    min=aa[i][j];
            }
        System.out.println("最大值："+max+"\n最小值："+min+"\n平均值："+sum/15.0f);
    }
}
