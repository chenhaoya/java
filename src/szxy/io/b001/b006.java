package szxy.io.b001;

import java.io.IOException;
import java.io.RandomAccessFile;

public class b006 {
    public static void main(String[] args) {
        RandomAccessFile fileHandler=null;
        try {
            int[] data={100,200,300,400,500,600,700,800,900,1000};
            fileHandler=new RandomAccessFile("E:\\Java IDEA\\day01-code\\src\\szxy\\io\\b001\\testfile02.txt","rw");
            for (int i=0;i< data.length;i++)
                fileHandler.writeInt(data[i]);
            fileHandler.seek(4*2);
            System.out.println(fileHandler.readInt());
            for (int i=0;i<10;i+=2){
                fileHandler.seek(i*4);
                System.out.print(fileHandler.readInt()+" ");
            }
            System.out.println();
            fileHandler.seek(8);
            fileHandler.writeInt(350);
            for (int i=0;i<10;i++){
                fileHandler.seek(i*4);
                System.out.print(fileHandler.readInt()+" ");
            }
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (fileHandler!=null){
                try{
                    fileHandler.close();
                }catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
