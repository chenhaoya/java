package szxy.图形化用户界面;

import javax.swing.*;
import java.awt.*;

public class Demo02JPanel {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setLayout(null);
        f.setSize(260,180);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel p1 = new JPanel();
        JPanel p2 = new JPanel();
        JButton btn1 = new JButton("按钮一");
        JButton btn2 = new JButton("按钮二");
        JButton btn3 = new JButton("按钮三");
        p1.add(btn1);
        p1.setBounds(5,10,80,60);
        p1.setBackground(Color.LIGHT_GRAY);

        p2.add(btn2);
        p2.add(btn3);
        p2.setBounds(40,50,80,70);
        p2.setBackground(Color.BLACK);
        f.add(p1);
        f.add(p2);
        f.setVisible(true);
    }
}
