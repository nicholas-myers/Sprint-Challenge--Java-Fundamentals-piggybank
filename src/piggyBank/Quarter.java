package piggyBank;

public class Quarter extends Money
{
   private double value = 0.25;
   public Quarter(int amount) {
      super(amount);
      this.name = "Quarter";
      this.value = value * amount;
   }
   public Quarter() {
      this.name = "Quarter";
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
