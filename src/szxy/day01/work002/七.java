package szxy.day01.work002;
/**
* 计算并输出1-1000直接含有7或者是7的倍数的整数之和及个数
* */
public class 七 {
    public static void main(String[] args) {
        int a,b,c;
        int sum=0,x=0;
        for (int i=1;i<1000;i++){
            if(i%7==0) {
                x++;
                sum += i;
            }
            else {
                a=i/100;
                b=(i-a*100)/10;
                c=i%10;
                if(a==7||b==7||c==7) {
                    x++;
                    sum += i;
                }
            }
        }
        System.out.println("sum="+sum+"\n个数："+x);
    }
}
