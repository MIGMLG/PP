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
public enum VegetalType {
    
    TOMATE, CEBOLA, COGUMELOS ;
    
    public static String VegetalTypeToString(VegetalType vegetal) {
        switch (vegetal) {
            case TOMATE:
                return "Tomate";
            case CEBOLA:
                return "Cebola";
            case COGUMELOS:
                return "Cogumelos";
            default:
                return "Invalido";
        }
    }
    
}
