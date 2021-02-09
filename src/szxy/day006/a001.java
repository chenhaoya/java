package szxy.day006;
/**
 *
 * */
class Animal{
    int leg;
    Animal(){
        leg=0;
    }
    void getLeg(){
        System.out.println("Animal's legs");
    }
}
class Fish extends Animal{
    Fish(int leg){
        this.leg=leg;
    }
    void getLeg(){
        System.out.println("Fish has "+leg+"legs");
    }
}
class Dog extends Animal{
    Dog(int leg){
        this.leg=leg;
    }
    void getLeg(){
        System.out.println("Dog has "+leg+"legs");
    }
}
public class a001 {
    public static void main(String[] args) {
        Animal  am=new Animal();
        Fish fs=new Fish(0);
        Dog dg=new Dog(4);
        am=fs;//向上转型
        am.getLeg();
        am=dg;//向上转型
        am.getLeg();
        fs.getLeg();;
        dg.getLeg();
    }
}
