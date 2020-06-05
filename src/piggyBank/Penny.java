package piggyBank;

public class Penny extends Money
{
   private double value = 0.01;
   private String name = "Penny";
   public Penny(int amount)
   {
      super(amount);
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
      return name + " Amount: " + amount;
   }
}
