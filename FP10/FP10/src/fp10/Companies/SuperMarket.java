/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp10.Companies;

import fp10.Services.MarketService;

/**
 * Classe que define um supermercado que vende batatas, este é uma extensão de
 * company e implementa o serviço de supermercado
 *
 * @author NERD-X
 */
public class SuperMarket extends Company implements MarketService {

    private double potatoePrice;

    /**
     * Metodo Constructor do super mercado
     * @param name
     * @param nc
     * @param potatoePrice
     */
    public SuperMarket(String name, int nc, double potatoePrice) {
        super(name, nc);
        this.potatoePrice = potatoePrice;
    }

    @Override
    public double getPotatoesPrice() {
        return this.potatoePrice;
    }

    @Override
    public void setPotatoesPrice(double p) {
        this.potatoePrice = p;
    }

    @Override
    public double getMarketTotal(double kilos) {
        return this.potatoePrice * kilos;
    }

}
