/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant;

import pp_fp06.PizzaRestaurant.enums.IngredientType;

/**
 *
 * @author NERD-X
 */
public class Ingredient {
    private int id;
    private String name;
    private IngredientType origin;

    public Ingredient(){
        
    }

    public Ingredient(int id, String name, IngredientType origin) {
        this.id = id;
        this.name = name;
        this.origin = origin;
    }
            
    
    
    
    
}
