/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.enums;

/**
 * Enumeraçao com o tipo de unidades de medida
 * @author NERD-X
 */
public enum UnitOfMeasure {

    /**
     * Tipo de medida - gramas
     */
    GRAMAS,

    /**
     * Tipo de medida - litros
     */
    LITROS,

    /**
     * Tipo de medida - unidades
     */
    UNIDADES;
    
    /**
     * Metodo que retorna uma string com a unidade de medida utilizada
     * @param unit
     * @return
     */
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
