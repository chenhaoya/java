package ThankingInJava.图形化用户界面;

import java.awt.*;

public class Demo04FlowLayout {
    public static void main(String[] args) {
        Frame frame = new Frame();
        //通过setLayout方法设置容器的布局管理器
//        frame.setLayout(new FlowLayout(FlowLayout.CENTER,20,30));//居中对齐
//        frame.setLayout(new FlowLayout(FlowLayout.LEFT,20,30));//左对齐
        frame.setLayout(new FlowLayout(FlowLayout.RIGHT,20,30));
        //添加多个按钮到frame中
        for (int i = 0; i < 100; i++) {
            frame.add(new Button("按钮"+i));
        }
        //设置最佳大小，pack方法
        frame.pack();

        frame.setVisible(true);
    }
}
