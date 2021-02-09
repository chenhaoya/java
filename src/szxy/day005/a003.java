package szxy.day005;
/**
 * 继承
 * */
public class a003 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Animal aa=new Animal();
        Cat cc=new Cat();
        Bird bb=new Bird();
        aa.sound();
        bb.sound();
        cc.sound();
    }
}
class Animal{
    void sound(){
        System.out.println("Animal_sound");
    }
}
class Cat extends Animal{
    void sound() {
        System.out.println("Cat_sound");
    }
}
class Bird extends Animal{
	/*
	void sound() {
		System.out.println("Bird_sound");
	}*/
}
