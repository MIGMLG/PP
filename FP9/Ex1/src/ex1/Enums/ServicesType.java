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
public enum ServicesType {
    PASSEIO, ALOJAMENTO, TRANSPORTE, BANHO, TOSQUIA, SESSAOFOTO;
    
    public static String ServicesTypeToString(ServicesType type){
        switch(type){
            case ALOJAMENTO :
                    return "Alojamento";
            case PASSEIO :
                return "Passeio";
            case BANHO :
                return "Banho";
            case SESSAOFOTO :
                return "Sessao Fotografica";
            case TOSQUIA :
                return "Tosquia";
            case TRANSPORTE :
                return "Transporte";
            default :
                return "Invalido";
        }
    }
    
}
