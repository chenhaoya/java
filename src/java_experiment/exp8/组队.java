package java_experiment.exp8;
public class 组队 {
    public static void main(String[] args) {
        String[] s = {"王一","小二","张三", "李四", "王五", "赵六", "小七", "老八"};
        Player p=new Player(s);
        Thread A = new Thread(p);
        Thread B = new Thread(p);
        A.setName("A");
        B.setName("B");
        A.start();
        B.start();
        while(A.isAlive() || B.isAlive()){
            //没有while循环99%的几率会先执行print，因为一共有三个线程在执行
        }
        System.out.println("各个队伍人员已满，5s后开始游戏！");
    }
}
class Player implements Runnable{
    private String[] player;
    static int index = 0;
    public Player(String[] player){
        this.player = player;
    }
    @Override
    public void run() {
        int cnt = 0;
        while (cnt < 4) {
            synchronized (Player.class) {
                try {
                    Thread.sleep(100);
                    cnt++;
                    System.out.println(player[index++] + "加入" + Thread.currentThread().getName() + "组");
                    if (cnt == 4)
                        System.out.println(Thread.currentThread().getName() + "组准备就绪");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
