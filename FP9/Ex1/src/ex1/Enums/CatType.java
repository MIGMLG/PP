/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Enums;

/**
 * Enumação do Tipo de Gato
 * @author NERD-X
 */
public enum CatType {

    /**
     * Gato do tipo interior
     */
    INTERIOR,

    /**
     * Gato do tipo exterior
     */
    EXTERIOR;

    /**
     * Metodo para retornar uma string com o tipo de gato
     *
     * @param type
     * @return
     */
    public static String CatTypeToString(CatType type) {
        switch (type) {
            case INTERIOR:
                return "Interior";
            case EXTERIOR:
                return "Exterior";
            default:
                return "Invalido";
        }
    }
}
