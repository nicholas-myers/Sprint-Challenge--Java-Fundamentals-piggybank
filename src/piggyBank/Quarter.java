package piggyBank;

public class Quarter extends Money
{
   private double value = 0.25;
   private String name = "Quarter";
   public Quarter(int amount) {
      super(amount);
      this.name = name;
      this.value = value * amount;
   }
   public Quarter() {
      this.name = name;
      this.value = value * amount;
   }

   public double getValue() {
      return value;
   }

   public void setValue(double value) {
      this.value = value;
   }
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   @Override
   public String toString()
   {
      return amount > 1 ? amount + " " + name + "s" : amount + " " + name;
   }
}
