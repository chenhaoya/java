package ThankingInJava.图形化用户界面;

import java.awt.*;

public class Demo01Window {
    public static void main(String[] args) {
        //创建窗口对象
        Frame frame = new Frame("窗口");
        //设置窗口位置、大小
        frame.setLocation(300,300);
        frame.setSize(500,500);
        //是否可见
        frame.setVisible(true);
    }
}
