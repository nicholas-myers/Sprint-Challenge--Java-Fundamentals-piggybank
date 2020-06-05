package piggyBank;

import java.util.ArrayList;
import java.util.List;

public class Main {

   public static void main(String[] args)
   {
      List<Money> piggyBank = new ArrayList<>();
      piggyBank.add(new Quarter());
      piggyBank.add(new Dime());
      piggyBank.add(new Dollar(5));
      piggyBank.add(new Nickel(3));
      piggyBank.add(new Dime(7));
      piggyBank.add(new Dollar());
      piggyBank.add(new Penny(10));
      // System.out.println(piggyBank);
      System.out.println();
      double bankTotal = 0;
      for (Money m : piggyBank) {
         bankTotal += m.getValue();
         System.out.println(m);
      }
      System.out.printf("The piggy bank holds $%.2f %n", bankTotal);
   }

}
