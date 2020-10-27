package test;
import java.util.Random;
public class test2 {
    private static Random rand=new Random(47);
    private String id;
    public  test2(String id){
        this.id=id;
    }
    private final int valueOne=19;
    private static final int VALUE_TWO=29;
    public static final int VALUE_THREE=39;
    private final int i4=rand.nextInt(20);
    static final int i5=rand.nextInt(20);
    private Value v1=new Value(11);
    private final Value v2=new Value(22);
    private static final Value v3=new Value(33);
    private static int[] a={1,2,3,4,5,6};
    public String toString(){
        return (
        "private final int valueOne="+valueOne+
         "\nprivate static final int VALUE_TWO="+VALUE_TWO+
        "\npublic static final int VALUE_THREE="+VALUE_THREE+
                "\nprivate final int i4="+i4+
                "\nstatic final int i5="+i5+
                "\nprivate Value v1="+v1+
                "\nprivate final Value v2="+v2+
                "\nprivate static final Value v3="+v3+
                "\nprivate static int[] a="+a
                );
    }
    public static void main(String[] args) {
        test2 fd1=new test2("aa");
        System.out.println(fd1.a);
    }
}
class Value{
    int i;
    public Value(int i){
        this.i=i;
    }
}