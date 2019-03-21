/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import pp_fp06.PizzaRestaurant.Ingredient;
import pp_fp06.PizzaRestaurant.Pizza;
import static pp_fp06.PizzaRestaurant.enums.IngredientType.*;

/**
 *
 * @author NERD-X
 */
public class Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ingredient n1 = new Ingredient(1 , "Queijo", VEGETAL);
        Ingredient n2 = new Ingredient(2 , "Chouriço", ANIMAL);
        
        Ingredient[] ingredientes = { n1 , n2};
        
        Pizza pizza1 = new Pizza(1, "Pizza 1", "Ola", ingredientes, ingredientes.length);
        
        
    }
    
}
