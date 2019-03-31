/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.enums;

/** 
 * Enumeraçao com o tipo de queijos
 * @author NERD-X
 */
public enum CheeseType {

    /**
     * Tipo de Queijo Mozzarela
     */
    MOZZARELA ,

    /**
     * Tipo de Queijo Serra
     */
    SERRA ;
    
    /**
     * Metodo para retornar uma string com o tipo de queijo
     * @param cheese
     * @return
     */
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
