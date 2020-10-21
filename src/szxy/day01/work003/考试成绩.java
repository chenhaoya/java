package szxy.day01.work003;
import java.util.Arrays;
public class 考试成绩 {
    public static void main(String[] args) {
        int[][] xs = {
                {80, 75, 87, 93},
                {67, 87, 98, 65},
                {86, 72, 60, 76},
                {76, 80, 76, 63},
                {82, 70, 90, 67},
        };
            int[] sum = new int[5];
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 4; j++) {
                    sum[i] += xs[i][j];
                }
            }
            System.out.println(Arrays.toString(sum));//输出一行的和
        {
            int[] max = new int[4];
            for (int j = 0; j < 4; j++) {
                max[j] = xs[0][j];
                int id = 0;
                for (int i = 0; i < 5; i++)
                    if (xs[i][j] > max[j]) {
                        max[j] = xs[i][j];
                        id = i;
                    }
                System.out.println(Arrays.toString(xs[id]));
            }
        }

        int zcj = 0;
        int id = 0;
        for (int i = 0; i < 5; i++) {
            if (sum[i] > zcj) {
                zcj = sum[i];
                id = i;
            }
        }
        System.out.println(Arrays.toString(xs[id]));

    }
}
