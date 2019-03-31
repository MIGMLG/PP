/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.enums;

/**
 * Enumeraçao com o tipo de origens dos produtos
 * @author NERD-X
 */
public enum OriginType {

    /**
     * Tipo de origem Nacional
     */
    NACIONAL,

    /**
     * Tipo de origem Importado
     */
    IMPORTADO;

    /**
     * Metodo para retornar uma string com o tipo de origem
     * @param origin
     * @return
     */
    public static String OriginTypeToString(OriginType origin) {
        switch (origin) {
            case NACIONAL:
                return "Produto Nacional";
            case IMPORTADO:
                return "Produto Importado";
            default:
                return "Invalido";
        }
    }
}
