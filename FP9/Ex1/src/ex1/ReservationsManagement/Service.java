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
 *
 * @author NERD-X
 */
public class Service {

    private ServicesType service;
    private StateType taskState = StateType.NOTFINISHED;

    public Service(ServicesType service) {
        this.service = service;
    }

    public ServicesType getService() {
        return service;
    }

    public StateType getTaskState() {
        return taskState;
    }

    public void setTaskState(StateType taskState) {
        this.taskState = taskState;
    }
    
    @Override
    public String toString(){
        String text = ServicesTypeToString(service) + ", ";
        return text;
    }

}
