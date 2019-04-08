/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import pp_fp06.PizzaRestaurant.Ingredients.*;
import pp_fp06.PizzaRestaurant.Pizza;
import pp_fp06.PizzaRestaurant.enums.CheeseType;
import static pp_fp06.PizzaRestaurant.enums.CheeseType.SERRA;
import pp_fp06.PizzaRestaurant.enums.MeatType;
import pp_fp06.PizzaRestaurant.enums.OriginType;
import static pp_fp06.PizzaRestaurant.enums.OriginType.NACIONAL;
import static pp_fp06.PizzaRestaurant.enums.PizzaBaseType.*;
import static pp_fp06.PizzaRestaurant.enums.PizzaSize.*;
import static pp_fp06.PizzaRestaurant.enums.UnitOfMeasure.*;

/**
 *
 * @author NERD-X
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Base base = new Base(1, "Base Da Pizza", 200, MFINA , "Ola");
        Cheese top = new Cheese(SERRA, NACIONAL, 1, "Queijo da Serra", GRAMAS, 300);
        Meat top1 = new Meat(MeatType.VACA, NACIONAL, 2, "DONT KNOW", GRAMAS, 400);
        Pizza n1 = new Pizza(1, "Pizza PERIGRINI", "PERIGRINI", BIG);
        n1.addBase(base);
        n1.addTopping(top, 200);
        n1.addTopping(top1, 200);
        n1.addTopping(top1, 200);
        n1.addTopping(top1, 200);
        n1.addTopping(top1, 200);
        n1.addTopping(top1, 200);
        
        System.out.println(n1.toString());
        
    }
    
}
