package java_experiment.exp4;
import java.util.Random;
import java.util.Scanner;
public class experiment001 {
    int[] init() {
        int[] a = new int[10];
        Random r = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = r.nextInt(100);
        }
        return a;
    }void print(int[] a) {
        for (int i = 0; i < a.length; i++) {

            System.out.printf("%-5d", a[i]);
        }
        System.out.println();
    }
    int findMax(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) { max = a[i];
            }
        }
        return max;
    }
    int findMin(int[] a) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) { min = a[i];
            }
        }
        return min;
    }
    int findLastLocation(int[] a, int x) {
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == x) {
                return i;
            }
        }
        return -1;
    }
    boolean isAsc(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true;
    }
    void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i]; a[i] = a[a.length - i - 1]; a[a.length - i - 1] = temp;
        }
    }
    public static void main(String[] args) {
        experiment001 t = new experiment001();
        int[] a = t.init();
        t.print(a);
        System.out.println("max=" + t.findMax(a));
        System.out.println("min=" + t.findMin(a));
        System.out.print("输入要查找的数：");
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int i = t.findLastLocation(a, x);
        if (i == -1) {
            System.out.println(x + "在数组中不存在。");
        } else {
            System.out.printf("Last location of %d: %。d\n", x, i);
        }
        if (t.isAsc(a)) {
            System.out.println("数组是非递减排列！");
        } else {
            System.out.println("数组不是非递减排列！");
        }
        t.reverse(a);
        System.out.println("翻转后的数组：");
        t.print(a);
    }

}
