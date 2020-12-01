package ThankingInJava.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class test {
    public static void main(String[] args) throws IOException{

            /*fileoutputstream fos = new fileoutputstream("E:\\Java IDEA\\day01-code\\src\\ThankingInJava\\io\\test.txt");
            fos.write(97);
            fos.close();*/
        FileInputStream fis = new FileInputStream("E:\\Java IDEA\\day01-code\\src\\ThankingInJava\\io\\test.txt");
        FileOutputStream fos = new FileOutputStream("E:\\Java IDEA\\day01-code\\src\\ThankingInJava\\io\\test2.txt");
        byte[] buffer=new byte[50];
        int len;
        while ((len=fis.read(buffer))!=-1){
            fos.write(buffer,0,len);
        }
        fos.close();
        fis.close();
    }
}
