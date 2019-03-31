/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.enums;

/**
 *
 * @author NERD-X
 */
public enum CheeseType {
    MOZZARELA , SERRA ;
    
    public static String CheeseTypeToString(CheeseType cheese) {
        switch (cheese) {
            case MOZZARELA:
                return "Mozzarela";
            case SERRA:
                return "Serra";
            default:
                return "Invalido";
        }
    }
    
}
