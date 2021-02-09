package java_experiment.exp8;
import javax.swing.*;
import java.awt .*;
import java.awt.event .*;
import java.awt.Graphics;

public class 二 extends JFrame {

        public static void main(String args[]) {
            Mywindow win = new Mywindow();
          /*  Ball qiu1 = new Ball(5, 5);
            Thread thread1 = new Thread(qiu1);
            Ball qiu2 = new Ball(10, 5);
            Thread thread2 = new Thread(qiu2);*/
            Ball qiu3 = new Ball(15, 5);
            Thread thread3 = new Thread(qiu3);
//            thread1.start();
//            thread2.start();
            thread3.start();
        }
    }
    class Mywindow extends Frame {
        Mywindow() {
            setSize(350, 350);
            setVisible(true);
            setBackground(Color.BLACK);
            validate();
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    System.exit(0);
                }
            });
        }
    }

    class Ball extends Mywindow implements Runnable {
        int rgb = 0;
        Color color;
        int x, y;
        int dx = 5, dy = 5;

        Ball(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public void doColor() {
            rgb = (int) (Math.random() * 0xFFFFFF);
            color = new Color(rgb);
        }

        public void paint(Graphics g) {
            g.setColor(color);
            g.fillOval(x, y, 50, 50);
        }

        public void run() {
            while (true) {
                if (x <= 0) {
                    dx = 5;
                    doColor();
                } else if ((x + 50) >= getWidth()) {
                    dx = -5;
                    doColor();
                }
                if (y <= 0) {
                    dy = 5;
                    doColor();
                } else if ((y + 50) >= getHeight()) {
                    dy = -5;
                    doColor();
                }
                x = x + dx;
                y = y + dy;
                repaint();
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    ;
                }
            }
        }

}