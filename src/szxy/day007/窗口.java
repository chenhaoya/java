package szxy.day007;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class 窗口 extends JFrame implements ItemListener {
    JRadioButton b1,b2;
    ButtonGroup bGroup;
    JLabel label;
    JScrollPane scroll;
    JPanel panel;
    JSplitPane split;
    窗口(){
        setSize(200,100);
        bGroup =new ButtonGroup();
        setTitle("使用集合创建单选按钮");
        Container c=getContentPane();
        java.util.List list=new java.util.ArrayList<String>();
        list.add("Java");
        list.add("C");
        panel=new JPanel();
        label=new JLabel();
        scroll=new JScrollPane(label);
        b1=new JRadioButton((String)list.get(0));
        b2=new JRadioButton((String)list.get(1));
        bGroup.add(b1);
        bGroup.add(b2);
        panel.add(b1);
        panel.add(b2);
        b1.addItemListener(this);
        b2.addItemListener(this);
        split=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,true,panel,scroll);
        c.add(split);
        setVisible(true);
    }
    public void itemStateChanged(ItemEvent e) {
        if(e.getItemSelectable()==b1){
            label.setText("Java");
        }
        if(e.getItemSelectable()==b2){
            label.setText("C");
        }
    }

    public static void main(String[] args) {
        new 窗口();
    }
}

