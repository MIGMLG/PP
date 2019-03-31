package pp_fp06.PizzaRestaurant;

import pp_fp06.PizzaRestaurant.Ingredients.Ingredient;
import pp_fp06.PizzaRestaurant.Ingredients.Topping;
import pp_fp06.PizzaRestaurant.enums.PizzaSize;
import static pp_fp06.PizzaRestaurant.enums.PizzaSize.*;

/**
 * <h3>
 * ESTG - Escola Superior de Tecnologia e Gestão <br>
 * IPP - Instituto Politécnico do Porto <br>
 * LEI - Licenciatura em Engenharia Informática<br>
 * PP - Paradigmas de Programação <br>
 * </h3>
 * <p>
 * <strong>Descrição: </strong><br>
 * Classe que representa a estrutura de uma pizza
 * </p>
 */

public class Pizza {

    private final int MAX_INGREDIENTS = 5;
    private int id;
    private String name;
    private String description;
    private PizzaIngredients[] ingredients = new PizzaIngredients[MAX_INGREDIENTS];
    private int numberOfIngredients;
    private PizzaSize size;
    private final float defaultPrice = (float) 5.00; 
    private int counterTop = 0;

    /**
     * Método construtor para a criação de uma instância de {@link Pizza pizza}.
     *
     * @param id Código que identifica uma <b>Pizza</b>
     * @param name Nome da <b>Pizza</b>
     * @param description Descrição resumida da <b>Pizza</b>
     */
    
    public Pizza(int id, String name, String description, PizzaSize size) {
        numberOfIngredients = 0;
        this.id = id;
        this.name = name;
        this.description = description;
        this.size = size;
    }
    
    public void addTopping(Topping top, float quantity){
        if(counterTop < MAX_INGREDIENTS ){
            Ingredient ingrediente = (Ingredient) top;
            ingredients[counterTop] = new PizzaIngredients(ingrediente, quantity);
            counterTop += 1;
        }else {
            System.out.println("Ja tem 5 ingredientes.");
        }
        
    }
    
 
}
