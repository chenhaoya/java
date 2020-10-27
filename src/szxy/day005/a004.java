package szxy.day005;
/**
* 圆的面积
* */
class Triangle{
    double a,b,c;
    Triangle(){
        a=0;b=0;c=0;
    }
    Triangle(double a,double b,double c){
        this.a=a;this.b=b;this.c=c;
    }
    public double area() {
        double s=(a+b+c)/2;
        return (Math.sqrt(s*(s-a)*(s-b)*(s-c)));
    }
}

public class a004 {
    public static void main(String[] args) {
        Triangle aa = new Triangle(8, 7, 6);
        System.out.println(aa.area());
        Triangle bb = new Triangle();
        System.out.println(bb.area());
    }
}
