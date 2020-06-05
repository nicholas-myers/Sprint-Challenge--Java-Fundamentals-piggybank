package piggyBank;

public class Nickel extends Money
{
      private double value = 0.05;

      public Nickel(int amount) {
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
