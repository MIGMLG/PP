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
public class BikeTools {

    private int id;
    private String name;

    /**
     * Metodo Construtor para as ferramentas da Bike
     * @param id
     * @param name
     */
    public BikeTools(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Retorna o ID da ferramenta da Bike
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Retorna o nome da ferramenta da Bike
     * @return
     */
    public String getName() {
        return name;
    }

    public String toString() {
        String text = "ID : " + id + "\n"
                + "Nome : " + name + "\n";
        return text;
    }

}
