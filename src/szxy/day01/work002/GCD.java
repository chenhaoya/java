package szxy.day01.work002;
import java.util.Scanner;
/**
 * 输入两数，计算两个数的最大公约数
 * */
public class GCD {
    public static void main(String[] args) {
        int a,b;
        Scanner aa=new Scanner(System.in);
        a=aa.nextInt();
        b=aa.nextInt();
        int x,y;
        x=a>b?a:b;
        y=a<b?a:b;
        for (int i=y;y>0;i--){
            if(x%i==0&&y%i==0){
                System.out.println(i);
                break;
            }
        }
    }
}
