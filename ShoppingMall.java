package mall;

public class ShoppingMall {
    private BankCard c;
    public ShoppingMall(String tip_card, String name, double limit_amount)
    {
        if(tip_card.equals("debit"))
            c=new DebitCard(name,limit_amount);
        else c=new CreditCard(name);
    }
    public  BankCard get_card()///returneaza referinta cardului
    {
        return this.c;
    }
    public void achizitie(double amount)
    {
        c.doTransaction(amount);///polimorfism de executie
    }

}
