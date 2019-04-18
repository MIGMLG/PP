/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import ex1.Companies.GasStation;

/**
 *
 * @author NERD-X
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GasStation test = new GasStation("Sem Diesel", 87797466);
        System.out.println("Preço: " + test.getGasPrice());
        test.setGasPrice(5.00);
        System.out.println("Preço: " + test.getGasPrice());
        System.out.println("Preço para abastecer o meu tanque: " + test.getGasTotal(70));
    }
    
}
