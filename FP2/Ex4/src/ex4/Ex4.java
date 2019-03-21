/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

/**
 *
 * @author NERD-X
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char[] nome = {'A', 'n', 'a', ' ', 'S', 'a', 'n', 't', 'o', 's', '\n'};
        int vogais = 0, consoantes = 0;

        for (int i = 0; i < nome.length; i++) {
            
            if (nome[i] == ' ') {
                for (int j = i + 1; j < nome.length; j++) {
                    System.out.print(nome[j]);
                }
                for (int h = 0; h < i; h++) {
                    System.out.print(nome[h]);
                }
            }
            
            if( nome[i] == 'A' || nome[i] == 'a' || nome[i] == 'E' 
                    || nome[i] == 'e' || nome[i] == 'I' || nome[i] == 'i' 
                    || nome[i] == 'O' || nome[i] == 'o' || nome[i] == 'U'
                    || nome[i] == 'u'){
                
                vogais += 1;
                
            }
            else if (nome[i]!= ' ' && nome[i] != '\n'){
                consoantes += 1;
            }
        }
        
        System.out.println(" ");
        System.out.println("Vogais : " + vogais);
        System.out.println("Consoantes : " + consoantes);
    }

}
