/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.Ingredients;

import pp_fp06.PizzaRestaurant.Ingredients.Ingredient;
import pp_fp06.PizzaRestaurant.enums.OriginType;
import pp_fp06.PizzaRestaurant.enums.UnitOfMeasure;

/**
 * Definição do Objeto Topping
 * @author NERD-X
 */
public class Topping extends Ingredient{
    
    private OriginType origin ;

    /**
     * Metodo Construtor do Topping
     * @param origin
     * @param id
     * @param name
     * @param unit
     * @param calories
     */
    public Topping(OriginType origin, int id, String name, UnitOfMeasure unit, float calories) {
        super(id, name, unit, calories);
        this.origin = origin;
    }

    /**
     * Metodo que retorna a origem do Topping
     * @return
     */
    public OriginType getOrigin() {
        return origin;
    }
    
    
    
}
