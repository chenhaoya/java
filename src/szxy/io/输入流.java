package szxy.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class 输入流 {
    public static void main(String[] args) {
        File file1=new File("E:\\Java IDEA\\day01-code\\src\\szxy\\io\\输入流01");
        File file2=new File("E:\\Java IDEA\\day01-code\\src\\szxy\\io\\输入流02");
        //File file3=new File("E:\\Java IDEA\\day01-code\\src\\szxy\\io\\输入流03");
        FileInputStream fis=null;
        FileOutputStream fos1=null;
        byte[] buffer=new byte[100];
        //fileoutputstream fos2=null;
        try{
            fis=new FileInputStream(file1);
            fos1= new FileOutputStream(file2);
            int len=0;
            while((len=fis.read(buffer))!=-1){
                fos1.write(buffer,0,len);
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            try{
                if(fis!=null)
                    fis.close();
            }catch(IOException e){
                e.printStackTrace();
            }
            try{
                if(fos1!=null)
                    fos1.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }

    }
}
