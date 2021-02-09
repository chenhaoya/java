package ThankingInJava.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * 把test2文件写入到test中
 * */
public class fileoutputstream {
    public static void main(String[] args) throws IOException {
        //test2();
        //testtest20();
        //test03();
        hello();
    }

    private static void hello() throws IOException {
        FileOutputStream fos = new FileOutputStream("E:\\Java IDEA\\day01-code\\src\\ThankingInJava\\io\\test2.txt");
        byte[] bytes = "你好".getBytes();
        System.out.println();
    }

    private static void test2() throws IOException {
        FileOutputStream fos1=new FileOutputStream("E:\\Java IDEA\\day01-code\\src\\ThankingInJava\\io\\test2.txt");
        //在test2中写入100
        fos1.write(49);
        fos1.write(48);
        fos1.write(48);
        fos1.close();
    }
    private static void testtest20() throws IOException{
        FileOutputStream fos=new FileOutputStream("E:\\\\Java IDEA\\\\day01-code\\\\src\\\\ThankingInJava\\\\io\\\\test.txt");
        //定义写入字节流指向文件
        FileInputStream fis=new FileInputStream("E:\\Java IDEA\\day01-code\\src\\ThankingInJava\\io\\test2.txt");
        byte[] bytes=new byte[50];
        int len;
        while((len=fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fis.close();
        fos.close();
    }

    private static void test03() throws IOException{
        FileOutputStream fos=new FileOutputStream(new File("E:\\Java IDEA\\day01-code\\src\\ThankingInJava\\io\\test03.txt"));
        byte[] bytes={33,55,77,22};
        /**如果输入第一个字符为复数，则会与后一个字符拼接为一个汉字
         * 并使用系统默认编码（GBK）
         * */
        fos.write(bytes);
        fos.close();
    }
}
