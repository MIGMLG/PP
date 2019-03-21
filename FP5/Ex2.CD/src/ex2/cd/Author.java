/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.cd;

/**
 *
 * @author NERD-X
 */
public class Author {
    protected String name;
    protected int age;
    protected String address;
    protected int nif;
    protected int nib;
    protected String type;

    public Author(String name, int age, String address, int nif, int nib) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.nif = nif;
        this.nib = nib;
        this.type = "Vendedor";
    }

    public Author(String name, int age) {
        this.name = name;
        this.age = age;
        this.type = "Nao Vendedor";
    }
    
    
    
}
