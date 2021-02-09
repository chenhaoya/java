package szxy.day01.work002;
/**
* 从键盘输入一个百分之的成绩，输出五级制的成绩，使用switch结构实现
* */
import java.util.Scanner;
public class score {
    public static void main(String[] args) {
        Scanner aa=new Scanner(System.in);
        int val=aa.nextInt();
        switch(val/10){
            case 9:
                System.out.println("优秀");break;
            case 8:
                System.out.println("良好");break;
            case 7:
                System.out.println("一般");break;
            case 6:
                System.out.println("及格");break;
            default :
                System.out.println("不及格");break;
        }
    }
}
