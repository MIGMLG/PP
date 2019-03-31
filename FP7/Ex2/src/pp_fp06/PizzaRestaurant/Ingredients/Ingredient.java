/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant.Ingredients;

import pp_fp06.PizzaRestaurant.enums.UnitOfMeasure;
import static pp_fp06.PizzaRestaurant.enums.UnitOfMeasure.*;

/**
 * Classe que representa a estrutura de Ingrediente
 *
 * @author NERD-X
 */
public class Ingredient {

    private int id;
    private String name;
    private UnitOfMeasure unit;
    private float calories;

    public Ingredient(int id, String name, UnitOfMeasure unit, float calories) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.calories = calories;
    }

    @Override
    public String toString() {
        String text = "- ID : " + id + "\n"
                + "- Nome : " + name + "\n"
                + "- Unidade : " + UnitOfMeasureToString(unit) + "\n"
                + "- Calorias : " + calories + "\n";
        return text;
    }

}
