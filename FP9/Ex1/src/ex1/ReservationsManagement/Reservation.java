/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.ReservationsManagement;

import containerofobjectsapi.ContainerOfObjects;
import ex1.Animals.Animal;
import ex1.Enums.StateType;
import static ex1.Enums.StateType.StateTypeToString;
import java.time.LocalDateTime;

/**
 * Definição do Objeto Reservation
 * @author NERD-X
 */
public class Reservation extends ContainerOfObjects {

    private LocalDateTime date;
    private Animal animal;
    private StateType state = StateType.NOTFINISHED;

    /**
     * Metodo Constructor da Reserva
     * @param date
     * @param animal
     */
    public Reservation(LocalDateTime date, Animal animal) {
        this.date = date;
        this.animal = animal;
    }

    /**
     * Metodo para adicionar um serviço á reserva
     * @param service
     * @return
     */
    public boolean addService(Service service) {
        if (super.hasObject(service)) {
            return false;
        } else {
            return super.addObjects(service);
        }
    }

    /**
     * Metodo para remover um serviço da reserva
     * @param service
     * @return
     */
    public boolean removeService(Service service) {
        int position = super.findObject(service);
        if (position != -1) {
            System.out.println("Removido : " + super.removeObjects(position).toString());
            return true;
        } else {
            return false;
        }

    }

    /**
     * Metodo para obter o estado da reserva
     * @return
     */
    public StateType getState() {
        return state;
    }

    /**
     * Metodo para definir o estado da reserva
     * @param state
     */
    public void setState(StateType state) {
        this.state = state;
    }

    /**
     * Metodo de acesso para a Data
     * @return
     */
    public LocalDateTime getDate() {
        return date;
    }
    
    @Override
    public String toString(){
        String text = "Animal : " + "\n" + animal.toString() + "\n"
                + "Data: " + date.toString() + "\n"
                + "Serviços: " + super.printAll() + "\n"
                + "Estado: " + StateTypeToString(state) +"\n";
        return text;
    }

}
