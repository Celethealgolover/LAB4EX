package mall;
import java.util.Scanner;
public class Application {
   public static void main(String[] args)
   {
       ShoppingMall mallcredit,malldebit;
       mallcredit=new ShoppingMall("credit","Celestin",Integer.MAX_VALUE);
       malldebit=new ShoppingMall("debit","Andrei",5000);
       mallcredit.get_card().doTransaction(1500);
       malldebit.get_card().doTransaction(1000);
       mallcredit.get_card().doTransaction(17000);
       malldebit.get_card().doTransaction(550);
       mallcredit.get_card().doTransaction(775);
       malldebit.get_card().doTransaction(5050);
   }
}
