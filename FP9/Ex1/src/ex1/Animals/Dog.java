/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Animals;

import ex1.Enums.Sex;
import ex1.Enums.Weight;

/**
 *
 * @author NERD-X
 */
public class Dog extends Animal{
    private Weight weight;

    /**
     *
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
    
    
    
}
