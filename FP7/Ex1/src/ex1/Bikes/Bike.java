/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Bikes;

import ex1.enums.*;

/**
 *
 * @author NERD-X
 */
public class Bike {

    private int id;
    private int numberOfGears;
    private String mainColor;
    private float wheelSize;
    private BrakeType brakes;
    private Material material;
    private float price;
    private int guarantee;

    public Bike(int id, int numberOfGears, String mainColor, float wheelSize, BrakeType brakes, Material material, float price, int guarantee) {
        this.id = id;
        this.numberOfGears = numberOfGears;
        this.mainColor = mainColor;
        this.wheelSize = wheelSize;
        this.brakes = brakes;
        this.material = material;
        this.price = price;
        this.guarantee = guarantee;
    }

    public int getId() {
        return id;
    }

    public int getNumberOfGears() {
        return numberOfGears;
    }

    public String getMainColor() {
        return mainColor;
    }

    public float getWheelSize() {
        return wheelSize;
    }

    public BrakeType getBrakes() {
        return brakes;
    }

    public Material getMaterial() {
        return material;
    }

    public float getPrice() {
        return price;
    }

    public int getGuarantee() {
        return guarantee;
    }

}
