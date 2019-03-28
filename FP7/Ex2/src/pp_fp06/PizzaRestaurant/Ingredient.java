/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant;

import pp_fp06.PizzaRestaurant.enums.IngredientType;
import pp_fp06.PizzaRestaurant.enums.UnitOfMeasure;

/**
 * Classe que representa a estrutura de Ingrediente
 *
 * @author NERD-X
 */
public class Ingredient {

    private int id;
    private String name;
    private IngredientType origin;
    private UnitOfMeasure unit;
    private float calories; 

    /**
     * Metodo construtor de Ingrediente
     *
     * @param id
     * @param name
     * @param origin
     */
    public Ingredient(int id, String name, IngredientType origin) {
        this.id = id;
        this.name = name;
        this.origin = origin;
    }

    public Ingredient(int id, String name, IngredientType origin, UnitOfMeasure unit, float calories) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.unit = unit;
        this.calories = calories;
    }

    
    
    @Override
    public String toString() {
        String text = " " + name + ",";
        return text;
    }

    /**
     * returnar id do ingrediente
     *
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo que retorna o type de ingrediente
     *
     * @return
     */
    public IngredientType getOrigin() {
        return origin;
    }

}
