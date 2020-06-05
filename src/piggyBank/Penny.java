package piggyBank;

public class Penny extends Money
{
   public Penny(int amount)
   {
      super(amount);
      this.name = "Penny";
      this.value = 0.01 * amount;
   }
   public Penny()
   {
      this.name = "Penny";
      this.value = 0.01 * amount;
   }

   @Override
   public String toString()
   {
      return amount > 1 ? amount + " " + name + "s" : amount + " " + name;
   }
}
