/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persons;

/**
 *
 * @author NERD-X
 */
abstract class Person {
    private String nome;
    private int nif;
    private String morada;
    private int tele;

    public Person(String nome, int nif, String morada, int tele) {
        this.nome = nome;
        this.nif = nif;
        this.morada = morada;
        this.tele = tele;
    }
    
    abstract float cacularHoras();
    
    
}
