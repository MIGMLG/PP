/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp10.Companies;

import fp10.Services.GasService;

/**
 * Classe que define uma estação de abastecimento que extende empresa e implementa
 * o serviço de fornecimento de combustivel
 *
 * @author NERD-X
 */
public class GasStation extends Company implements GasService {

    private double gasPrice;

    /**
     * Metodo Constructor de GasStation
     * @param name
     * @param nc
     * @param gasPrice
     */
    public GasStation(String name, int nc, double gasPrice) {
        super(name, nc);
        this.gasPrice = gasPrice;
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
        return litres * this.gasPrice;
    }
    
    /**
     * Metodo para obter as bombas de gasolina onde o preço é mais barato
     * @param gasStations
     * @return
     */
    public int compareGasStations(GasStation[] gasStations){
        double price = gasStations[0].getGasPrice();
        int position = 0;
        for (int i = 1; i < gasStations.length; i++) {
            if(gasStations[i].getGasPrice()< price){
                price = gasStations[i].getGasPrice();
                position = i;
            }
        }
        return position;
    }

}
