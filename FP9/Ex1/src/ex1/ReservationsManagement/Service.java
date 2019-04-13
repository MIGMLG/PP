/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.ReservationsManagement;

import ex1.Enums.ServicesType;
import static ex1.Enums.ServicesType.ServicesTypeToString;
import ex1.Enums.StateType;

/**
 * Definição do Objeto Service
 * @author NERD-X
 */
public class Service {

    private ServicesType service;
    private StateType taskState = StateType.NOTFINISHED;

    /**
     * Metodo Constructor do Serviço
     * @param service
     */
    public Service(ServicesType service) {
        this.service = service;
    }

    /**
     * Metodo para obter o tipo de serviço
     * @return
     */
    public ServicesType getService() {
        return service;
    }

    /**
     * Metodo para obter o estado do serviço
     * @return
     */
    public StateType getTaskState() {
        return taskState;
    }

    /**
     * Metodo para definir o estado do serviço
     * @param taskState
     */
    public void setTaskState(StateType taskState) {
        this.taskState = taskState;
    }
    
    @Override
    public String toString(){
        String text = ServicesTypeToString(service) + ", ";
        return text;
    }

}
