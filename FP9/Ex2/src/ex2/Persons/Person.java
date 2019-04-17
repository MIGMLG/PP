/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Persons;

/**
 * Definição do Objeto Pessoa
 * @author NERD-X
 */
abstract class Person {
    private int id;
    private String name;
    private int nif;
    private String address;
    private int phone;

    public Person(int id, String name, int nif, String address, int phone) {
        this.id = id;
        this.name = name;
        this.nif = nif;
        this.address = address;
        this.phone = phone;
    }
    
    abstract float calculateHours();
    
    @Override
    public String toString(){
        String text = "\n" + "------------------------------------" + "\n"
                + "ID: " + this.id + "\n"
                + "Nome: " + this.name + "\n"
                + "NIF: " + this.nif + "\n"
                + "Endereço: " + this.address + "\n"
                + "Telemóvel: " + this.phone + "\n";
        return text;
    }
}
