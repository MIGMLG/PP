/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex7;

/**
 *
 * @author NERD-X
 */
public class Ex7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int first = Integer.parseInt(args[0]);
        int second = Integer.parseInt(args[1]);
        
        int divisao = first;
        int resultado = 0;
        int resto = 0;
        
        while(divisao >= second){
            divisao -= second;
            resultado +=1;
            resto = divisao;
        }
        
        System.out.println("Resultado : " + resultado);
        System.out.println("Resto : " + resto);
    }
    
}
