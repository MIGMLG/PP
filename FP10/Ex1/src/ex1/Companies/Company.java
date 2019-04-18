/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Companies;

/**
 * Classe que define uma empresa
 * @author NERD-X
 */
public class Company {
    private String name;
    private int nc;  //numero de contribuinte

    /**
     * Metodo Constructor de uma empresa
     * @param name
     * @param nc
     */
    public Company(String name, int nc) {
        this.name = name;
        this.nc = nc;
    }

    /**
     * Metodo para obter o nome da empresa
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Metodo para definir o nome da empresa
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo para obter o numero de contribuinte da empresa
     * @return
     */
    public int getNc() {
        return nc;
    }

    /**
     * Metodo para definir o numero de contribuinte da empresa
     * @param nc
     */
    public void setNc(int nc) {
        this.nc = nc;
    }
    
    
    
}
