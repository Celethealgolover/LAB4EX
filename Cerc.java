package test;

public class Cerc implements Calcul{
    private double raza;
    public Cerc(double razza)
    {
        raza=razza;
    }
    public void setRaza(double rraza)
    {
        raza=rraza;
    }
    public double getRaza()
    {
        return raza;
    }
    public double aria()
    {
        return raza*raza*Math.PI;
    }
    public double perimetru()
    {
        return 2*Math.PI*raza;
    }
}
