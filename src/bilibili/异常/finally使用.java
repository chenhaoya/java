package bilibili.异常;

import java.io.IOException;
public class finally使用 {
    public static void main(String[] args) {
        System.out.println(getA());
        try {
            readfile("D:\\a.txt");
            /***
             * 如果上一句出现的异常就会跳转到catch中，下面的输出代码就不会运行
             * 此时就需要使用finally
             */
            System.out.println("异常下面代码");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            /**无论是否出现异常这里代码都会正常执行*/
            System.out.println("资源释放");
        }
        System.out.println("程序继续运行");
    }

    static  int getA(){
        /**
         * 如果finally有return语句，永远返回finally中的结果，应避免这种return
         */
        int a=1;
        try{
            return a;
        }catch (Exception e){
            e.printStackTrace();
        }finally{
            a=100;
            return a;
        }
    }
    static void readfile(String filename) throws IOException {
        if(!filename.endsWith(".txt")){
            throw new IOException("路径异常");
        }
        System.out.println("路径没有问题");
    }
}
