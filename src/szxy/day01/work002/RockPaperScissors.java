package szxy.day01.work002;
import java.util.*;
public class RockPaperScissors {
    public static void main(String[] args) {
        //2(石头)    1(剪刀)    0(布)
        int a = new Random().nextInt(3);//随机生成一个0-3的数，不包括3
        Scanner aa = new Scanner(System.in);
        int val = aa.nextInt();
        switch(a){
            case 0:if(val==0) System.out.println("draw");
                        else if(val==1) System.out.println("you lost");
                        else System.out.println("you win");break;
            case 1:if(val==1) System.out.println("draw");
                        else if(val==0) System.out.println("you lost");
                        else System.out.println("you win");break;
            case 2:if(val==2) System.out.println("draw");
                        else if(val==1) System.out.println("you lost");
                        else System.out.println("you win");break;
        }
    }
}
