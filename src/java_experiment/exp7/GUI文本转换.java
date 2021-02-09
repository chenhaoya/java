package java_experiment.exp7;
/**
 * 已解决的问题：如果将转换失败or成功的标签在监听按钮时创建和添加就会出现无法刷新现象
 * 待补充知识点JLable刷新
 * */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class GUI文本转换 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JLabel jl = new JLabel("输入日期字符串：");
        jFrame.setLayout(null);
        jl.setBounds(0,0,120,20);
        jFrame.add(jl);

        JTextField jt = new JTextField();
        jt.setBounds(0,40,180,20);
        jFrame.add(jt);

        JButton jb = new JButton("转换");
        jb.setBounds(200,40,60,20);
        jFrame.add(jb);

        JLabel jLabel = new JLabel();
        jLabel.setBounds(0,80,300,20);
        jFrame.add(jLabel);
        /**
         * 按钮监听
         * */
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=jt.getText().trim();//从文本域获取输入时间
                SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");//固定格式
                try {
                        date.setLenient(false);//严格检查时间
                        Date date1 = date.parse(text);//转换为date类型
                            //如果输入时间格式错误则抛出异常，提示转换失败
                        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日");
                        String ss = simpleDateFormat.format(date1);
                        //输入格式正确
                        //JLabel jlout = new JLabel("成功："+ss);
                        jLabel.setText("成功："+ss);
                        //jLabel.setBounds(0,80,180,20);
                        jLabel.setForeground(Color.BLUE);//设置字体颜色
                        //jFrame.add(jLabel);

                    } catch(ParseException parseException){
                    //JLabel jLabel = new JLabel("失败：" + text + "不是合法的日期字符串");
                    jLabel.setText("失败：" + text + "不是合法的日期字符串");
                    jLabel.setForeground(Color.RED);
                    //jLabel.setBounds(0,80,220,20);
                    //jFrame.add(jLabel);
                    }
            }
        });
        jFrame.setResizable(false);//设置窗口不可变
        jFrame.setBounds(400,300,350,150);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}

