/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.Ingredients;

import pp_fp06.PizzaRestaurant.enums.OriginType;
import pp_fp06.PizzaRestaurant.enums.UnitOfMeasure;
import pp_fp06.PizzaRestaurant.enums.VegetalType;

/**
 *
 * @author NERD-X
 */
public class Vegetable extends Topping {

    private VegetalType vegetal;

    public Vegetable(VegetalType vegetal, OriginType origin, int id, String name, UnitOfMeasure unit, float calories) {
        super(origin, id, name, unit, calories);
        this.vegetal = vegetal;
    }

}
