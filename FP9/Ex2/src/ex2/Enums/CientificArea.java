/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Enums;

/**
 *
 * @author NERD-X
 */
public enum CientificArea {
    INFORMATICA, BIOMEDICINA;
    
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
