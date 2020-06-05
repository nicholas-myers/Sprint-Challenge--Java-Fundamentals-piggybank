package piggyBank;

abstract class Money
{
   protected int amount;
   protected String name;
   public Money()
   {
      this.name = name;
      this.amount = 1;
   }
   public Money(int amount) {
      this.amount = amount;
   }

   abstract double getValue();

   public String getName()
   {
      return name;
   }

}
