/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.enums;

/**
 * Enumeraçao com o tipo de comidas do mar
 * @author NERD-X
 */
public enum SeaFoodType {
    
    /**
     * Tipo de Comida do Mar - Camarão
     */
    CAMARAO,

    /**
     * Tipo de Comida do Mar - Lagosta
     */
    LAGOSTA ;
    
    /**
     * Metodo que retorna uma string com o tipo de comida do mar usada
     * @param seaFood
     * @return
     */
    public static String SeaFoodTypeToString(SeaFoodType seaFood) {
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
