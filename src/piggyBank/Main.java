package piggyBank;

import java.util.ArrayList;
import java.util.List;

public class Main {

   public static void main(String[] args)
   {
      List<Money> piggyBank = new ArrayList<>();
      piggyBank.add(new Dime());
      System.out.println(piggyBank);
   }

}
