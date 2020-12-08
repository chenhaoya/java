package ThankingInJava;
/**
* 向上转型
* */
class Instrument{
    Instrument(){
        System.out.println("我是构造");
    }
    public void play(){
        System.out.println("play");
    }
    static void tune(Instrument i){
        i.play();
    }
}
public class Wind extends Instrument {
    public static void main(String[] args) {
        Wind flute = new Wind();
        Instrument.tune(flute);
    }
}
