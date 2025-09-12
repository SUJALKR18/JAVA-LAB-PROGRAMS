import java.util.Scanner;
class Item {
    private int itemcode, quantity;
    private double discount, price;
    private String itemname, category;
    final int maxQuantity = 1000;

    Item() {
        itemcode = 0;
        itemname = "Item_0";
        price = 100;
        discount = 0;
        quantity = 10;
        category = "Food";
    }

    Item(int itemcode, String itemname, double price, double discount, int quantity, String category) {
        this.itemcode = itemcode;
        this.itemname = itemname;
        this.price = price;
        this.discount = discount;
        this.quantity = quantity;
        this.category = category;
    }

    void displayDetail() {
        System.out.println("Item Details : ");
        System.out.println("Itemcode : " + itemcode);
        System.out.println("Itemname : " + itemname);
        System.out.println("Price : $" + price);
        System.out.println("Discount : " + discount + "%");
        System.out.println("Quantity : " + quantity);
        System.out.println("Category : " + category);
        System.out.println("");
    }

    void updateDetail(double price, double discount) {
        this.price = price;
        this.discount = discount;
    }

    void addItems(int n) {
        if ((quantity + n) > maxQuantity) {
            System.out.println("Max Quantity of items exceeded!");
            System.out.println("");
        } else {
            quantity += n;
        }
    }

    void sellItem(int n) {
        if ((quantity - n) < 0) {
            System.out.println("Demand is more than the available items!");
            System.out.println("");
        } else {
            quantity -= n;
        }
    }

    void compareItem(Item other) {
        System.out.println("Comparing Items:");
        System.out.println("");
        System.out.println("Item 1 - " + this.itemname + " | Item 2 - " + other.itemname);
        System.out.println("Price: $" + this.price + " vs $" + other.price);
        System.out.println("Discount: " + this.discount + "% vs " + other.discount + "%");
        System.out.println("Quantity: " + this.quantity + " vs " + other.quantity);
        System.out.println("Category: " + this.category + " vs " + other.category);
        System.out.println("");
    }
}
public class Q2 {
    public static void main(String[] args) {
        Item i1 = new Item();
        Item i2 = new Item(101, "Laptop", 5000, 10, 20, "Electronics");
        Scanner sc = new Scanner(System.in);
        System.out.println("Operations With Command :");
        System.out.println("1. Display Item \n2. Update Details \n3. Add Item \n4. Sell Item \n5. Compare Item \n6. Exit");
        while (true) { 
            System.out.print("Enter the number corresponding to operation to be performed : ");
            int ops = sc.nextInt();
            if(ops == 1){
                System.out.println("Items Are : \n");
                i1.displayDetail();
                i2.displayDetail();
            }
            else if(ops == 2){
                System.out.println("Enter the price and discount");
                int price = sc.nextInt();
                int discount = sc.nextInt();
                i1.updateDetail(price , discount);
                System.out.println("Updated Item : ");
                i1.displayDetail();
            }
            else if(ops == 3){
                System.out.println("Enter the number of items : ");
                int n = sc.nextInt();
                i2.addItems(n);
                i2.displayDetail();
            }
            else if(ops == 4){
                System.out.println("Enter the number of items : ");
                int n = sc.nextInt();
                i2.sellItem(n);
                i2.displayDetail();
            }
            else if(ops == 5){
                i1.compareItem(i2);
            }
            else if(ops == 6){
                break;
            }
        }
    }
}
