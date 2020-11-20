package java_experiment.exp5;
import java.util.*;
public class experiment001 {

    public static void main(String[] args) {
        Shape s1 = new Square(2);
        Shape s2 = new Triangle(3, 4, 5);
        Shape s3 = new Circle(2);
        System.out.println("s1 的面积：" + s1.calcArea());
        System.out.println("s2 的面积：" + s2.calcArea());
        System.out.println("s3 的面积：" + s3.calcArea());
    }
}
class Shape {
    public double calcArea() {
        return 0;
    }
}
class Square extends Shape {
    float width;
    public Square(int width) {
        this.width = width;
    }
    public double calcArea() {
        return width * width;
    }
}
class Triangle extends Shape {
    float a, b, c;
    public Triangle(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double calcArea() {
        float s = (a + b + c) / 2; return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
class Circle extends Shape {
    float radius;
    public Circle(float radius) {
        this.radius = radius;
    }
    public double calcArea() {
        return Math.PI * radius * radius;
    }
}