/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.Ingredients;

import pp_fp06.PizzaRestaurant.Ingredients.Topping;
import pp_fp06.PizzaRestaurant.enums.MeatType;
import pp_fp06.PizzaRestaurant.enums.OriginType;
import pp_fp06.PizzaRestaurant.enums.UnitOfMeasure;

/**
 *
 * @author NERD-X
 */
public class Meat extends Topping{
    
    private MeatType meat;

    public Meat(MeatType meat, OriginType origin, int id, String name, UnitOfMeasure unit, float calories) {
        super(origin, id, name, unit, calories);
        this.meat = meat;
    }
    
    
    
}
