/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Animals;

import ex1.Enums.CatType;
import ex1.Enums.Sex;

/**
 *
 * @author NERD-X
 */
public class Cat extends Animal{
    private CatType type;

    /**
     *
     * @param id
     * @param name
     * @param sex
     * @param age
     * @param type
     */
    public Cat(int id, String name, Sex sex, int age , CatType type) {
        super(id, name, sex, age);
        this.type = type;
    }
    
    
    
}
