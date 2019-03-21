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
        // TODO code application logic here
        
        int[][] biArray = {
                          {11, 7 , 333},
                          {-20, -23, 63},
                          {-22, 501 , 10000}
        };
        
        int soma = 0;
        
        for (int i = 0; i < biArray.length; i++) {
            for (int j = 0; j < biArray.length; j++) {
                soma += biArray[i][j];
            }
        }
        
        System.out.println("Soma: " + soma);
        System.out.println("Media: " + (soma/9));
        
    }
    
}
