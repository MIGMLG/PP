/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import ex1.Bikes.BikeTools;
import ex1.Bikes.MountainBike;
import ex1.Bikes.RoadBike;
import static ex1.enums.BrakeType.*;
import static ex1.enums.Material.*;
import static ex1.enums.MountainBikeSuspension.*;

/**
 *
 * @author NERD-X
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MountainBike n1 = new MountainBike( 1, DUPLA , 1, 7, "Preto", 23, P, CARBONO, 200, 2);
        BikeTools tool = new BikeTools(1, "Garrafa");
        BikeTools tool1 = new BikeTools(2, "Kit de Troca de Pneus");
        
        n1.setTools(tool);
        n1.setTools(tool1);
        
        System.out.println(n1.toString());
        System.out.println(n1.printTools());
        System.out.println("--------------------------------------------------");
        n1.removeTools(2);
        n1.editTools(1, tool1);
        System.out.println(n1.printTools());
        System.out.println("\n"+"--------------------------------------------------");
        
        RoadBike n2 = new RoadBike("Fita Cola", 4, 2, 10, "Preto", 23, 200, 2);
        System.out.println(n2.toString());
        
        n2.addObservations("Ola");
        n2.addObservations("Adeus");
        
        System.out.println(n2.printObservations());
        
        n2.removeObservations(1);
        n2.editObservations(0, "Adeus");
        
        System.out.println(n2.printObservations());
        
    }
    
}
