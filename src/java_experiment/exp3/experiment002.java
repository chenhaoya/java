package java_experiment.exp3;
import java.util.*;
public class experiment002 {
    public static void main(String[] args) {
        int rows;
        Scanner s = new Scanner(System.in);
        System.out.print("输入行数:"); rows = s.nextInt();
        int firstNumOfRow = 1, nextNumOfRow;
        for (int i = 1; i <= rows; i++) {
            firstNumOfRow += i - 1;
            int firstStepOfRow = i + 1; nextNumOfRow = firstNumOfRow;
            for (int j = 1; j <= rows + 1 - i; j++) {
                System.out.printf("%-4d", nextNumOfRow);
                nextNumOfRow += firstStepOfRow++;
            }
            System.out.println();
        }
    }

}
