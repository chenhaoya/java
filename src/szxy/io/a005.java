package szxy.io;

import javafx.scene.chart.ScatterChart;
/**
 * 将a0051.txt内容放到a002.txt中
 * */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class a005 {
    public static void main(String[] args) {
        copyFile("E:\\Java IDEA\\day01-code\\src\\szxy\\io\\a0051.txt","E:\\Java IDEA\\day01-code\\src\\szxy\\io\\a0052.txt");
    }

    private static void copyFile(String s, String s1) {
        FileInputStream fis=null;
        FileOutputStream fos=null;
        byte[]buffer=new byte[1024];
        int len=0;
        try{
            fis=new FileInputStream(s);
            fos=new FileOutputStream(s1);
            while((len=fis.read(buffer))!=-1)
                fos.write(buffer,0,len);
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try {
                if (fos != null)
                    fos.close();
            }catch(IOException e){
                e.printStackTrace();
            }
            try{
                if(fis!=null)
                    fis.close();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
}
