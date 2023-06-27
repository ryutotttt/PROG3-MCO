import java.util.Scanner;

public class ItemSlot {
    private Item[] items;
    private int quantity;
    private int capacity;

    public ItemSlot(int quantity){
        this.capacity = 10;
        this.quantity = quantity;
        this.items = new Item[capacity];
    }

    public Item[] getItems(){
        return items;
    }

    public int getQuantity(){
        return quantity;
    }

    public int getCapacity(){
        return capacity;
    }

    public void addItem(Item items){
        Scanner scAItem = new Scanner(System.in);
        
        String itemName = items.getName(); 
        int calories = items.getCalories();

        //float price;

        System.out.println("Enter the name of an item to be added: ");
        itemName = scAItem.next();
        items.setName(itemName);
        System.out.println("Enter Calories: ");
        calories = scAItem.nextInt();
        items.setCalories(calories);
        /*System.out.println("Enter Price: ");
        price = scAItem.nextFloat();*/
        scAItem.close();
    }
    

    public void restock(int quantity){
        Scanner scRestock = new Scanner(System.in);
        
        int restockQuantity;
        
        if (quantity < 10 || quantity == 0)
        {
            System.out.print("How many do you want? :");
            restockQuantity = scRestock.nextInt();
            scRestock.close();
            
            this.quantity += restockQuantity;

        }
    }

    public void setQuantity(int quantity){
        
    }

}
