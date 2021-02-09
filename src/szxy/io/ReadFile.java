package szxy.io;

import java.io.File;
import java.io.FileInputStream;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("E:\\Java IDEA\\day01-code\\src\\szxy\\io\\ReadFile.txt");
        try {
            int len;
            byte[] by = new byte[1024];
            FileInputStream fis=new FileInputStream(file);
            while ((len = fis.read(by))!=-1){
                String str=new String(by,0,len);
                System.out.println("从文件Testfile2中读取的内容是："+str);
            }
            fis.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
