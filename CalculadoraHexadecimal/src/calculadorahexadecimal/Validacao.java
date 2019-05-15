/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorahexadecimal;

/**
 *
 * @author paulomatheusdearaujosilva
 */
public class Validacao  {
 
    //------Instancio para chamar metodos da outra classe
    Operacoes calcula = new Operacoes();
    
    //Parametros com variaveis booleanas e inteiro em hexadecimal
    public int condicao (boolean inicio, boolean operacao, int numero){
        //Caso inicio seja verdadeiro nao havera operacao de soma/subtracao
        if (inicio) {
            calcula.resposta(numero);
            return numero;   
        } else {
            //Condicao para ver se a operacao eh de adicao ou subtracao
            if (operacao) {
                return calcula.adicao(numero);   
            } else {
                return calcula.subtracao(numero);
            }
        }
        
    }
}
