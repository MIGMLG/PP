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
public class Professor extends Person{
    private int id;

    public Professor(int id, String nome, int nif, String morada, int tele) {
        super(nome, nif, morada, tele);
        this.id = id;
    }
    
    

    @Override
    float cacularHoras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
