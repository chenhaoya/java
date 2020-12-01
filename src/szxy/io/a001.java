package szxy.io;

import java.io.IOException;
import java.io.InputStream;

public class a001 {
    public static void main(String[] args) {
        InputStream is=System.in;
        try{
            byte[] bs=new byte[1024];
            int len=is.read(bs);
            String str=new String(bs);
            System.out.println("输入内容："+str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
