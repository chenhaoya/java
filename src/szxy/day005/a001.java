package szxy.day005;

public class a001 {
    public static void main(String[] args) {
        Vehicle vehicle=new Vehicle();
        Bus bus=new Bus();
        Mycar mycar =new Mycar(4);
        vehicle.start();
        bus.start();
        vehicle.seats=35;
        System.out.println(vehicle.seats);
        System.out.println(mycar.seats);
    }
}
class Vehicle{//父类
    String brand;
    int seats=0;
    Vehicle(){
        System.out.println("Vehicle construct");
    }
    void start() {
        System.out.println("Vehicle start");
    }
    void stop() {
        System.out.println("Vehicle stop");
    }
}
class Bus extends Vehicle{//子类
    Bus(){
        System.out.println("Bus construct");
    }
}
class Mycar extends Vehicle{//子类
    int seats;
    Mycar(int seats){
        this.seats=seats;
        System.out.println("Car construct");
    }
}