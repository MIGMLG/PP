/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

/**
 *
 * @author NERD-X
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] biArray = {
                          {11, 7 , 333},
                          {-20, -23, 63},
                          //{-22, 501 , 10000}
        };
        
        //System.out.println(biArray.length);
        
                                    // linhas       colunas
        int[][] transposta = new int[biArray[0].length][biArray.length];
        
        for(int i = 0; i < biArray.length; i++){
            for(int j = 0; j < biArray[i].length; j++){
                transposta[j][i] = biArray[i][j];
            }
        }
        
        for(int i = 0; i < transposta.length; i++){
            for(int j = 0; j < transposta[i].length; j++){
                System.out.print(transposta[i][j]);
            }
            System.out.println(" ");
        }
        
    }
    
}
