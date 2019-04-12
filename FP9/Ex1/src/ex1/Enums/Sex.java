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
public enum Sex {
    M, F;

    /**
     * Metodo para retornar uma string com o tipo de Sexo
     *
     * @param sex
     * @return
     */
    
    public static String SexToString(Sex sex) {
        switch (sex) {
            case M:
                return "Masculino";
            case F:
                return "Feminino";
            default:
                return "Invalido";
        }
    }

}
