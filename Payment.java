public class Payment {

  private float amountPaid;
  private Denomination[] acceptedDenomination;

  public void payment (Denomination[] acceptedDenomination, int amountPaid) {
    this.acceptedDenomination = acceptedDenomination;
    this.amountPaid = amountPaid;

  }


  public Denomination[] getDenomination() {
    return acceptedDenomination;
  }
  public float getAmountPaid() {
    return amountPaid;
  }
}
