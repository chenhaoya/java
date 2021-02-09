package szxy.图形化用户界面;

import javax.swing.*;
import java.awt.*;

public class Demo04JTextField {
    public static void main(String[] args) {
        JFrame f = new JFrame("输入框Demo");
        f.setSize(240,200);
        f.setResizable(false);          //设置窗口不可放大缩小
        f.setLayout(new FlowLayout());
        JFrame labelUsername = new JFrame("用户名");
        JTextField tfdUsername = new JTextField(10);
        JPanel p1 = new JPanel();
        p1.add(labelUsername);
        p1.add(tfdUsername);
        JLabel labelPwd = new JLabel("密码");
        JPasswordField pfdPwd = new JPasswordField(10);
        pfdPwd.setEchoChar('*');
        JPanel p2 = new JPanel();
        p2.add(labelPwd);
        p2.add(pfdPwd);
        JButton btnLogin = new JButton("登录");
        JButton btnClear = new JButton("清除");
        JPanel p3 = new JPanel();
        p3.add(btnLogin);
        p3.add(btnClear);
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
