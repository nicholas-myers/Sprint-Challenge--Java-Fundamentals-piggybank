package piggyBank;

public class Dollar extends Money
{
   private double value = 1.00;
   public Dollar(int amount) {
      super(amount);
      this.name = "$";
      this.value = value * amount;
   }
   public Dollar() {
      this.name = "$";
      this.value = value * amount;
   }

   public double getValue() {
      return value;
   }

   @Override
   public String toString()
   {
      return name + amount;
   }
}