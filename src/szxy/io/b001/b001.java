package szxy.io.b001;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class b001 {
    public static void main(String[] args) throws IOException {

            FileOutputStream fos=new FileOutputStream("E:\\Java IDEA\\day01-code\\src\\szxy\\io\\b001\\testfile.txt");
            BufferedOutputStream bos =new BufferedOutputStream(fos);
            String msg="BufferedOutputStream & BufferedOutputStream";
            byte[] ob=new byte[msg.length()];
            msg.getBytes(0,ob.length,ob,0);
            for (int i=0;i<5;i++)
                bos.write(ob,0,ob.length);
            bos.flush();
            bos.close();
    }
}
