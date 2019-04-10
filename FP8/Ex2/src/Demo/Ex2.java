/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import ex1.Bikes.Bike;
import ex1.Bikes.BikeManagment;
import ex1.Bikes.BikeSalesManagement;
import ex1.Bikes.BikeTools;
import ex1.Bikes.MountainBike;
import ex1.Bikes.RoadBike;
import static ex1.enums.BrakeType.P;
import static ex1.enums.Material.CARBONO;
import static ex1.enums.MountainBikeSuspension.DUPLA;
import java.time.LocalDateTime;

/**
 *
 * @author NERD-X
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                MountainBike n1 = new MountainBike( 1, DUPLA , 1, 7, "Preto", 23, P, CARBONO, 200, 2);
        BikeTools tool = new BikeTools(1, "Garrafa");
        BikeTools tool1 = new BikeTools(2, "Kit de Troca de Pneus");
        
        n1.addTool(tool);
        n1.addTool(tool1);
        
        System.out.println(n1.toString());
        System.out.println(n1.getAllTools());
        System.out.println("--------------------------------------------------");
        n1.removeTool(1);
        System.out.println(n1.getAllTools());
        System.out.println("--------------------------------------------------");
        
        RoadBike n2 = new RoadBike("Fita Cola", 4, 2, 10, "Preto", 23, 200, 2);
        System.out.println(n2.toString());
        System.out.println("--------------------------------------------------");
        
        BikeManagment lista = new BikeManagment();
        lista.addBike(n1);
        lista.addBike(n2);
        System.out.println(lista.toString());
        Bike[] bikes = {n1, n2};
        BikeSalesManagement sale1 = new BikeSalesManagement(bikes, 1, LocalDateTime.now());
       
        
        // Ficha 8 Ex2
        System.out.println(sale1.addBike(n2));
        System.out.println("---------------------------------------------------");
        System.out.println(sale1.removeBike(n1));
        System.out.println(sale1.findBike(n2));
        System.out.println(sale1.setBike(1, n1));
        System.out.println(sale1.addBike(n1));
        System.out.println(sale1.setBike(1, n1));
        System.out.println("---------------------------------------------------");
        System.out.println(sale1.printAllBikes());        
    }
    
}
