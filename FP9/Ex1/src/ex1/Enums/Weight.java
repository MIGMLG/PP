/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Enums;

/**
 *
 * @author NERD-X
 */
public enum Weight {
    SMALL, MEDIUM, LARGE;
    
    /**
     * Metodo para retornar uma string com o tipo de porte
     *
     * @param weight
     * @return
     */
    public static String WeightToString(Weight weight) {
        switch (weight) {
            case SMALL:
                return "Pequeno";
            case MEDIUM:
                return "Médio";
            case LARGE:
                return "Pesado";
            default:
                return "Invalido";
        }
    }
}
