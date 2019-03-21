/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

/**
 *
 * @author NERD-X
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here6
        int[] vetor = {5, 6 , 7};
        
        for(int i = 0; i < vetor.length; i++){
            int primos = 0;
            double perfeitos = 0;
            
            for(int j = 1; j <= vetor[i]; j++){
                if( (vetor[i] % j) == 0){
                    primos += 1;
                    perfeitos += j; 
                }
            }
            
            if(primos == 2){
                System.out.println("Numero Primo : " + vetor[i]);
            }
            
            if(perfeitos == vetor[i]){
                System.out.println("Numero Perfeito : " + vetor[i]);
            }
            
            
        }
            
        
    }
    
}
