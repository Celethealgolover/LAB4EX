package mall;

public class DebitCard implements BankCard {
    private static double spentAmount;
    private String name;
    private double limitAmount;
    public DebitCard(String name, double limitAmount)
    {
        this.name=name;
        this.limitAmount=limitAmount;
    }
    public void doTransaction(double amount)
    {
        spentAmount+=amount;///se adauga la totalul tuturor cardurilor de debit
        if(amount<=5000)///limita standard de tranzactii
        {
            System.out.println("Utilizatorul " + this.name + " a cheltuit " + amount);
            System.out.println("Suma totala cheltuita cu carduri de debit este " + spentAmount);
        }
        else{
            System.out.println("Not enough money!");
        }
    }
}
