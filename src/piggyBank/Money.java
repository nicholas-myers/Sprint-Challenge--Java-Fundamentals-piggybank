package com.lambdaschool.piggybank;

abstract class Money
{
   private int amount;

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
