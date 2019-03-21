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
public class Expenses {
    private static final int NUMBER_OF_DAYS = 31;
    
//    protected static int carNumber;
//    protected static double[] carValue = new double[NUMBER_OF_DAYS];
//    protected static char[] carDescription = new char[]{'C','A','R'};
//    
//    protected static int foodNumber;
//    protected static double[] foodValue = new double[NUMBER_OF_DAYS];
//    protected static char[] foodDescription = new char[]{'F','o','o', 'd'};
    
    private static int carNumber;
    private static double[] carValue = new double[NUMBER_OF_DAYS];
    private static char[] carDescription = new char[]{'C','A','R'};
    
    private static int foodNumber;
    private static double[] foodValue = new double[NUMBER_OF_DAYS];
    private static char[] foodDescription = new char[]{'F','o','o', 'd'};

    public static int getCarNumber() {
        return carNumber;
    }

    public static void setCarNumber(int carNumber) {
        Expenses.carNumber = carNumber;
    }

    public static double getCarValue(int position) {
        return carValue[position];
    }

    public static void setCarValue(double carValue, int position) {
        Expenses.carValue[position] = carValue;
    }

    public static char[] getCarDescription() {
        return carDescription;
    }

    public static void setCarDescription(char[] carDescription) {
        Expenses.carDescription = carDescription;
    }

    public static int getFoodNumber() {
        return foodNumber;
    }

    public static void setFoodNumber(int foodNumber) {
        Expenses.foodNumber = foodNumber;
    }

    public static double getFoodValue(int position) {
        return foodValue[position];
    }

    public static void setFoodValue(double foodValue, int position) {
        Expenses.foodValue[position] = foodValue;
    }

    public static char[] getFoodDescription() {
        return foodDescription;
    }

    public static void setFoodDescription(char[] foodDescription) {
        Expenses.foodDescription = foodDescription;
    }
    
    
}
