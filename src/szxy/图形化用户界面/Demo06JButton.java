package szxy.图形化用户界面;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;

public class Demo06JButton {
    public static void main(String[] args) {
        JFrame f = new JFrame("JButton 演示");
        f.setSize(300,500);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton[] buttons=new JButton[5];
        for (int i = 0; i < 5; i++) {
            buttons[i]=new JButton();
            f.add(buttons[i]);
        }
        buttons[0].setText("普通按钮");
        buttons[1].setText("带快捷键的按钮(C)");
        buttons[2].setMnemonic(KeyEvent.VK_C);
        int k=buttons[1].getText().indexOf(KeyEvent.VK_C);
        buttons[1].setDisplayedMnemonicIndex(k);
        buttons[1].setText("禁用的按钮");
        buttons[2].setEnabled(false);
        buttons[2].setText("不带边框的按钮");
        buttons[3]
        buttons[3]
        buttons[4]
        buttons[4]
    }
}
