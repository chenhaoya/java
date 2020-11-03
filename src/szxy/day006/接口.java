package szxy.day006;
/**
 * PCI
 * */
public class 接口 {
    public static void main(String[] args) {
        Mainboard  mb=new Mainboard();
        VideoCard vc=new VideoCard();
        vc.setName("华硕");
        SoundCard sc=new SoundCard();
        sc.setName("abc");
        mb.interfacePCI(vc);
        mb.interfacePCI(sc);
        mb.run();
    }
}
interface PCI{
    void setName(String s);//接口的定义都是抽象方法，没有方法体
    void run();
}
class VideoCard implements PCI{
    String name="微星";
    public void setName(String s){
        name=s;
    }
    public void run(){
        System.out.println(name+" 显卡已经开始工作了！");
    }
}
class SoundCard implements PCI{
    String name="AC";
    public void setName(String s){
        name=s;
    }
    public void run(){
        System.out.println(name+" 主板已经开始工作！");
    }
}
class Mainboard{
    void interfacePCI(PCI p){
        p.run();
    }
    void run(){
        System.out.println("主板已经开始工作！");
    }
}
