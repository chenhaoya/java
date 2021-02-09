package szxy.day03.work001;

class ZFX{
    int bc;
    String ys;
    float zc(){
        return bc*4;
    }
    float mj(){
        return bc*bc;
    }
    ZFX(int a,String b){
        bc=a;
        ys=b;
    }
}
public class 正方形 {
    public static void main(String[] args) {
        ZFX z=new ZFX(3,"y");
        System.out.println(z.zc());
        System.out.println(z.mj());
    }
}
