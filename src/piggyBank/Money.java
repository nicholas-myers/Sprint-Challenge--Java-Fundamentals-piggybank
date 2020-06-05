package piggyBank;

abstract class Money
{
   protected int amount;

   public Money()
   {
      this.amount = 1;
   }
   public Money(int amount) {
      this.amount = amount;
   }

   abstract double getValue();

   int getAmount()
   {
      return amount;
   }


}
