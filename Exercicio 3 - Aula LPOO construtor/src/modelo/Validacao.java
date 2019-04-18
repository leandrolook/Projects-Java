package modelo;

public class Validacao
{
    private String mensagem;
    private String numero1;
    private String numero2;
    private Double n1;
    private Double n2;

    public Validacao(String numero1, String numero2)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
        Validar();
    }
    
    private void Validar()
    {
        this.mensagem = "";
        
        try
        {
          this.n1 = Double.parseDouble(numero1);
          this.n2 = Double.parseDouble(numero2);
          
        }
        catch(Exception e)
        {
                this.mensagem = "numero invalido";    
        }
                
    }

    public Double getN1()
    {
        return n1;
    }

    public Double getN2()
    {
        return n2;
    }

    public String getMensagem()
    {
        return mensagem;
    }
}
