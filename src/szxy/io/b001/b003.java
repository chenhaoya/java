package szxy.io.b001;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class b003 {
    public static void main(String[] args) throws IOException{
        ReadingFile myFirstRead = new ReadingFile("E:\\Java IDEA\\day01-code\\src\\szxy\\io\\b001\\testfile02.txt");
        myFirstRead.readFromFile();
    }
    public static class ReadingFile{
        private File file=null;
        public ReadingFile(String str){
                file = new File(str);
        }
        void readFromFile()throws IOException{
            FileReader reader = new FileReader(file);
            char[] buf=new char[1024];
            while (reader.read(buf) != -1)
                System.out.println(buf);
            reader.close();
        }
    }
}
