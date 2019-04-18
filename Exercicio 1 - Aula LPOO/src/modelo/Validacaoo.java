
package modelo;


public class Validacaoo
{
    //variaveis da classe validacao
    public String numero1;
    public String numero2;
    public String mensagem;
    public Double n1;
    public Double n2;
    
    //metodo criado para validar os numeros e evitar erros de digitação
    public void Validar()
    {   //inicializar a String 'MENSAGEM'.
        this.mensagem = "";
        
        //usar o try para evitar os erros de digitação
       try
       {//inicio do try
           //converter os numeros para double pois são strings
           this.n1 = Double.parseDouble(numero1);
           this.n2 = Double.parseDouble(numero2);
           
       }//fechamento do try
       catch(Exception e) //evitar erros de digitacao
       {//inicio do catch
           this.mensagem = "Numero invalido"; //mensagem de erro exibida 
       }//fechamento do catch
    }
}
