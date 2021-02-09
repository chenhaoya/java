package java_experiment.exp3;

public class experiment003 {
        public static void main(String args[]){//定义main函数
            Smith.print();
        }
}
 class Smith {//定义类

     public static void print() {//定义输出函数
         int i, p;
         int sum1, sum2;//定义各位数字之和，全部素数因子之和
         int temp;//起替换作用
         for (int n = 10; n <= 400; n++) {
             sum1 = 0;
             sum2 = 0;
             temp = n;//替换n的值
             p = n;//记住本次循环 中n的值
             i = 2;
             while (temp > 0) {//求出各位数字之和
                 sum1 += temp % 10;
                 temp = temp / 10;
             }
             while (n > i) {//求出每个数的素数因子
                 if (p % i == 0) {
                     p = p / i;
                     temp = i;//替换因子 i的值
                     while (temp > 0) {//求出全部素数因子的数字之和sum2
                         sum2 += temp % 10;
                         temp = temp / 10;
                     }
                 } else {
                     i++;
                 }
             }
             if (sum1 == sum2) {
                 System.out.print(n + " ");
             }
         }
     }
 }