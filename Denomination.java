public class Denomination {

  private String type;
  private float value;

  public void denomination(String type, float value){
    this.type = type;
    this.value = value;
  }
  
  public String getType()
  {
    return type;
  }

  public float getValue(){
    return value;
  }

  public void setType(String type){}
  public void setValue(){}
}
