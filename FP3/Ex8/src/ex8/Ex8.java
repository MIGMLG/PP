/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex8;

/**
 *
 * @author NERD-X
 */
public class Ex8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double money = Double.parseDouble(args[0]);
        int doisEuro = 0;
        int umEuro = 0;
        int meioEuro = 0;
        
        while(money != 0){
            
            if(money >= 2){
                money -= 2;
                doisEuro +=1;
            }
            else if(money >= 1){
                money -= 1;
                umEuro +=1;
            }
            else if(money >= 0.5){
                money -= 0.5;
                meioEuro +=1;
            }
            
        }
        
        System.out.println(" Moedas de 2 Euro : " + doisEuro);
        System.out.println(" Moedas de 1 Euro : " + umEuro);
        System.out.println(" Moedas de 50 centimos : " + meioEuro);
    }
    
}
