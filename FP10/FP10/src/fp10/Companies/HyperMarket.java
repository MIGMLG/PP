/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp10.Companies;

import fp10.Services.HyperMarketService;

/**
 * Classe que define um Hyper mercado e implementa os serviços de um Hyper
 * mercado
 *
 * @author NERD-X
 */
public class HyperMarket extends SuperMarket implements HyperMarketService {

    private double gasPrice;
    private double coffeePrice;
    private double annualRate;

    /**
     * Metodo Constructor de um Hyper mercado
     *
     * @param name
     * @param nc
     * @param gasPrice
     * @param coffeePrice
     * @param potatoePrice
     * @param annualRate
     */
    public HyperMarket(String name, int nc, double gasPrice, double coffeePrice, double potatoePrice, double annualRate) {
        super(name, nc, potatoePrice);
        this.gasPrice = gasPrice;
        this.coffeePrice = coffeePrice;
        this.annualRate = annualRate;
    }

    @Override
    public double getGasPrice() {
        return this.gasPrice;
    }

    @Override
    public void setGasPrice(double p) {
        this.gasPrice = p;
    }

    @Override
    public double getGasTotal(double litres) {
        return this.gasPrice * litres;
    }

    @Override
    public double getCoffeePrice() {
        return this.coffeePrice;
    }

    @Override
    public void setCoffeePrice(double p) {
        this.coffeePrice = p;
    }

    @Override
    public double getCoffeeTotal(int coffees) {
        return this.coffeePrice * coffees;
    }

    @Override
    public double getAnnualRate() {
        return this.annualRate;
    }

    @Override
    public void setAnnualRate(double r) {
        this.annualRate = r;
    }

    @Override
    public double computeMonthlyPayment(double ammount, int months) {
        double monthlyTax = Math.pow(1 + this.annualRate, 1.0 / 12.0) - 1;
        double years = months / 12;
        return ((monthlyTax * ammount) / (1 - (Math.pow((1.0 + monthlyTax), -months))));
    }

    /**
     * Metodo para obter os pontos dos clientes
     *
     * @param purchaseValue
     * @return
     */
    public int getPoints(double purchaseValue) {
        return (int) purchaseValue * 2;
    }

    /**
     * Metodo para comparar os pontos ofericidos por mercados diferentes
     *
     * @param markets
     * @param valuePurchase
     * @return
     */
    public int compareHyperMarketPoints(HyperMarket[] markets, int valuePurchase) {
        int points = markets[0].getPoints(valuePurchase);
        int position = 0;
        for (int i = 1; i < markets.length; i++) {
            if (markets[i].getPoints(valuePurchase) > points) {
                points = markets[i].getPoints(valuePurchase);
                position = i;
            }
        }
        return position;
    }

    /**
     * Metodo para obter o HyperMercado que oferece o preço total de um cabaz
     * mais barato
     *
     * @param markets
     * @param kilos
     * @param litres
     * @param coffes
     * @return
     */
    public int compareHyperMarketSale(HyperMarket[] markets, double kilos, double litres, int coffes) {
        double price = markets[0].getMarketTotal(kilos) 
                + markets[0].getGasTotal(litres) 
                + markets[0].getCoffeeTotal(coffes);
        int position = 0;
        
        for (int i = 1; i < markets.length; i++) {
            if (markets[i].getMarketTotal(kilos) 
                + markets[i].getGasTotal(litres) 
                + markets[i].getCoffeeTotal(coffes) < price) {
                
                price = markets[i].getMarketTotal(kilos) 
                + markets[i].getGasTotal(litres) 
                + markets[i].getCoffeeTotal(coffes);
                
                position = i;
            }
        }
        
        
        return position;
    }

}
