/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.Ingredients;

import pp_fp06.PizzaRestaurant.enums.PizzaBaseType;
import pp_fp06.PizzaRestaurant.enums.UnitOfMeasure;
import static pp_fp06.PizzaRestaurant.enums.UnitOfMeasure.GRAMAS;

/**
 *
 * @author NERD-X
 */
public class Base extends Ingredient{
    private PizzaBaseType baseType;
    private String description;

    public Base(int id, String name, float calories, PizzaBaseType baseType, String description) {
        super(id, name, GRAMAS, calories);
        this.baseType = baseType;
        this.description = description;
    }
    
}
