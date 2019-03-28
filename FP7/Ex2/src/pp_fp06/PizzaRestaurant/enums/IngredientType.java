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
public enum IngredientType {

    /**
     * Tipo Animal
     */
    ANIMAL,

    /**
     * Tipo Vegetal
     */
    VEGETAL,

    /**
     * Tipo Mineral
     */
    MINERAL;
    
    /**
     * Metodo para returnar o tipo de ingrediente
     * @param type
     * @return
     */
    public static String IngredientTypeToString(IngredientType type){
        switch(type){
            case ANIMAL:
                return "Animal";
            case VEGETAL:
                return "Vegetal";
            case MINERAL:
                return "Mineral";
            default:
                return "Invalido";
        }
    }
    
}
