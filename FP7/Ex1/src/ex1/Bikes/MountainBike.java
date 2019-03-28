/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Bikes;

import ex1.enums.BrakeType;
import ex1.enums.Material;
import ex1.enums.MountainBikeSuspension;

/**
 *
 * @author NERD-X
 */
public class MountainBike extends Bike {

    private final int MAX_TOOLS = 10;
    private int counterTools = 0;
    private int numberOfLights;
    private MountainBikeSuspension suspension;
    private BikeTools[] tools = new BikeTools[MAX_TOOLS];

    public MountainBike(int numberOfLights, MountainBikeSuspension suspension, int id, int numberOfGears, String mainColor, float wheelSize, BrakeType brakes, Material material, float price, int guarantee) {
        super(id, numberOfGears, mainColor, wheelSize, brakes, material, price, guarantee);
        this.numberOfLights = numberOfLights;
        this.suspension = suspension;
    }

    public void setTools(BikeTools tools) {
        if (counterTools < MAX_TOOLS) {
            this.tools[counterTools] = tools;
            counterTools += 1;
        } else {
            System.out.println("Já antigiu o máximo de ferramentas.");
        }

    }

    public void editTools(int id, BikeTools tool) {
        int found = 0;

        for (int i = 0; i < counterTools; i++) {
            if (id == tools[i].getId()) {
                tools[i] = tool;
                found += 1;
                break;
            }
        }

        if (found > 0) {
            System.out.println("Foi alterado com sucesso.");
        } else {
            System.out.println("Não foi encontrado.");
        }
    }

    public void removeTools(int id) {
        BikeTools[] tmp = new BikeTools[MAX_TOOLS];
        int found = 0;

        for (int i = 0; i < counterTools; i++) {
            if (id == tools[i].getId()) {
                found += 1;
                counterTools -= 1;
                continue;
            }
            tmp[i] = tools[i];
        }

        if (found > 0) {
            tools = tmp;
        } else {
            System.out.println("Não foi encontrado.");
        }
    }

    public String printTools() {
        String text = "";
        for (int i = 0; i < counterTools; i++) {
            text += tools[i].toString();
        }
        return text;

    }

    public String toString() {
        String text = "ID : " + super.getId() + "\n"
                + "Number of gears : " + super.getNumberOfGears() + "\n"
                + "Cor : " + super.getMainColor() + "\n"
                + "Garantia : " + super.getGuarantee() + "\n";
        return text;
    }

}
