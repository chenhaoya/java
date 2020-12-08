package java_experiment.exp2;
/**
 * 字符型变量 ch 中存放着一个大小写未知的英文字母，判断其大小写后，将 ch 的值转为
 * 小写或大写字母（不允许使用加减运算符和 if 语句）。
 * */
public class experiment004 {
    public static void main(String[] args) {
        char ch = 'E'; ch = (char) ((ch & 32) == 0 ? ch |
                32 : ch & (Integer.MAX_VALUE- 32));
        System.out.println("ch1=" + ch);
    }
}
