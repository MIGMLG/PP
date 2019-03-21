/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4.store;

/**
 * Object of User
 * @author NERD-X
 */
public class User {

    /**
     *Name of the user
     */
    protected String name;

    /**
     *Age o the user
     */
    protected int age;

    /**
     *Email of the user
     */
    protected String email;

    /**
     *Constructor
     * @param name
     * @param age
     * @param email
     */
    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }
    
}
