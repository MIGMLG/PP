/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex6;

/**
 *
 * @author NERD-X
 */
public class Ex6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        int[] listaA = {2, -5, -121, 102, -35, -2, 0, -125, 802, -10};
        int[] listaB = {6, 99, -1, 12, 1, -2};
        int[] posicoes = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; //posições iguais ao A

        int repetidos = 0;

        for (int i = 0; i < listaA.length; i++) {

            for (int j = 0; j < listaB.length; j++) {
                if (listaA[i] == listaB[j]) {
                    posicoes[i] = 1;
                    repetidos += 1;
                }
            }

        }

        int[] listaC = new int[listaA.length + listaB.length - 1];
        int posicaoC = 0;

        for (int i = 0; i < listaA.length; i++) {
            if (posicoes[i] != 1) {
                listaC[posicaoC] = listaA[i];
                posicaoC += 1;
            }
        }

        for (int i = 0; i < listaB.length; i++) {

            listaC[posicaoC] = listaB[i];
            posicaoC += 1;

        }

        for (int i = 0; i < 15; i++) {
            System.out.print(" " + listaC[i] + ",");
        }
        
        System.out.println(" ");
    }

}
