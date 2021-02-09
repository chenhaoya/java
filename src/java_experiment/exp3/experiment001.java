package java_experiment.exp3;

public class experiment001 {
    public static void main(String[] args) {
        long sum = 0;
        for (int i = 1; i <= 8; i++) {
            long num = 0;
            for (int j = 1; j <= i; j++) {
                num = num * 10 + 8;
            }
            sum+=num;
        }
        System.out.println(sum);
    }
}