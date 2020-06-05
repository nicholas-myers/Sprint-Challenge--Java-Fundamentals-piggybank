package piggyBank;

public class Dollar extends Money
{
   private double value = 1.00;
   private String name = "Dollar";
   public Dollar(int amount) {
      super(amount);
      this.value = value;
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