/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Enums;

/**
 * Enumeração dos Titulos académicos possiveis
 * @author NERD-X
 */
public enum AcademicStatus {

    /**
     *Licenciatura
     */
    LICENCIATURA ,

    /**
     * Mestrado
     */
    MESTRADO,

    /**
     * Doutoramento
     */
    DOUTORAMENTO;
    
    /**
     * Metodo para retornar as habilidades academicas numa string
     * @param status
     * @return
     */
    public static String AcademicStatusToString(AcademicStatus status){
        switch(status){
            case LICENCIATURA :
                return "Licenciatura";
            case MESTRADO :
                return "Mestrado";
            case DOUTORAMENTO :
                return "Doutoramento";
            default :
                return "Invalido";
        }
    }
    
}
