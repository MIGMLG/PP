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
        int[] lista = {12, 5 , -21, 10, -345, 22, 50, -125, 80, -1};
        
        int positivos = 1;
        
        for(int i = 0; i < lista.length; i++){
            if(lista[i]>0){
                positivos *= lista[i];
            }
        }
        
        System.out.println(positivos);
        
        
        for(int i = 0; i < lista.length; i++){
            if(lista[i]<0){
                System.out.println("Negativo: " + lista[i]);
            }
        }
        
        int maior = 0;
        
        for(int i = 0; i < lista.length; i++){
            if(lista[i]>maior){
                maior = lista[i];
            }
        }
        
        System.out.println("Maior: " + maior);
    }
    
}
