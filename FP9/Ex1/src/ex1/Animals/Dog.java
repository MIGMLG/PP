/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Animals;

import ex1.Enums.Sex;
import ex1.Enums.Weight;
import static ex1.Enums.Weight.WeightToString;

/**
 * Definição do Objeto Cão
 * @author NERD-X
 */
public class Dog extends Animal{
    private Weight weight;

    /**
     * Metodo Constructor de Dog
     * @param id
     * @param name
     * @param sex
     * @param age
     * @param weight
     */
    public Dog(int id, String name, Sex sex, int age, Weight weight) {
        super(id, name, sex, age);
        this.weight = weight;
    }
    
    @Override
    public String toString(){
        String text = super.toString() + "\n"
                + "Porte: " + WeightToString(weight) + "\n";
       return text;         
    }
    
}
