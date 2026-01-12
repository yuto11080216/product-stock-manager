import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in,"SHIFT-JIS");
        Manage mg = new Manage();

        while (true){
            System.out.println("1: 商品登録 2: 入庫 3:出庫 4:商品削除 5:商品リスト 0:終了");
            int select = sc.nextInt();
            sc.nextLine();

            if(select == 0){
                break;
            }else if(select == 1){

                System.out.println("商品名を入力してください");
                String title = sc.nextLine();
                System.out.println("値段を入力してください");
                int price = Integer.parseInt(sc.nextLine());
                System.out.println("入庫数量を入力してください");
                int stock = Integer.parseInt(sc.nextLine());
                mg.add(title,stock,price);
                
            }else if(select == 2){

                System.out.println("入庫する商品のIDを入力してください");
                int ID = Integer.parseInt(sc.nextLine());
                System.out.println("入庫数量を入力してください");
                int quantity = Integer.parseInt(sc.nextLine());
                mg.stockIn(ID,quantity);
                
            }else if(select == 3){

                System.out.println("出庫する商品のIDを入力してください");
                int ID = Integer.parseInt(sc.nextLine());
                System.out.println("出庫数量を入力してください");
                int quantity = Integer.parseInt(sc.nextLine());
                mg.stockOut(ID,quantity);
            }else if(select == 4){

                System.out.println("削除する商品のIDを入力してください");
                int ID = Integer.parseInt(sc.nextLine());
                mg.delete(ID);
            }else if(select == 5){

                mg.show();
            }

        }
    }
}