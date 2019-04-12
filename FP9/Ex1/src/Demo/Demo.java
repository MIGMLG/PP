/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import ex1.Animals.*;
import ex1.Enums.*;
import ex1.ReservationsManagement.Reservation;
import ex1.ReservationsManagement.ReservationManagement;
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
        
        System.out.println("-------------------------------------------------");
        System.out.println(n1.toString());
        System.out.println(n2.toString());
        System.out.println("-------------------------------------------------");
        
        Service s1 = new Service(ServicesType.PASSEIO);
        Service s2 = new Service(ServicesType.BANHO);
        Reservation r1 = new Reservation(LocalDateTime.now(), n2);
        r1.addService(s1);
        r1.addService(s2);
        System.out.println(r1.toString());
        r1.removeService(s2);
        
        ReservationManagement test = new ReservationManagement();
        test.addReservation(r1);
        
    }
    
}
