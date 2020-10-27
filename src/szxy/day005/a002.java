package szxy.day005;

public class a002 {
    public static void main(String[] args) {
        Catalog c2=new Catalog();
        Catalog c1=new Catalog("百合花");
        Flower f1=new Flower(c1,"真挚的祝福！",299);
        System.out.println(f1.toString());
    }
}
class Catalog{
    public Catalog() {}
    private int catalogID;
    private String catalogName;
    public Catalog(String catalongName) {this.catalogName=catalongName;		}
    public int getCatalogId() {	return this.catalogID;		}
    public void  setCatalogId(int catalogId) {this.getCatalogId();		}
    public String getCatalogName() {return this.catalogName;}
}

class Flower{
    private int flowerId;
    private Catalog catalog;
    private String flowerName;
    private int price;
    public Flower() {}
    public Flower(Catalog catalog,String flowerName,int price) {
        this.catalog=catalog;
        this.flowerName=flowerName;
        this.price=price;
    }
    public int getFlowerId() {return flowerId;}
    public void setFlowerId(int flowerId) {this.flowerId=flowerId;}
    public void setCatalog(Catalog catalog) {this.catalog=catalog;		}
    public String getFlowerNmae() {return flowerName;}
    public void setFlowerName(String flowerName) {this.flowerName=flowerName;}
    public int getPrice() {return price;}
    public void setPrice(int price) {this.price=price;}
    public String toString() {return "品种："+catalog.getCatalogName()+"\n花语："+flowerName+"\n价格："+price;}
}