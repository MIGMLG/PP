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
public enum UnitOfMeasure {
    GRAMAS, LITROS, UNIDADES;
    
    public static String UnitOfMeasureToString(UnitOfMeasure unit){
        switch(unit){
            case GRAMAS:
                return "gramas";
            case LITROS:
                return "litros";
            case UNIDADES:
                return "unidades";
            default:
                return "Invalido";
        }
    }
    
}
