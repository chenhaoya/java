package java_experiment.exp5;
import java.util.*;
public class experiment003 {
    public static void main(String[] args) {
        Complex c1 = new Complex(1, -2);
        Complex c2 = new Complex(2, 6);
        Complex c3 = c1.add(c2);
        Complex c4 = c2.add(c1);
        System.out.print("c1="); c1.printInfo();
        System.out.print("c2="); c2.printInfo();
        System.out.print("c3="); c3.printInfo();
        System.out.print("c4="); c4.printInfo();
        System.out.println(c1.equals(c2) ? "c1=c2" : "c1!=c2");
        System.out.println(c3.equals(c4) ? "c3=c4" : "c3!=c4");
    }
}
class Complex {
    float real;
    float image;
    public float getReal() {
        return real;
    }
    public void setReal(float real) {
        this.real = real;
    }
    public float getImage() {
        return image;
    }
    public void setImage(float image) {
        this.image = image;
    }
    public Complex(float real, float image) {
        this.real = real;
        this.image = image;
    }void printInfo() {
        System.out.println(real + (image > 0 ? "+" : "-") + Math.abs(image) + "i");
    }
        Complex add (Complex anotherComplex) {
            Complex c = new Complex(0, 0);
            c.setReal(this.real + anotherComplex.getReal());
            c.setImage(this.image + anotherComplex.getImage()); return c;
        }
        public boolean equals(Object obj) {
            Complex c = (Complex) obj;
            return this.real == c.getReal() && this.image == c.getImage();
        }
    }