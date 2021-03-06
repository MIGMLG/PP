/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.Ingredients;

import pp_fp06.PizzaRestaurant.Ingredients.Topping;
import pp_fp06.PizzaRestaurant.enums.CheeseType;
import pp_fp06.PizzaRestaurant.enums.OriginType;
import pp_fp06.PizzaRestaurant.enums.UnitOfMeasure;

/**
 * Definição do Objeto Cheese
 * @author NERD-X
 */
public class Cheese extends Topping{
    private CheeseType cheese;

    /**
     * Metodo Construtor do Cheese
     * @param cheese
     * @param origin
     * @param id
     * @param name
     * @param unit
     * @param calories
     */
    public Cheese(CheeseType cheese, OriginType origin, int id, String name, UnitOfMeasure unit, float calories) {
        super(origin, id, name, unit, calories);
        this.cheese = cheese;
    }
    
    
}
