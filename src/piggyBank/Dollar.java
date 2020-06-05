package piggyBank;

public class Dollar extends Money
{
   public Dollar(int amount) {
      super(amount);
      this.name = "$";
      this.value = 1.00 * amount;
   }
   public Dollar() {
      this.name = "$";
      this.value = 1.00 * amount;
   }



   @Override
   public String toString()
   {
      return name + amount;
   }
}