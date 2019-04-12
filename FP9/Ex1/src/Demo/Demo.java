/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import ex1.Animals.*;
import ex1.Enums.*;
import ex1.ReservationsManagement.Reservation;
import ex1.ReservationsManagement.Service;
import java.time.LocalDateTime;

/**
 *
 * @author NERD-X
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cat n1 = new Cat(1, "Pintas", Sex.M, 8, CatType.INTERIOR);
        Dog n2 = new Dog(2, "Snoppy", Sex.M, 10, Weight.MEDIUM);
        Service s1 = new Service(ServicesType.PASSEIO);
        
        Reservation r1 = new Reservation(LocalDateTime.now(), n2);
        r1.addService(s1);
        
    }
    
}
