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
public enum StateType {
    NOTFINISHED, OCCURRING, FINISHED;
    
    public String StateTypeToString(StateType type){
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
