/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expenses;

/**
 * Class to convert currencies
 * @author NERD-X
 */
public class CurrencyRates {

    /**
     * Ratio from dolar to euro
     */
    protected static float fromDolar = (float) 0.769;

    /**
     * Ratio from Iene to euro
     */
    protected static float fromIene = 125;

    /**
     * Ratio from pound to euro
     */
    protected static float fromGBP = (float) 0.87;

    /**
     * Function to return euro from dolar
     * @param money
     * @return
     */
    public static float getFromDolar(float money) {
        return (money * fromDolar);
    }

    /**
     * Function to return euro from Iene
     * @param money
     * @return
     */
    public static float getFromIene(float money) {
        return (money * fromIene);
    }

//    public static double getToGBP(double money) {
//        return (money *toGBP);
//    }
     
}
