import java.util.ArrayList;
public class Manage{
    ArrayList<Product> list = new ArrayList<>();
    private int nextId=1;

    public void show(){
        for(Product t:list){
            System.out.println(t.toString());
        }
    }

    public void add(String title,int price,int stock){
        list.add(new Product(title,nextId,price,stock));
        nextId ++;
    }

    public void stockIn(int ID,int quantity){
        for(Product p : list){
            if(p.getID() == ID){
                p.stockIn(quantity);
            }
        System.out.println(p.getTitle()+"に"+quantity+"個入荷しました");
        break;
        }  
    }
    public void stockOut(int ID, int quantity){
        for(Product p : list){
            if(p.getID() == ID){
                p.stockOut(quantity);
            }
        }
    }
    public void delete(int ID){
        System.out.println(list.get(ID)+"を削除しました");
        list.remove(ID);
    }

}
