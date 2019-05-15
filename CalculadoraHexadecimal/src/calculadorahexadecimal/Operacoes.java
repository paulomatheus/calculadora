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
public class Operacoes{
    int auxiliar = 0;
    
    //Metodo que farah a adicao
    public int adicao(int a){
        auxiliar += a;
        return auxiliar;   
    }
    
    //Metodo que farah a subtracao
    public int subtracao (int b){
        auxiliar = auxiliar - b;
        return auxiliar;
        
    }
    
    //Metodo que vai armazenar o numero no inicio
    public void resposta(int c){
        auxiliar = c;
    }
    
    
}
