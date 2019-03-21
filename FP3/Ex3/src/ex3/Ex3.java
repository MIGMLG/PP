/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author NERD-X
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] biArray = {
            {11, 7, 333},
            {-20, -23, 63},
            {-22, 501, 10000},
            {-22, 501, -22}
        };

        int[][] repetidos = new int[biArray.length][biArray[0].length];

        for (int i = 0; i < biArray.length; i++) {
            for (int j = 0; j < biArray[i].length; j++) {

                for (int k = 0; k < biArray.length; k++) {
                    for (int l = 0; l < biArray[k].length; l++) {
                        if (biArray[i][j] == biArray[k][l]) {
                            repetidos[i][j] += 1;
                        }
                    }

                }

            }

        }

        
        int coluna = 0;
        int linha = 0;
        int maior = 0;
        int menor = 0;
        int maisRepetido = 0; 
                
        for (int i = 0; i < biArray.length; i++) {
            maior = biArray[i][0];
            menor = biArray[i][0];
            for (int j = 0; j < biArray[i].length; j++) {
                if(biArray[i][j]> maior){
                    maior = biArray[i][j];
                }
                if(biArray[i][j]< menor){
                    menor = biArray[i][j];
                }
                if(repetidos[i][j]> maisRepetido){
                    maisRepetido = repetidos[i][j];
                    linha = i;
                    coluna = j;
                }
            }
            System.out.println("Linha " + i);
            System.out.println("Maior : " + maior);
            System.out.println("Menor : " + menor);
            System.out.println(" ");
        }
        
        System.out.println("Mais Repetido : " +biArray[linha][coluna]);

    }

}
