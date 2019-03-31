/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.enums;

/**
 * Enumeraçao com o tipo de bases de pizzas
 * @author NERD-X
 */
public enum PizzaBaseType {
    
    /**
     * Tipo Massa Fina
     */
    MFINA,

    /**
     * Tipo Massa Alta
     */
    MALTA;
    
    /**
     * Metodo para retonar uma string com o tipo de massa usada na base
     * @param base
     * @return
     */
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
