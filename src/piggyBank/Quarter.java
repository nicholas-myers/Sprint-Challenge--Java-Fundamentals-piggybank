package com.lambdaschool.piggybank;

public class Quarter extends Money
{
   private double value = 0.25;

   public Quarter(int amount) {
      super(amount);
      this.value = value * amount;
   }

   public double getValue() {
      return value;
   }

   public void setValue(double value) {
      this.value = value;
   }
}
