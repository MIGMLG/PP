/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Enums;

/**
 * Enumeração do tipo de serviço
 * @author NERD-X
 */
public enum Services {

    /**
     * Serviço do tipo Passeio
     */
    PASSEIO,

    /**
     * Serviço do tipo Alojamento
     */
    ALOJAMENTO,

    /**
     * Serviço do tipo Transporte
     */
    TRANSPORTE,

    /**
     * Serviço do tipo Banho
     */
    BANHO,

    /**
     * Serviço do tipo Tosquia
     */
    TOSQUIA,

    /**
     * Serviço do Tipo Sessao Fotografica
     */
    SESSAOFOTO;
    
    /**
     * Metodo para retornar uma string com o tipo de serviço
     * @param type
     * @return
     */
    public static String ServicesToString(Services type){
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
