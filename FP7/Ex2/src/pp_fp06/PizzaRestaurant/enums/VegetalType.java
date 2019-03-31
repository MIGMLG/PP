/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.enums;

/**
 * Enumeraçao com o tipo de vegetais
 * @author NERD-X
 */
public enum VegetalType {
    
    /**
     * Tipo de vegetal - Tomate
     */
    TOMATE,

    /**
     * Tipo de vegetal - Cebola
     */
    CEBOLA,

    /**
     * Tipo de vegetal - Cogumelos
     */
    COGUMELOS ;
    
    /**
     * Metodo que retorna uma string com o tipo de vegetal
     * @param vegetal
     * @return
     */
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
