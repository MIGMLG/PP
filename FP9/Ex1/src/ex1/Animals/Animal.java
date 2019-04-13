/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Animals;

import ex1.Enums.Sex;
import static ex1.Enums.Sex.SexToString;

/**
 * Definição do Objeto Animal
 * @author NERD-X
 */
public class Animal {
    private int id;
    private String name;
    private Sex sex;
    private int age;

    /**
     * Metodo constructor de animal
     * @param id
     * @param name
     * @param sex
     * @param age
     */
    public Animal(int id, String name, Sex sex, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    
    @Override
    public String toString(){
        String text = "ID: " + id + "\n"
                + "Nome: " + name + "\n" 
                + "Idade: " + age + "\n"
                + "Sexo: " + SexToString(sex);
        return text;
    }
}
