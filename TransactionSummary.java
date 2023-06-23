public class TransactionSummary {

    private Item[] items;
    private int quantitySold;
    private float totalAmountCollected;

    public void transaction(Item[] items, int quantitySold, float totalAmountCollected) {
        this.items = items;
        this.quantitySold = quantitySold;
        this.totalAmountCollected = totalAmountCollected;
    }

    public Item[] getItem(){
        return items;
    }

    public int getQuantitySold(){
        return quantitySold;
    }

    public float getTotalAmountCollected(){
        return totalAmountCollected;
    }
    
}
