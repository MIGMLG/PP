/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp10.Companies;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Classe que define um supermercado da jumbo
 * @author NERD-X
 */
public class JumbHipermarket extends HyperMarket{
    
    /**
     * Metodo Constructor de um supermercado da jumbo
     * @param name
     * @param nc
     * @param gasPrice
     * @param coffeePrice
     * @param potatoePrice
     * @param annualRate
     */
    public JumbHipermarket(String name, int nc, double gasPrice, double coffeePrice, double potatoePrice, double annualRate) {
        super(name, nc, gasPrice, coffeePrice, potatoePrice, annualRate);
    }
    
    /**
     * Metodos para obter os pontos dos clientes
     * @param purchaseValue
     * @return
     */
    @Override
    public int getPoints(double purchaseValue){
        if( LocalDate.now().getDayOfWeek() == DayOfWeek.SATURDAY || LocalDate.now().getDayOfWeek() == DayOfWeek.SUNDAY){
            if(purchaseValue >= 10){
                return (int) (1 * (purchaseValue/10));
            }
            else{
                return 0;
            }
        }else {
            if(purchaseValue >= 10){
                return (int) (3 * (purchaseValue/10));
            }
            else{
                return 0;
            }
        }
    }
}
