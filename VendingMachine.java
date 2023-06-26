import java.util.Scanner;


public class VendingMachine {

  
  
  private ItemSlot[] slots;
  private Item items;
  private Payment[] payment;
  private TransactionSummary[] transaction;
  private ItemSlot[] startingInventory;
  private ItemSlot[] endingInventory;
  
  
  public void vendingMachine(){
    
    slots = new ItemSlot[8];
    items = new Item(null, 0, 0);
    payment = new Payment[8];
    transaction = new TransactionSummary[8];
    startingInventory = new ItemSlot[8];
    endingInventory = new ItemSlot[8];

  }
    

  public ItemSlot[] getSlots(){
    return slots;
  }
  public Item getItemLIst(){
    return items;
  }

  public void selectItem(ItemSlot[] slots){
    Scanner scSitem = new Scanner(System.in);
    int slotNo = scSitem.nextInt();
    System.out.print("Enter slot number to selec an item: ");
    scSitem.close();
    if(slotNo < 1 || slotNo > 9)
    {
      throw new IllegalArgumentException("Invalid Slot Number");
    }else{
      ItemSlot selectedSlot = slots[slotNo - 1];
      Item[] item = selectedSlot.getItems();

      if(item != null){
        System.out.println("Item: " + items.getName());
        System.out.println("Item price: " + items.getPrice());
        System.out.println("Calories: " + items.getCalories());
      }
      else{
        System.out.println("There is no item in this slot.");
      }
    }

  }

  public void dispenseItem(ItemSlot slot){
    int quantity = slot.getQuantity();

    if(quantity > 0){
      slot.setQuantity(quantity - 1); // ?deduct quantity

      System.out.println("Dispensing");


    }
    
    
  }

  public void setPrice(Item[] items, float price){
    Scanner scItemPrice = new Scanner(System.in);

    System.out.println("Enter New Price Item");
    price = scItemPrice.nextFloat();
    scItemPrice.close();
  }

  //public float change(){}

  public TransactionSummary[] printTransactionSummaries(){ 
    return transaction; 
  }

  public static void restockItem(ItemSlot slot, int quantity){}

  public void changeItem(){

  }

  public void skipItem(){}

  public float collectPayment(Payment[] payment){
    Scanner scPay = new Scanner(System.in);
    float amountToPay = items.getPrice();

    System.out.print("Total Amount: " + amountToPay);
    

    float amountPaid = 0.0f;

    if(amountToPay > 0.0f){

      System.out.print("Enter amount: ");
      amountPaid = scPay.nextFloat();
      scPay.close();

      /*while(amountPaid < amountToPay){
        System.out.println("");
      }*/

    }
    else{
      System.out.println("Invalid amount.");
    }

    float change = amountPaid - amountToPay;

    if (change > 0.0f){
      System.out.println("Change: " + change);
    }

    return amountPaid;

  }

  public void replenishMoney(Denomination denomination){}

  public ItemSlot[] getStartingInventory(){
    return startingInventory;
  }

  public ItemSlot[] getEndingInventory(){
    return endingInventory;
  }

  public Payment[] getPayment(){
    return payment;
  }

  
}

