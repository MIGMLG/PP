/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Enums;

/**
 * Enumeração das Áreas Cientificas
 * @author NERD-X
 */
public enum CientificArea {

    /**
     * Área Informática
     */
    INFORMATICA,

    /**
     * Área Informática
     */
    BIOMEDICINA;
    
    /**
     * Metodo para retornar a area de estudo numa String
     * @param area
     * @return
     */
    public static String CientificAreaToString(CientificArea area){
        switch(area){
            case INFORMATICA :
                return "Informática";
            case BIOMEDICINA :
                return "BioMedicina";
            default :
                return "Invalido";
        }
    }
}
