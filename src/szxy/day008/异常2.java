package szxy.day008;

public class 异常2 {
    public static void main(String[] args)throws aaa,Old,Young{
        Student1 s1=new Student1(2019112102,1);
    }
}
class aaa extends Exception{
    private String aaa;
    aaa(String aaa){
        this.aaa=aaa;
    }
    String aaa(){
        return aaa;
    }
}
class Young extends Exception{
    private String aa;
    Young(String aa){
        this.aa=aa;
    }
    String Young(){
        return aa;
    }
}
class Old extends Exception{
    private String bb;
    Old(String bb){
        this.bb=bb;
    }
    String Old(){
        return bb;
    }
}
class Student1{
    private int sno;
    private String name=null;
    private int age;
    Student1(int sno,int age,String... name)throws aaa,Old,Young{
        this.sno=sno;this.age=age;
        try {
            if (this.name==null)
                throw new aaa("没有名字");
            if(age>35)
                throw new Old("年龄太大");
            if(age<5)
                throw new Young("年龄太小");
        }catch(aaa e){
            System.out.println(e.aaa());
        }catch (Old e){
            System.out.println(e.Old());
        }catch (Young e){
            System.out.println(e.Young());
        }
    }
}