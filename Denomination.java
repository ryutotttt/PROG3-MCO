  public class Denomination {

  private String type;
  private float[] money;
  private int value;

  public void denomination(String type, int value){
    this.type = "";
    this.value = value;
  }
  
  public String getType()
  {
    return type;
  }

  public int getValue(){
    return value;
  }

  public float[] getMoney(){
    return money;
  }
  public void setType(String type){}
  public void setValue(int value){}
  public void setMoney(float[] money){}
}
