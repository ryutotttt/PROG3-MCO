public class ItemSlot {
    private Item[] items;
    private int quantity;
    private int capacity;

    public Item[] getItem(){
        return items;
    }

    public int getQuanty(){
        return quantity;
    }

    public int getCapacity(){
        return capacity;
    }

    public void ItemSlots(int quantity, int capacity){
        
        this.quantity = 0;
        this.capacity = capacity;

    }

    public void addItem(Item item){

    }

    public void restock(int quantity){
        
    }
}


