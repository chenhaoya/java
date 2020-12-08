package java_experiment.exp2;
/**
 * 对于 int 型变量 a，以最快的速度计算 34×a 的值。
 * */
public class experiment003 {
    public static void main(String[] args) {
        int a = 3;
        int b = (a << 5) + (a << 1);
        System.out.println(a + "*34=" + b);
    }
}
