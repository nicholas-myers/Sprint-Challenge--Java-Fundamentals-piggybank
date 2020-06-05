package com.lambdaschool.piggybank;

public class Dollar extends Money
{
   private double value = 1.00;

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
}