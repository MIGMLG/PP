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
public enum OriginType {
    NACIONAL, IMPORTADO;

    public String OriginTypeToString(OriginType origin) {
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
