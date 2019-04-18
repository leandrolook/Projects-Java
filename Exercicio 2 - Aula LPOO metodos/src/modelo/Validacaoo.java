
package modelo;


public class Validacaoo
{

    private String mensagem;
    private Double n1;
    private Double n2;
    
    //metodo criado para validar os numeros e evitar erros de digitação
    public String Validar(String numero1, String numero2)
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
           this.mensagem = "numero inavalido"; //mensagem de erro exibida 
       }//fechamento do catch
        return mensagem;
    }
    

    public Double getN1()
    {
        return n1;
    }

    public Double getN2()
    {
        return n2;
    }

    
}
