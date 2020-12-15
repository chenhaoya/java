package 先拉取后提交;

import javax.swing.*;
import java.awt.*;

public class Demo08ButtonGroup extends JFrame {
    public static void main(String[] args) {
        Demo08ButtonGroup f=new Demo08ButtonGroup();
        f.setTitle("JCheckBox 演示");
        f.setSize(360,100);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.add(new JLabel("爱好:"));
        String[] chkText={"音乐","体育","网络","旅游"};

    }
}
 