package java_experiment.exp2;

public class experiment001 {
    public static void main(String[] args) {
                  int a = 2, b = 3, result;
                  result = 2 * a * b / (a * a + b * b);
                  result =2*a*b/(int)(Math.pow(a,2)+Math.pow(b,2));
                  System.out.println("result=" + result);
              }
}

