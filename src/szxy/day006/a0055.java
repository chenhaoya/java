package szxy.day006;
import java.util.*;
public class a0055 {
    public static void main(String[] args) {
        MaleDriver m=new MaleDriver();
        m.drive();

        FemaleDriver f=new FemaleDriver();
        f.drive();
    }
}
abstract class Driver {
    String name;
    abstract void drive();
}
class FemaleDriver extends Driver {
     void drive(){
         System.out.println(name+"(Female) drives a vehicle");
    }
   FemaleDriver(){
         String s;
         Scanner val=new Scanner(System.in);
         s=val.nextLine();
         this.name=s;
   }
}
class MaleDriver extends Driver {
    void drive(){
        System.out.println(name+"(Male) drives a vehicle");
    }
    MaleDriver(){
        String s;
        Scanner val=new Scanner(System.in);
        s=val.nextLine();
        this.name=s;
    }
}