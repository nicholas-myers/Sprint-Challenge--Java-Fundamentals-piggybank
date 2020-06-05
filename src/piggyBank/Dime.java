package piggyBank;

public class Dime extends Money
{
   public Dime(int amount) {
      super(amount);
      this.name = "Dime";
      this.value = 0.10 * amount;
   }
   public Dime() {
      this.name = "Dime";
      this.value = 0.10 * amount;
   }

   @Override
   public String toString()
   {
      return amount > 1 ? amount + " " + name + "s" : amount + " " + name;
   }
}
