package szxy.io.b001;

import java.io.FileReader;
import java.io.IOException;

public class b004 {
    public static void main(String[] args) {
        FileReader fr;
        int ch;
        try{
            fr=new FileReader("E:\\Java IDEA\\day01-code\\src\\szxy\\io\\b001\\testfile02.txt");
            while ((ch=fr.read())!=-1)
                System.out.print((char) ch);
            fr.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
