package szxy.day03.work001;
class Circle{
    double centerX,centerY,radius;
    void zc(){
        System.out.println(3.14*2.0*radius);
    }
    void mj(){
        System.out.println(3.14*radius*radius);
    }
    Circle(){}
}
public class _Circle {
    public static void main(String[] args) {
        Circle a=new Circle();
        a.centerX=0;
        a.centerY=0;
        a.radius=5;
        a.zc();
        a.mj();
    }
}
