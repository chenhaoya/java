package szxy.day008;

public class ArrayUnusual {

     static void test(int i)throws Exception{
        int [] arr ={4,9,8,8,7};
        if(i>=arr.length)
                throw new Exception("数组下标越界了！");
        else
            System.out.println("程序正常运行");
    }
    public static void main(String[] args) throws Exception{
        test(5);
        System.out.println("aaa");
    }
}
