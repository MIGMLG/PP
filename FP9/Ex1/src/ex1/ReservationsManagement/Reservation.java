/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.ReservationsManagement;

import containerofobjectsapi.ContainerOfObjects;
import ex1.Animals.Animal;
import ex1.Enums.StateType;
import java.time.LocalDateTime;

/**
 *
 * @author NERD-X
 */
public class Reservation extends ContainerOfObjects{
    private LocalDateTime date;
    private Animal animal;

    public Reservation(LocalDateTime date, Animal animal) {
        this.date = date;
        this.animal = animal;
    }
    
    public boolean addService(Service service){
        return super.addObjects(service);
    }
    
}
