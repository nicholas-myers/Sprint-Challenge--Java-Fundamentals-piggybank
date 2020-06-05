package piggyBank;

public class Penny extends Money
{
   private double value = 0.01;
   public Penny(int amount)
   {
      super(amount);
      this.name = "Penny";
      this.value = value * amount;
   }
   public Penny()
   {
      this.name = "Penny";
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
