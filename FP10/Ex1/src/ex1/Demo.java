/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import ex1.Companies.GasStation;
import ex1.Companies.LargeGasStation;
import ex1.Companies.SuperMarket;

/**
 * Classe para testes
 *
 * @author NERD-X
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ex1
        System.out.println("-------------------------------------------");
        System.out.println("Ex1: ");
        GasStation test = new GasStation("Sem Diesel", 87797466, 2.00);
        System.out.println("Preço: " + test.getGasPrice());
        test.setGasPrice(5.00);
        System.out.println("Preço: " + test.getGasPrice());
        System.out.println("Preço para abastecer o meu tanque: " + test.getGasTotal(70));
        //Ex2
        System.out.println("-------------------------------------------");
        System.out.println("Ex2: ");
        LargeGasStation test2 = new LargeGasStation("Sem Diesel", 87797466, 2.00, 1.00);
        System.out.println("Preço do Combustivel: " + test2.getGasPrice());
        System.out.println("Preço do Café: " + test2.getCoffeePrice());
        test2.setCoffeePrice(2);
        System.out.println("Preço do Café: " + test2.getCoffeePrice());
        System.out.println("Preço para abastecer o meu tanque: " + test2.getGasTotal(70));
        System.out.println("Preço para abastecer o meu Cérebro: " + test2.getCoffeeTotal(5));
        //Ex3
        System.out.println("-------------------------------------------");
        System.out.println("Ex3: ");
        SuperMarket test3 = new SuperMarket("Its me Mario", 5464689, 100);
        System.out.println("Preço da batata: " + test3.getPotatoesPrice());
        test3.setPotatoesPrice(150);
        System.out.println("Preço da batata: " + test3.getPotatoesPrice());
        System.out.println("Preço para comer esta semana: " + test3.getMarketTotal(10));
        
    }

}
