package szxy.io.b001;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class b005 {
    public static void main(String[] args) {
        FileReader fr;
        BufferedReader br;
        String ch;
        try{
            fr=new FileReader("E:\\Java IDEA\\day01-code\\src\\szxy\\io\\b001\\testfile02.txt");
            br=new BufferedReader(fr);
            while ((ch=br.readLine())!=null)
                System.out.println(ch);
            fr.close();
            br.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
