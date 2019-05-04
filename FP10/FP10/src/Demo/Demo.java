/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Demo;

import fp10.Companies.GasStation;
import fp10.Companies.HyperMarket;
import fp10.Companies.JumbHipermarket;
import fp10.Companies.LargeGasStation;
import fp10.Companies.SuperMarket;

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
        
        //Ex4
        System.out.println("-------------------------------------------");
        System.out.println("Ex4: ");
        HyperMarket test4 = new HyperMarket("DONT KNOW", 46464, 5, 0.5, 10, 100);
        System.out.println("Preço do Combustivel: " + test4.getGasPrice());
        test4.setGasPrice(6.00);
        System.out.println("Preço do Combustivel: " + test4.getGasPrice());
        System.out.println("Preço para abastecer o meu tanque: " + test4.getGasTotal(70));
        System.out.println("Preço do Café: " + test4.getCoffeePrice());
        test4.setCoffeePrice(2);
        System.out.println("Preço do Café: " + test4.getCoffeePrice());
         System.out.println("Preço para abastecer o meu Cérebro: " + test4.getCoffeeTotal(5));
        System.out.println("Preço da batata: " + test4.getPotatoesPrice());
        test4.setPotatoesPrice(150);
        System.out.println("Preço da batata: " + test4.getPotatoesPrice());
        System.out.println("Preço para comer este mes: " + test4.getMarketTotal(10));
        double bills = test4.getGasTotal(70) + test4.getCoffeeTotal(5) + test4.getMarketTotal(10);
        System.out.println("Despesas: " + bills);
        System.out.println("Taxa Anual: " + test4.getAnnualRate());
        test4.setAnnualRate(23);
        System.out.println("Taxa Anual: " + test4.getAnnualRate());
        System.out.println("Pagamento Mensal: " + test4.computeMonthlyPayment(bills, 12));
        
        //Ex5
        System.out.println("-------------------------------------------");
        System.out.println("Ex5: ");
        JumbHipermarket jumbo = new JumbHipermarket("Jumbo", 2132423, 1.3 , 0.5, 5 , 23);
        System.out.println("Pontos: " + jumbo.getPoints(19));
        
    }

}
