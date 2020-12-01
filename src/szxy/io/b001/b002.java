package szxy.io.b001;

import java.io.*;

public class b002 {
    public static void main(String[] args) throws IOException {
        DataOutputStream dos=new DataOutputStream(new FileOutputStream("E:\\Java IDEA\\day01-code\\src\\szxy\\io\\b001\\testfile02.txt"));
        dos.writeUTF("今天是2020年12月1日");
        //dos.writeChars("今天是2020年12月1日");
        dos.close();
        DataInputStream dis=new DataInputStream(new FileInputStream("E:\\Java IDEA\\day01-code\\src\\szxy\\io\\b001\\testfile.txt"));
        System.out.println(dis.readUTF());
        dis.close();
    }
}
