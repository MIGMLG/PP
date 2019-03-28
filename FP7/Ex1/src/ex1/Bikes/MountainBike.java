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
 * Definição do Objecto MountainBike
 * @author NERD-X
 */
public class MountainBike extends Bike {

    private final int MAX_TOOLS = 10;
    private int counterTools = 0;
    private int numberOfLights;
    private MountainBikeSuspension suspension;
    private BikeTools[] tools = new BikeTools[MAX_TOOLS];

    /**
     * Metodo Construtor para a MountainBike
     * @param numberOfLights
     * @param suspension
     * @param id
     * @param numberOfGears
     * @param mainColor
     * @param wheelSize
     * @param brakes
     * @param material
     * @param price
     * @param guarantee
     */
    public MountainBike(int numberOfLights, MountainBikeSuspension suspension, int id, int numberOfGears, String mainColor, float wheelSize, BrakeType brakes, Material material, float price, int guarantee) {
        super(id, numberOfGears, mainColor, wheelSize, brakes, material, price, guarantee);
        this.numberOfLights = numberOfLights;
        this.suspension = suspension;
    }

    /**
     * Permite adicionar ferramentas
     * @param tools
     */
    public void setTools(BikeTools tools) {
        if (counterTools < MAX_TOOLS) {
            this.tools[counterTools] = tools;
            counterTools += 1;
        } else {
            System.out.println("Já antigiu o máximo de ferramentas.");
        }

    }

    /**
     * Permite Editar a informação da ferramenta pelo seu ID
     * @param id
     * @param tool
     */
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

    /**
     * Permite remover ferramentas através do ID 
     * @param id
     */
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

    /**
     * Retorna uma String com uma lista das ferramentas 
     * @return
     */
    public String printTools() {
        String text = "";
        for (int i = 0; i < counterTools; i++) {
            text += tools[i].toString();
        }
        return text;

    }

}
