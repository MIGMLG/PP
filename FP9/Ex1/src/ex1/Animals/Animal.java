/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Animals;

import ex1.Enums.Sex;

/**
 *
 * @author NERD-X
 */
public class Animal {
    private int id;
    private String name;
    private Sex sex;
    private int age;

    public Animal(int id, String name, Sex sex, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    
    
}
