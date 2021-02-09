package szxy.io;

import java.io.*;

public class a003 {
    public static void main(String[] args) {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream("E:\\Java IDEA\\day01-code\\src\\szxy\\io\\a002.txt");
            os = new FileOutputStream("E:\\Java IDEA\\day01-code\\src\\szxy\\io\\a003.txt");
            byte[] bs = new byte[1024];
            int len;
            while ((len = is.read(bs)) != -1) {
                os.write(bs, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (is != null)
                    is.close();
                if (os != null)
                    os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
