/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4.cd;

/**
 * Object of Author
 * @author NERD-X
 */
public class Author {

    /**
     *Name of Author
     */
    protected String name;

    /**
     *Age of Author
     */
    protected int age;

    /**
     *Address of Author
     */
    protected String address;

    /**
     *"Numero de Identificação Fiscal"
     */
    protected int nif;

    /**
     *"Numero de Identificação Bancaria"
     */
    protected int nib;

    /**
     *Tipo de author: Vendedor ( inclui nif e nib) ou Nao Vendedor
     */
    protected String type;

    /**
     * Author - "Vendedor"
     * @param name
     * @param age
     * @param address
     * @param nif
     * @param nib
     */
    public Author(String name, int age, String address, int nif, int nib) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.nif = nif;
        this.nib = nib;
        this.type = "Vendedor";
    }

    /**
     * Author - "Nao Vendedor"
     * @param name
     * @param age
     */
    public Author(String name, int age) {
        this.name = name;
        this.age = age;
        this.type = "Nao Vendedor";
    }  
    
}
