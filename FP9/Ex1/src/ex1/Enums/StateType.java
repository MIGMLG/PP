/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Enums;

/**
 * Enumeração com o tipo de estado da tarefa
 * @author NERD-X
 */
public enum StateType {

    /**
     * Não Terminado
     */
    NOTFINISHED,

    /**
     * A ocorrer
     */
    OCCURRING,

    /**
     * Terminado
     */
    FINISHED;
    
    /**
     * Metodo para retornar uma string com o estado da tarefa
     * @param type
     * @return
     */
    public static String StateTypeToString(StateType type){
        switch(type){
            case NOTFINISHED :
                return "Ainda não foi executada.";
            case OCCURRING :
                return "A decorrer.";
            case FINISHED :
                return "Terminda.";
            default : 
                return "Invalido.";
        }
    }
    
}
