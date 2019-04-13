/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Animals;

import ex1.Enums.CatType;
import static ex1.Enums.CatType.CatTypeToString;
import ex1.Enums.Sex;

/**
 * Definição do Objeto Gato
 * @author NERD-X
 */
public class Cat extends Animal{
    private CatType type;

    /**
     * Metodo Constructor de Cat
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
    
    @Override
    public String toString(){
        String text = super.toString() + "\n"
                + "Tipo: " + CatTypeToString(type) + "\n";
       return text;         
    }
    
}
