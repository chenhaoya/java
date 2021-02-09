package java_experiment.exp2;
/**
 * 逆序输出一个 7 位整数，如 8639427 输出为 7249368（不允许使用循环语句）。
 * */
public class experiment002 {
    public static void main(String[] args) {
        long a = 8639427;
        System.out.print(a % 10);
        System.out.print(a / 10 % 10);
        System.out.print(a / 100 % 10);
        System.out.print(a / 1000 % 10);
        System.out.print(a / 10000 % 10);
        System.out.print(a / 100000 % 10);
        System.out.print(a / 1000000 % 10);
    }
}
