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
public enum SeaFoodType {
    
    CAMARAO, LAGOSTA ;
    
    public String SeaFoodTypeToString(SeaFoodType seaFood) {
        switch (seaFood) {
            case CAMARAO:
                return "Camarao";
            case LAGOSTA:
                return "Lagosta";
            default:
                return "Invalido";
        }
    }
    
}