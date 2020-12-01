package szxy.io;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

public class a006 {
    public static void main(String[] args) {
        try{
            File file=new File("E:\\Java IDEA\\day01-code\\src\\szxy\\io\\a006.txt");
            FileInputStream fis=new FileInputStream(file);
            BufferedInputStream bis=new BufferedInputStream(fis);
            int count=0;
            bis.mark(50);
            for(int i=0;i<file.length();i++){
                count++;
                int read=bis.read();
                if(count%10==0)
                    bis.reset();
                System.out.print((char)read+" ");
            }bis.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
