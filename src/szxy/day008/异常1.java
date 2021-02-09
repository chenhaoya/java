package szxy.day008;

public class 异常1 {
    public static void main(String[] args) {
        try {
            int j = Integer.parseInt(args[0]);
            int i=100/j;
            System.out.println("i="+i);
        }catch(ArithmeticException e){
            System.out.println("捕获到除数为0的异常");
            System.out.println("toString()信息："+e);
            System.out.println("getMessage()信息："+e.getMessage());
        }catch(NumberFormatException e){
            System.out.println("捕获到输入非整数的异常");
            System.out.println("toString()信息："+e);
            System.out.println("getMassage()信息："+e.getMessage());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("捕获未设置参数异常");
            System.out.println("toString()信息："+e);
            System.out.println("getMessage()信息："+e.getMessage());
        }
        System.out.println("程序正常运行");
    }
}
