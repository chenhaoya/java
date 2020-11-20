package java_experiment.exp2;
/**
 *使用嵌套的条件运算符，求 a、b、c 中的最大者。
 * */
public class experiment005 {
    public static void main(String[] args) {
        int a = 2, b = 4, c = 3;
        int max = (a > b ? a : b) > c ? (a > b ? a : b) : c;
        System.out.println("max=" + max);
    }
}
