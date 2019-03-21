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
        char[] money = args[0].toCharArray();
        
        if(money.length<3){
            System.out.print("0 euros e ");
            for(int i = 0; i < money.length; i++){
                System.out.print(money[i]);
            }
            System.out.print(" centimos");
        }
        else{
            
            for(int i = 0; i < money.length - 2; i++){
                System.out.print(money[i]);
            }
            System.out.print(" euros e ");
            
            for(int i = (money.length - 2); i < money.length; i++){
                System.out.print(money[i]);
            }
            System.out.print(" centimos");
        }
        System.out.print("\n");
    }
    
}
