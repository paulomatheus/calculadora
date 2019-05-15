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
    //HomeScreen tela = new
    
    public int adicao(int a){
       
        //System.out.println(operacao);
        System.out.println("A da classe= "+ a);
        auxiliar += a;
        System.out.println("Auxiliar da classe [+] =" +auxiliar);
        return auxiliar;   
    }
    
    public int subtracao (int b){
        System.out.println("B da classe= "+ b);
        auxiliar = auxiliar - b;
        System.out.println("Auxiliar da classe [-] =" +auxiliar);
        return auxiliar;
        
    }
    
    
    
    public void resposta(int c){
        auxiliar = c;
    }
    
    
}
