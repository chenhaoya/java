package szxy.day004;
class Point{
    int x;
    int y;
    Point(int a,int b){
        x=a;y=b;
    }
}
class Circle{
    int r;
    Point point;
    Circle(int r,Point p){
        this.r=r;point=p;
    }
    void output(){
        point.x=10;
        point.y=10;
        System.out.println("圆心的坐标是："+"("+point.x+","+point.y+")");
    }
}
public class a002 {
    public static void main(String[] args) {
        Point p1=new Point(30,20);
        Point p=new Point(30,90);
        System.out.println("点的坐标是："+"("+p.x+","+p.y+")");
        Circle c=new Circle(5,p);
        c.output();
        System.out.println("点的坐标是："+"("+p.x+","+p.y+")");
    }
}
