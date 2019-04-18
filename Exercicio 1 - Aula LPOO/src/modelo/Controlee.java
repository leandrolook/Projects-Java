package modelo;

import javax.swing.JOptionPane;


public class Controlee
{
    //inicio da chave class Controle
    
    //variaveis da classe Controle
    public String numero1;
    public String numero2;
    public String resultado;
    public String mensagem;
    
    public void Executar()
    {
        this.mensagem = "";
        Validacaoo validacao = new Validacaoo();//cria o objeto Validacao
        validacao.numero1 = this.numero1;//atribui o valor para validacao para*/
        validacao.numero2 = this.numero2; /*converter para double*/
        validacao.Validar();
        
        if (validacao.mensagem.equals(""))//se o resultado for "" continua
        {
            Calculoss calculos = new Calculoss();
            calculos.n1 = validacao.n1;
            calculos.n2 = validacao.n2;
            calculos.Somar();
            this.resultado = calculos.res.toString();
        }else 
        {
            this.mensagem = validacao.mensagem;
        }
        
    }
}
