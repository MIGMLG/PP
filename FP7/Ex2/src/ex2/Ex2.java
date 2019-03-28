/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import pp_fp06.PizzaRestaurant.Ementa;
import pp_fp06.PizzaRestaurant.Ingredient;
import pp_fp06.PizzaRestaurant.Pizza;
import static pp_fp06.PizzaRestaurant.enums.IngredientType.*;
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
        Ingredient n1 = new Ingredient(1 , "Queijo", VEGETAL , GRAMAS, 230);
        Ingredient n2 = new Ingredient(2 , "Chouriço", ANIMAL, GRAMAS, 450);
        Ingredient n3 = new Ingredient(3 , "Chouriço", ANIMAL, GRAMAS, 450);
        
        Ingredient[] ingredientes = { n1 , n2 , n3};
        
        Pizza pizza1 = new Pizza(1, "Pizza 1", "Ola", ingredientes, ingredientes.length, SMALL);
        System.out.println(pizza1.toString());
        pizza1.removeIngredient(3);
        System.out.println(pizza1.toString());
        
        Pizza pizza2 = new Pizza(2, "Pizza 2", "Ola", ingredientes, ingredientes.length, SMALL);
        
        Pizza[] pizzas = {pizza1, pizza2}; 
        
        Ementa ementa = Ementa.returnInstance(pizzas);
        System.out.println("---------------------------------");
        System.out.println(ementa.toString());
        Ementa ementa1 = Ementa.returnInstance(pizzas);
    }
    
}
