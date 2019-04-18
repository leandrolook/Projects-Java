package modelo;

import javax.swing.JOptionPane;

public class Controle
{
    private String numero1;
    private String numero2;
    private String reusltado;
    private String mensagem;

    public Controle(String numero1, String numero2)
    {
        this.numero1 = numero1;
        this.numero2 = numero2;
        executar();
        
    }
    
    public void executar()
    {
        this.mensagem = "";
        Validacao validacao = new Validacao(this.numero1, this.numero2);
       
        
       
        if (validacao.getMensagem().equals(""))
        {
             Calculo calculo = new Calculo(validacao.getN1(), validacao.getN2());
             this.reusltado = calculo.getRes().toString();
        }else 
        {
            this.mensagem = validacao.getMensagem();
        }
        
        
    }

    public String getReusltado()
    {
        return reusltado;
    }

    public String getMensagem()
    {
        return mensagem;
    }
    
    
}
