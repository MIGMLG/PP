/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp10.Companies;

import fp10.Services.CoffeeService;

/**
 * Classe da Definição de uma estação de abastecimento com serviço Café
 * @author NERD-X
 */
public class LargeGasStation extends GasStation implements CoffeeService {
    private double coffeePrice;
    
    /**
     * Metodo Constuctor de uma estação de combustivel grande
     * @param name
     * @param nc
     * @param gasPrice
     * @param coffeePrice
     */
    public LargeGasStation(String name, int nc, double gasPrice ,double coffeePrice) {
        super(name, nc, gasPrice);
        this.coffeePrice = coffeePrice;
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
        return coffees * this.coffeePrice;
    }
    
}
