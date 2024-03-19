package test;

public class Testare {
    public static void main(String[] args)
    {
        Cerc c = new Cerc(2.5);
        Patrat p = new Patrat(3);
        System.out.println(c.aria());
        System.out.println(c.perimetru());
        System.out.println(p.aria());
        System.out.println(p.perimetru());
    }
}
