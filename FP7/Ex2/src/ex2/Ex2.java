/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import pp_fp06.PizzaRestaurant.Ementa;
import pp_fp06.PizzaRestaurant.Ingredients.*;
import pp_fp06.PizzaRestaurant.Ingredients.Ingredient;
import pp_fp06.PizzaRestaurant.Pizza;
import pp_fp06.PizzaRestaurant.PizzaIngredients;
import pp_fp06.PizzaRestaurant.enums.CheeseType;
import pp_fp06.PizzaRestaurant.enums.OriginType;
import pp_fp06.PizzaRestaurant.enums.PizzaBaseType;
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
        
        Base base = new Base(1, "Base Da Pizza", 200, PizzaBaseType.MFINA , "Ola");
        Cheese top = new Cheese(CheeseType.SERRA, OriginType.NACIONAL, 1, "Queijo da Serra", LITROS, 300);
        Pizza n1 = new Pizza(1, "Pizza PERIGRINI", "PERIGRINI", BIG);
        n1.addBase(base);
        n1.addTopping(top, 200);
        
    }
    
}
