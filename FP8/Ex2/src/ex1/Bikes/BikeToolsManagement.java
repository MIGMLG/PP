/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Bikes;

/**
 *
 * @author NERD-X
 */
public class BikeToolsManagement extends ContainerOfObjects {

    private int objectSize;

    /**
     * Metodo construtor que recebe o tamanho maximo do array de objectos
     *
     * @param objectSize
     */
    public BikeToolsManagement(int objectSize) {
        super(objectSize);
        this.objectSize = objectSize;
    }

    /**
     * Metodo para adicionar ferramentas
     *
     * @param tool
     * @return
     */
    public boolean addTool(BikeTools tool) {
        return super.addObjects(tool);
    }

    /**
     * Metodo para remover ferramentas
     *
     * @param position
     * @return
     */
    public BikeTools removeTool(int position) {
        return (BikeTools) super.removeObjects(position);
    }

    /**
     * Metodo para verificar se a ferramenta ja existe no array
     * @param tool
     * @return
     */
    public boolean hasTool(BikeTools tool) {
        return super.hasObject(objectSize);
    }

    /**
     * Metodo para imprimir toda a informação relacionada com as ferramentas
     *
     * @return
     */
    public String getAllTools() {
        return super.printAll();
    }

}
