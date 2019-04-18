package modelo;

import javax.swing.JOptionPane;


public class Controlee
{
    //inicio da chave class Controle
    private String resultado;
    private String mensagem;
    
    public String Executar(String numero1 ,String numero2)
    {
        this.mensagem = "";
        Validacaoo validacao = new Validacaoo();//cria o objeto Validacao
         
      if(validacao.Validar(numero1, numero2).equals(""))
      {
          Calculoss calculos = new Calculoss();
          this.resultado = calculos.Somar(validacao.getN1(), validacao.getN2()).toString();
          
         
                  
      }  else
        {
            JOptionPane.showMessageDialog(null,validacao.Validar(numero1,numero2));
        }
      return this.mensagem;
        
        
    }

    public String getResultado()
    {
        return resultado;
    }

}
