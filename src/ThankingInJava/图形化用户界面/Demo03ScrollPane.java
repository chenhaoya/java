package ThankingInJava.图形化用户界面;

import java.awt.*;

public class Demo03ScrollPane {
    public static void main(String[] args) {
        Frame frame = new Frame("这里是一个ScrollPane演示");

        //创建一个ScrollPane对象
        ScrollPane sp = new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        //往ScrollPane中添加内容
        sp.add(new TextField("测试文本框"));
        sp.add(new Button("测试按钮"));
        //把ScrollPane添加到Frame中
        frame.add(sp);

        frame.setBounds(100,200,500,600);
        frame.setVisible(true);
    }
}
