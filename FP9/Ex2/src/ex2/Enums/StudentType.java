/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Enums;

/**
 * Enumeração dos tipos de Estudante
 * @author NERD-X
 */
public enum StudentType {

    /**
     * Estudante Trabalhador
     */
    ESTUDANTETRABALHOR,

    /**
     * Estudante normal
     */
    ESTUDANTENORMAL;

    /**
     * Metodo que retorna o tipo de estudante numa String
     * @param type
     * @return
     */
    public static String StudentTypeToString(StudentType type) {
        switch (type) {
            case ESTUDANTETRABALHOR:
                return "Trabalhor-Estudante";
            case ESTUDANTENORMAL:
                return "Normal";
            default:
                return "Invalido";
        }
    }
}
