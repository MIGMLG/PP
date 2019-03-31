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
public enum PizzaBaseType {
    
    MFINA, MALTA;
    
    public static String PizzaBaseTypeToString(PizzaBaseType base){
        switch(base){
            case MFINA :
                return "Massa Fina";
            case MALTA :
                return "Massa Alta";
            default :
                return "Invalido";
        }
    }
    
}
