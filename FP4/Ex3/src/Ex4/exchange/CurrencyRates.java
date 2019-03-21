/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ex4.exchange;

/**
 *
 * @author NERD-X
 */
public class CurrencyRates {
   protected static double toDolar = 1.30030;
   protected static double toIene = 125;
   protected static double toGBP = 0.87;

    public static double getToDolar(double money) {
        return (money * toDolar);
    }

    public static double getToIene(double money) {
        return (money *toIene);
    }

    public static double getToGBP(double money) {
        return (money *toGBP);
    }
   
   
    
}
