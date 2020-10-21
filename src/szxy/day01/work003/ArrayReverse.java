package szxy.day01.work003;
import java.util.*;
public class ArrayReverse {

    public static void main(String[] args) {
        Scanner val=new Scanner (System.in);
        int[]aa=new int[10];
        int a=aa.length;
       // for(int i:aa)
       for(int i=0;i<a;i++)
            aa[i]=val.nextInt();
       int temp;
        System.out.println(a);
        for(int i=0;i<a/2;i++){
            temp=aa[i];
            aa[i]=aa[a-i-1];
            aa[a-i-1]=temp;
        }
        System.out.println(Arrays.toString(aa));
    }

}
