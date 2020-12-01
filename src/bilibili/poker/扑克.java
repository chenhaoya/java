package bilibili.poker;
/**
 * 斗地主发牌模拟
 * */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class 扑克 {
    public static void main(String[] args) {
        //存放54张牌【准备牌】
        ArrayList<String> pk=new ArrayList<>();
        //各种牌
        String[] colors={"♣","♦","♠","♥"};
        String[] numbers={"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //放入大小王
        pk.add("大王");
        pk.add("小王");
        //放入花色拍
        for (String color : colors)
            for (String number : numbers)
                //System.out.print(color+number);
                pk.add(color+number);
        //随机打乱牌序【洗牌】
        Collections.shuffle(pk);
        //【发牌】
        ArrayList<String> player01=new ArrayList<>();
        ArrayList<String> player02=new ArrayList<>();
        ArrayList<String> player03=new ArrayList<>();
        ArrayList<String> dipai=new ArrayList<>();

        //[【拿牌】
        for(int i=0;i<pk.size();i++){
            String p=pk.get(i);
            if(i<51){
                switch (i%3){
                    case 0:player01.add(p);break;
                    case 1:player02.add(p);break;
                    case 2:player03.add(p);break;
                }
            }
            //底牌
            else dipai.add(p);
        }
        //【叫地主】
        Random random = new Random(3);

        System.out.println("玩家一手牌："+player01);
        System.out.println("玩家二手牌："+player02);
        System.out.println("玩家三手牌："+player03);
        System.out.println("底牌："+dipai);
    }
}
