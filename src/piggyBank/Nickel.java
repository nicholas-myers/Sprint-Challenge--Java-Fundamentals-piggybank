package piggyBank;

public class Nickel extends Money {
   private double value = 0.05;

   public Nickel(int amount) {
      super(amount);
      this.name = "Nickel";
      this.value = value * amount;
   }
   public Nickel() {
      this.name = "Nickel";
      this.value = value * amount;
   }
   

   public double getValue() {
      return value;
   }

   @Override
   public String toString() {
      return amount > 1 ? amount + " " + name + "s" : amount + " " + name;
   }
}
