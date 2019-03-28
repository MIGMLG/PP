/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Bikes;

import ex1.enums.BrakeType;
import static ex1.enums.BrakeType.*;
import ex1.enums.Material;
import static ex1.enums.Material.*;

/**
 *
 * @author NERD-X
 */
public class RoadBike extends Bike{
    private String handlebelt;
    private float frameSize;
    private String observations;

    public RoadBike(String handlebelt, float frameSize, String observations, int id, int numberOfGears, String mainColor, float wheelSize, float price, int guarantee) {
        super(id, numberOfGears, mainColor, wheelSize, H, CARBONO, price, guarantee);
        this.handlebelt = handlebelt;
        this.frameSize = frameSize;
        this.observations = observations;
    }
    
}
