package piggyBank;

public class Dime extends Money
{
   private double value = 0.10;

   public Dime(int amount) {
      super(amount);
      this.value = value * amount;
   }

   public double getValue() {
      return value;
   }

   public void setValue(double value) {
      this.value = value;
   }
}
