/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.ReservationsManagement;

import ex1.Enums.Services;
import static ex1.Enums.Services.ServicesToString;
import ex1.Enums.State;

/**
 * Definição do Objeto Service
 * @author NERD-X
 */
public class Service {

    private Services service;
    private State taskState = State.NOTFINISHED;

    /**
     * Metodo Constructor do Serviço
     * @param service
     */
    public Service(Services service) {
        this.service = service;
    }

    /**
     * Metodo para obter o tipo de serviço
     * @return
     */
    public Services getService() {
        return service;
    }

    /**
     * Metodo para obter o estado do serviço
     * @return
     */
    public State getTaskState() {
        return taskState;
    }

    /**
     * Metodo para definir o estado do serviço
     * @param taskState
     */
    public void setTaskState(State taskState) {
        this.taskState = taskState;
    }
    
    @Override
    public String toString(){
        String text = ServicesToString(service) + ", ";
        return text;
    }

}
