/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.enums;

/**
 * Enumeraçao com o tipo de carnes
 * @author NERD-X
 */
public enum MeatType {

    /**
     * Tipo Carne de Porco
     */
    PORCO,

    /**
     * Tipo Carne de Vaca
     */
    VACA,

    /**
     * Tipo Carne de Salame
     */
    SALAME ;
    
    /**
     * Metodo para retornar uma string com o tipo de carne
     * @param meat
     * @return
     */
    public static String MeatTypeToString(MeatType meat) {
        switch (meat) {
            case PORCO:
                return "Porco";
            case VACA:
                return "Vaca";
            case SALAME:
                return "Salame";
            default:
                return "Invalido";
        }
    }
    
}
