package test;
/**
 * 目的：捕捉字符串中的某一位字符
 *       将其转换为Integer型并输出
 * */
public class test {
    public static void main(String[] args) {
        String aa="0123456789";
        int endNub=aa.length()-1;
        char s=aa.charAt(endNub);
        System.out.println("char:"+s+1);
        System.out.println("INt :"+Integer.parseInt(String.valueOf(s))+1);
    }
}

