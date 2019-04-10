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
 *
 * @author NERD-X
 */
public class MountainBike extends Bike {

    private final int MAX_TOOLS = 10;
    private int counterTools = 0;
    private int numberOfLights;
    private MountainBikeSuspension suspension;
    private BikeToolsManagement tools = new BikeToolsManagement(MAX_TOOLS);

    /**
     * Metodo Construtor para a MountainBike
     *
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
     * Metodo para adicionar ferramentas á bicicleta
     * @param tool
     * @return
     */
    public boolean addTool(BikeTools tool) {
        if (tools.hasObject(tool)) {
            return false;
        } else {
            return tools.addTool(tool);
        }
    }

    /**
     * Metodo para remover ferramentas á bicicleta
     * @param position
     * @return
     */
    public BikeTools removeTool(int position) {
        return (BikeTools) tools.removeTool(position);
    }

    /**
     * Metodo para imprimir todas as ferramentas da bicicleta
     *
     * @return
     */
    public String getAllTools() {
        return tools.getAllTools();
    }

}
