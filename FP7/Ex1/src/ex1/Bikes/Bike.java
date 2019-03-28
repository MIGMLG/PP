/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Bikes;

import ex1.enums.*;

/**
 * Definição do Objeto Bike
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

    /**
     * Metodo Construtor da Bike
     * @param id
     * @param numberOfGears
     * @param mainColor
     * @param wheelSize
     * @param brakes
     * @param material
     * @param price
     * @param guarantee
     */
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

    /**
     * Retorna o Id da Bike
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Retorna o numero de mudanças da Bike
     * @return
     */
    public int getNumberOfGears() {
        return numberOfGears;
    }

    /**
     * Retorna a cor da Bike
     * @return
     */
    public String getMainColor() {
        return mainColor;
    }

    /**
     * Retorna o tamanho da roda da Bike
     * @return
     */
    public float getWheelSize() {
        return wheelSize;
    }

    /**
     * Retorna o tipo de travão da Bike
     * @return
     */
    public BrakeType getBrakes() {
        return brakes;
    }

    /**
     * Retorna o tipo de material usado para a construção do quadro da Bike
     * @return
     */
    public Material getMaterial() {
        return material;
    }

    /**
     * Retorna o preço da Bike
     * @return
     */
    public float getPrice() {
        return price;
    }

    /**
     * Retorna o numero de anos da Bike
     * @return
     */
    public int getGuarantee() {
        return guarantee;
    }
    
    @Override
    public String toString() {
        String text = "ID : " + id + "\n"
                + "Number of gears : " + numberOfGears + "\n"
                + "Cor : " + mainColor + "\n"
                + "Garantia : " + guarantee + "\n";
        return text;
    }

}
