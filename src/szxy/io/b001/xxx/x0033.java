package szxy.io.b001.xxx;

import java.io.IOException;
import java.io.RandomAccessFile;
/**
 * 把几个int型整数写入tom.txt文件中，然后按相反顺序输出。
 * */
public class x0033 {
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf=new RandomAccessFile("E:\\Java IDEA\\day01-code\\src\\szxy\\io\\b001\\xxx\\tom.txt","rw");
        int[] ii={1,2,3,4,5,6,7,8,9};
        for (int i=0;i<ii.length;i++)
            raf.writeInt(ii[i]);
        raf.seek(32);
       // System.out.println(raf.readInt());
        for (int i=(int)raf.length()/4-1;i>=0;i--){
            raf.seek(i*4);
            System.out.print(raf.readInt());
        }
    }
}
