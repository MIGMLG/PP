/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp10.Companies;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 * @author NERD-X
 */
public class JumbHipermarket extends HyperMarket{
    
    public JumbHipermarket(String name, int nc, double gasPrice, double coffeePrice, double potatoePrice, double annualRate) {
        super(name, nc, gasPrice, coffeePrice, potatoePrice, annualRate);
    }
    
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
