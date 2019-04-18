/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Companies;

/**
 *
 * @author NERD-X
 */
public class GasStation extends Company implements GasService{
    private double gasPrice = 2.00;
    
    public GasStation(String name, int nc) {
        super(name, nc);
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
    
}
