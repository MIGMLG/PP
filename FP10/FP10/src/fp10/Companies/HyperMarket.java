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
public class HyperMarket extends Company implements HyperMarketService {

    private double gasPrice;
    private double coffeePrice;
    private double potatoePrice;
    private double annualRate;

    /**
     * Metodo Constructor de um Hyper mercado
     * @param name
     * @param nc
     * @param gasPrice
     * @param coffeePrice
     * @param potatoePrice
     */
    public HyperMarket(String name, int nc, double gasPrice, double coffeePrice, double potatoePrice, double annualRate) {
        super(name, nc);
        this.gasPrice = gasPrice;
        this.coffeePrice = coffeePrice;
        this.potatoePrice = potatoePrice;
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
    public double getPotatoesPrice() {
        return potatoePrice;
    }

    @Override
    public void setPotatoesPrice(double p) {
        this.potatoePrice = p;
    }

    @Override
    public double getMarketTotal(double kilos) {
        return this.potatoePrice * kilos;
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
        double years = months/12;
        return ((ammount/months) + (ammount*(this.annualRate/100))*years);
    }

}
