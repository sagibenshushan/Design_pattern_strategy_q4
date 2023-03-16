package question_number_3;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    //List of items
    List<Item> items;
    
    public ShoppingCart(){
        this.items=new ArrayList<Item>();
    }
    
    public void addItem(Item item){
        this.items.add(item);
    }
    
    public void removeItem(Item item){
        this.items.remove(item);
    }
    
    public int calculateTotal(){
        int sum = 0;
        for(Item item : items){
            sum += item.getPrice();
        }
        return sum;
    }

    public void printOrderDetails() {
        int orderNumber = 1;
        for(Item item : items) {
            System.out.println("Order number: "+ orderNumber);
            System.out.println("UPC Code of product: " + item.getUpcCode());
            System.out.println("Quantity: ? ");
            System.out.println("Price: " + item.getPrice());
            orderNumber++;
        }
    }

    public void pay(PaymentStrategy paymentMethod){
        int amount = calculateTotal();
        paymentMethod.pay(amount);
    }
}

