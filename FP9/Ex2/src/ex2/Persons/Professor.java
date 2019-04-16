/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Persons;

/**
 *
 * @author NERD-X
 */
public class Professor extends Person{

    public Professor(int id, String name, int nif, String address, int phone) {
        super(id, name, nif, address, phone);
    }
    
    @Override
    float cacularHoras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
