package szxy.io;

import java.io.File;

public class a002 {
    public static void main(String[] args) {
        File file=new File("E:\\Java IDEA\\day01-code\\src\\szxy\\io\\a002.txt");
        if (file.exists()){
            String name = file.getName();
            String parent = file.getParent();
            long len = file.length();
            boolean bool = file.canWrite();
            System.out.println("文件名为："+name);
            System.out.println("文件目录为："+parent);
            System.out.println("文件大小为："+len+"bytes");
            System.out.println("是否为可改写文件:"+bool);
        }
    }
}
