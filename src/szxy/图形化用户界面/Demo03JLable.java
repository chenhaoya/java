package szxy.图形化用户界面;

import javax.swing.*;
import java.awt.*;

public class Demo03JLable {
    public static void main(String[] args) {
        JFrame f = new JFrame("JLable 应用");//创建窗口，标题确定
        f.setBounds(300,300,400,200);//设置位置、大小
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//可关闭
        f.setLayout(new FlowLayout());//设置窗口中组建布局
        JLabel lab1 = new JLabel("1.普通标签");//标签1
        JLabel lab2 = new JLabel("2.方正姚体标签");//创建标签2
        lab2.setFont(new Font("方正姚体",Font.BOLD,16));
        lab2.setOpaque(true);
        lab2.setBackground(Color.LIGHT_GRAY);
        lab2.setForeground(Color.WHITE);
        String html="<html><h1 align='center'>3.HTML:1号标题文字</h1></html>";
        JLabel lab3 = new JLabel(html);//标签3
        f.add(lab1);
        f.add(lab2);
        f.add(lab3);
        f.setVisible(true);
    }
}
