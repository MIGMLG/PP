/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

/**
 *
 * @author NERD-X
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        for (int i = 0; i < args[0].length(); i++) {
              char c = args[0].charAt(i);
              
            if (c == ' ') {
                for (int j = i + 1; j < args[0].length(); j++) {
                    System.out.print(args[0].charAt(j));
                }
                System.out.print(" ");
                for (int h = 0; h < i; h++) {
                    System.out.print(args[0].charAt(h));
                }
            }
        
        }
        
        System.out.println("");
    }
    
}
