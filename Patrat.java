package test;

public class Patrat implements Calcul {
    private double latura;
    public Patrat(double latura)
    {
        this.latura=latura;
    }
    public void setLatura(double latura)
    {
        this.latura=latura;
    }
    public double getLatura()
    {
        return this.latura;
    }
    public double aria()
    {
        return latura*latura;
    }
    public double perimetru()
    {
        return 4*latura;
    }
}
