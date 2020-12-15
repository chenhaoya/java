package 先拉取后提交;

import javax.swing.*;
import java.awt.*;

public class Demo07ButtonGroup extends JFrame {
    public static void main(String[] args) {
        Demo07ButtonGroup f = new Demo07ButtonGroup();
        f.setTitle("JRadioButton演示");
        f.setSize(360,100);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.add(new JLabel("专业"));
        ButtonGroup majorGroup = new ButtonGroup();
        String[] buttonsText={"软件","计算机","物联网","大数据"};
        JRadioButton[] buttons = new JRadioButton[buttonsText.length];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i]=new JRadioButton(buttonsText[i]);
            majorGroup.add(buttons[i]);
            f.add(buttons[i]);
        }
        buttons[3].setSelected(true);
        f.setVisible(true);
    }
}
