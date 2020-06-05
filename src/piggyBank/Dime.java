package piggyBank;

public class Dime extends Money
{
   private double value = 0.10;
   private String name = "Dime"; 
   public Dime(int amount) {
      super(amount);
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
      return name + " Amount: " + amount;
   }
}
