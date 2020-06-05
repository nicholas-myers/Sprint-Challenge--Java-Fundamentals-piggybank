package piggyBank;

public class Nickel extends Money {

   public Nickel(int amount) {
      super(amount);
      this.name = "Nickel";
      this.value = 0.05 * amount;
   }
   public Nickel() {
      this.name = "Nickel";
      this.value = 0.05 * amount;
   }

   @Override
   public String toString() {
      return amount > 1 ? amount + " " + name + "s" : amount + " " + name;
   }
}
