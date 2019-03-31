/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant;

import pp_fp06.PizzaRestaurant.Ingredients.Ingredient;

/**
 *
 * @author NERD-X
 */
public class PizzaIngredients {
    private Ingredient ingredient;
    private float quantity;

    /**
     *
     * @param ingredient
     * @param quantity
     */
    public PizzaIngredients(Ingredient ingredient, float quantity) {
        this.ingredient = ingredient;
        this.quantity = quantity;
    }

    /**
     * Metodo para retornar o ingrediente
     * @return
     */
    public Ingredient getIngredient() {
        return ingredient;
    }

    /**
     * Metodo para definir o ingrediente
     * @param ingredient
     */
    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    /**
     * Metodo para retornar a quantidade
     * @return
     */
    public float getQuantity() {
        return quantity;
    }

    /**
     * Metodo para definir a quantidade
     * @param quantity
     */
    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString(){
        String text = ingredient.toString();
        return text;
    }
    
}
