/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Companies;

/**
 * Classe para definir a interface do Serviço de café
 * @author NERD-X
 */
public interface CoffeeService {

    /**
     * Metodo para obter o preço do café
     * @return
     */
    public double getCoffeePrice();
    
    /**
     * Metodo para definir o preço do café
     * @param p
     */
    public void setCoffeePrice(double p);
    
    /**
     * Metodo para obter o total do custo de um x(int coffees) numero de cafés
     * @param coffees
     * @return
     */
    public double getCoffeeTotal(int coffees);
}
