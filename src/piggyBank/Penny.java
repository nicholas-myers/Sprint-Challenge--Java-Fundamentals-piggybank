package piggyBank;

public class Penny extends Money
{
   private double value = 0.01;

   public Penny(int amount)
   {
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
