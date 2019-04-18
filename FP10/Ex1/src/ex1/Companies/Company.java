/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Companies;

/**
 *
 * @author NERD-X
 */
public class Company {
    private String name;
    private int nc;  //numero de contribuinte

    public Company(String name, int nc) {
        this.name = name;
        this.nc = nc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNc() {
        return nc;
    }

    public void setNc(int nc) {
        this.nc = nc;
    }
    
    
    
}
