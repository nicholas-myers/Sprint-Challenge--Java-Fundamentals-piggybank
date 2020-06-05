package piggyBank;

abstract class Money
{
   protected int amount;

   public Money()
   {
      amount = 1;
   }
   public Money(int amount) {
      this.amount = amount;
   }



   int getAmount()
   {
      return amount;
   }


}
