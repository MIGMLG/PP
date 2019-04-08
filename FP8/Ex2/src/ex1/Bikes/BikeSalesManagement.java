/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Bikes;

import java.time.LocalDateTime;

/**
 *
 * @author NERD-X
 */
public class BikeSalesManagement extends ContainerOfObjects{
    private int saleID;
    private LocalDateTime date;
    private double total;

    public BikeSalesManagement(Bike[] objects,int saleID, LocalDateTime date) {
        super(objects);
        this.saleID = saleID;
        this.date = date;
    }

    public BikeSalesManagement(int saleID, LocalDateTime date, int maxSize) {
        super(maxSize);
        this.saleID = saleID;
        this.date = date;
    }
    
    public boolean addBike(Bike newBike){
        return super.addObjects(newBike);
    }
    
    public Bike removeBike(Bike removedBike){
        int position = super.findObject(removedBike);
        return (Bike) super.removeObjects(position);
    }
    
    public boolean setBike(int position, Bike newBike){
        return super.setObject(position, newBike);
    }
    
    public int findBike(Bike newBike){
        return super.findObject(saleID);
    }
}
