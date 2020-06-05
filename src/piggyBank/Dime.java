package piggyBank;

public class Dime extends Money
{
   private double value = 0.10;
   public Dime(int amount) {
      super(amount);
      this.name = "Dime";
      this.value = value * amount;
   }
   public Dime() {
      this.name = "Dime";
      this.value = value * amount;
   }

   public double getValue() {
      return value;
   }

   @Override
   public String toString()
   {
      return amount > 1 ? amount + " " + name + "s" : amount + " " + name;
   }
}
