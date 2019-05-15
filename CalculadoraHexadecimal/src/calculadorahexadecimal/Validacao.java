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
    
    int aux = 0;
    Operacoes calcula = new Operacoes();
    
    public int condicao (boolean inicio, boolean operacao, int numero){
        if (inicio) {
            System.out.println("NumHexa da condicao = " + numero +"-------------");
            calcula.resposta(numero);
            return numero;
            
            //letraHexa = Integer.toHexString(numeroHexa);
            
        } else {
            
            
            //Condicao para ver se a operacao eh de adicao ou subtracao
            if (operacao) {
                System.out.println("Numero antes de calcular = "+numero);
                
                
                return calcula.adicao(numero);
                
                
                
            } else {
                return calcula.subtracao(numero);
                
            }
        }
        
    }
}
