package piggyBank;

public class Nickel extends Money {
   private double value = 0.05;
   private String name = "Nickel";

   public Nickel(int amount) {
      super(amount);
      this.name = name;
      this.value = value * amount;
   }
   public Nickel() {
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
   public String toString() {
      return amount + " " + name;
   }
}
