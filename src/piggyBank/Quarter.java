package piggyBank;

public class Quarter extends Money
{
   public Quarter(int amount) {
      super(amount);
      this.name = "Quarter";
      this.value = 0.25 * amount;
   }
   public Quarter() {
      this.name = "Quarter";
      this.value = 0.25 * amount;
   }

   @Override
   public String toString()
   {
      return amount > 1 ? amount + " " + name + "s" : amount + " " + name;
   }
}
