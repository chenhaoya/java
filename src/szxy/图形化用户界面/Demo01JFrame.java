package szxy.图形化用户界面;

import javax.swing.*;

public class Demo01JFrame {
    public static void main(String[] args) {
        JFrame win = new JFrame();//构造窗口
        JButton jb = new JButton();
        win.getContentPane().add(jb);
        win.setTitle("我是一个GUI程序");//
//        win.setLocation(300,300);//启动位置
//        win.setSize(400,400);//大小
        win.setBounds(300,300,400,400);//启动位置、窗口大小

        win.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//设置关闭
        win.setVisible(true);
    }
}
