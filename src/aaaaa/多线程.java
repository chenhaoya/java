package aaaaa;
//什么是多线程：
//随机执行
/**
 * 多线程关键字在类名后加上：extends Thread
 * */
public class 多线程 {
    public static void main(String[] args) {
        Thread tt=new aaaaa();
        tt.start();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("运行了main方法");
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
class aaaaa extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("运行了run方法");
                Thread.sleep(100);
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
