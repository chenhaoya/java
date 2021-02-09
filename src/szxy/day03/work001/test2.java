package szxy.day03.work001;
class Car{
    String carNum;
    public Car(String num){carNum=num;}
    void searchNum(){
        char endNUm=carNum.charAt(carNum.length()-1);
        int num=Integer.parseInt(String.valueOf(endNUm));
        if(num%2==0)
            System.out.println("该车是双号!");
        else
            System.out.println("该车是单号!");
    }
}
public class test2 {
    public static void main(String[] args) {
        Car myCar=new Car("京A08L34");
        myCar.searchNum();
        myCar.carNum="京A08L34";
        myCar.searchNum();
        Car myCar2=new Car("皖AM123456");
        myCar2.searchNum();
        myCar2=myCar;
        System.out.println(myCar2.carNum);
        System.out.println(myCar.carNum);
    }
}
