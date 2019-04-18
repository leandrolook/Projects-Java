package modelo;

public class Calculo
{
    private Double n1;
    private Double n2;
    private Double res;

    public Calculo(Double n1, Double n2)
    {
        this.n1 = n1;
        this.n2 = n2;
        somar();
    }
    
    private void somar()
    {
        this.res = this.n1 + this.n2;
    }

    public Double getRes()
    {
        return res;
    }
}

