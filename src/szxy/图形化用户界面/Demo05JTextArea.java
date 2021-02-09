package szxy.图形化用户界面;

import javax.swing.*;

public class Demo05JTextArea {
    public static void main(String[] args) {
        JFrame f = new JFrame("JTextArea演示");
        f.setLayout(null);
        f.setSize(260,180);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea ta1 = new JTextArea();
        ta1.setBounds(5,5,140,40);

        JTextArea ta2 = new JTextArea("初始文字");
        ta2.setLineWrap(true);
        JScrollPane sp = new JScrollPane(ta2);
        sp.setBounds(5,50,140,70);
        f.add(ta1);
        f.add(sp);
        f.setVisible(true);
    }
}
