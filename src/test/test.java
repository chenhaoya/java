package test;
class Orc extends Villain{
    private int orcNumber=111;
    public Orc(String name,int orcNumber){
        super(name);
        this.orcNumber=orcNumber;
    }
    public void change(String name,int orcNumber){
        setName(name);
        this.orcNumber=orcNumber;
    }
    public String toString(){
        return ("Orc:"+orcNumber+"\nVillain:"+super.toString());
    }
}
class Villain{
    private String name;
    public Villain(String name){
        this.name=name;
    }
    public String toString(){
        return "Villain_name:"+name;
    }
    protected void setName(String name){
        this.name=name;
    }
}
public class test {
    public static void main(String[] args) {
        Orc nn=new Orc("ch",22);
        System.out.println(nn);
        nn.change("bb",111111);
        System.out.println(nn);
    }

}

