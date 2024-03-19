package mall;

import java.sql.SQLOutput;

public class CreditCard implements BankCard {
    private static double spentAmount;
    private String name;
    public  CreditCard(String name)
    {
        this.name=name;
    }
    public void doTransaction(double amount)
    {
        spentAmount+=amount;
        System.out.println("Utilizatorul " + this.name + " a cheltuit " + amount);
        System.out.println("Suma totala cheltuita cu carduri de credit este " + spentAmount);
    }
}
