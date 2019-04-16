package ex2.Enums;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Enumeração da Áreas de Trabalho
 * @author NERD-X
 */
public enum WorkingArea {

    /**
     * Recursos Humanos
     */
    RECURSOSHUMANOS,

    /**
     * Secretaria
     */
    SECRETARIA;
    
    /**
     * Metodo para retornar a area numa String
     * @param area
     * @return
     */
    public static String WorkingAreaToString(WorkingArea area){
        switch(area){
            case RECURSOSHUMANOS :
                return "Recursos Humanos";
            case SECRETARIA :
                return "Secretaria";
            default :
                return "Invalido";
        }
    }
    
}
