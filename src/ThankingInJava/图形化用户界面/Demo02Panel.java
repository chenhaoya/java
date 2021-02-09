package ThankingInJava.图形化用户界面;

import java.awt.*;

public class Demo02Panel {
    public static void main(String[] args) {
        //创建window，对象，因为panel是一个借口，必须依附与window
        Frame frame = new Frame("Panel演示");
        //创建一个panel对象
        Panel panel = new Panel();
        //创建一个文本框，一个按钮，并放入Panel容器中
        panel.add(new TextField("这里是一个测试文本"));
        panel.add(new Button("这里是一个测试按钮"));
        //把panel放入到window中
        frame.add(panel);
        //设置window的位置、大小
        frame.setBounds(100,200,500,600);
        //设置window可见
        frame.setVisible(true);
    }
}
