/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Demo;

import ex1.Animals.*;
import ex1.Enums.*;
import ex1.ReservationsManagement.Reservation;
import ex1.ReservationsManagement.ReservationManagement;
import ex1.ReservationsManagement.Service;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * Classe para testes
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
        
        Service s1 = new Service(Services.PASSEIO);
        Service s2 = new Service(Services.BANHO);
        Reservation r1 = new Reservation(LocalDateTime.of(2019, Month.MARCH, 2, 14, 0), n2);
        r1.addService(s1);
        r1.addService(s2);
        System.out.println(r1.toString());
        System.out.println("-------------------------------------------------");
        r1.removeService(s2);
        System.out.println("-------------------------------------------------");
        ReservationManagement test = new ReservationManagement();
        test.addReservation(r1);
        //test.removeReservation(r1);
        System.out.println("-------------------------------------------------");
        System.out.println(test.printCompletedByDate(LocalDateTime.of(2019, Month.MARCH, 2, 14, 0)));
        
    }
    
}
