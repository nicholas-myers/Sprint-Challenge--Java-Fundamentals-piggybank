package com.lambdaschool.piggybank;

import java.util.ArrayList;
import java.util.List;

public class PiggybankApplication {

   public static void main(String[] args)
   {
      List<Money> piggyBank = new ArrayList<>();
      piggyBank.add(new Dime(1));
      System.out.println();
   }

}
