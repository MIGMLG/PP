package ex2.Enums;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NERD-X
 */
public enum WorkingArea {
    RECURSOSHUMANOS, SECRETARIA;
    
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
