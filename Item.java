public class Item {

  private String name;
  private int calories;
  private float price;

  public Item(String name, int calories, float price) {
    this.name = name;
    this.calories = calories;
    this.price = price;
  }

  public String getName() {
    return name;
  }

  public int getCalories(){
    return calories;
  }

  public float getPrice() {
    return price;
  }

  public void setCalories(int calories) {}
  
  public void setName(String name) {}

  public void setPrice(float price) {}
}
