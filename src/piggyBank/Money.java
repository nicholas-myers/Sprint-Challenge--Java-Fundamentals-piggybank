package piggyBank;

abstract class Money
{
   protected int amount;
   protected String name;
   protected double value;
   public Money()
   {
      this.name = name;
      this.amount = 1;
      this.value = value * amount;
   }
   public Money(int amount) {
      this.name = name;
      this.amount = amount;
      this.value = value * amount;
   }

   public String getName()
   {
      return name;
   }

   public double getValue()
   {
      return value;
   }

}
