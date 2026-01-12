public class Product{

    private String title;
    private int ID ;
    private int stock;
    private int price;
    private boolean sell;
    private int quantity;

    public Product(String title,int ID, int stock,int price){
        this.title = title;
        this.ID = ID;
        this.stock = stock;
        this.price = price;
        this.sell = false;
    }

    public void stockIn(int quantity){
        stock += quantity;
    }
    public void stockOut(int quantity){
        stock -= quantity;
    }

    public int getPrice(){
        return this.price;
    }

    public String getTitle(){
        return this.title;
    }

    public int getID(){
        return this.ID;
    }

    public int getStock(){
        return this.stock;
    }

    public boolean itsell(){
        return this.sell;
    }

    public void toggleSold(){
        this.sell = !sell;
    }

    public String toString(){
        return "ID:"+ID+" 商品名: " +title+" 価格 "+price+"円"+ " 在庫: "+stock;
    }
}