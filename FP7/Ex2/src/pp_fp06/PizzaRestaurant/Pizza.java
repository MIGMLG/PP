package pp_fp06.PizzaRestaurant;

import pp_fp06.PizzaRestaurant.Ingredients.Base;
import pp_fp06.PizzaRestaurant.Ingredients.Cheese;
import pp_fp06.PizzaRestaurant.Ingredients.Ingredient;
import pp_fp06.PizzaRestaurant.Ingredients.Meat;
import pp_fp06.PizzaRestaurant.Ingredients.SeaFood;
import pp_fp06.PizzaRestaurant.Ingredients.Topping;
import pp_fp06.PizzaRestaurant.Ingredients.Vegetable;
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
    private Base base;
    private final float defaultPrice = (float) 5.00;
    private int counterTop = 0;
    private int counterBase = 0;
    private int meatType = 0;
    private int vegetalType = 0;
    private int seaFoodType = 0;
    private int cheeseType = 0;

    /**
     * Método construtor para a criação de uma instância de {@link Pizza pizza}.
     *
     * @param id Código que identifica uma <b>Pizza</b>
     * @param name Nome da <b>Pizza</b>
     * @param description Descrição resumida da <b>Pizza</b>
     * @param size Tamanho da Pizza
     */
    public Pizza(int id, String name, String description, PizzaSize size) {
        numberOfIngredients = 0;
        this.id = id;
        this.name = name;
        this.description = description;
        this.size = size;
    }

    /**
     * Metodo para adicionar uma base há pizza
     *
     * @param base
     */
    public void addBase(Base base) {
        if (counterBase == 0) {
            this.base = base;
            counterBase += 1;
        } else {
            System.out.println("Ja tem uma base selecionada.");
        }
    }

    /**
     * Metodo para adicionar ingredientes á pizza
     *
     * @param top
     * @param quantity
     */
    public void addTopping(Ingredient top, float quantity) {
        if (counterBase == 1) {
            if (counterTop < MAX_INGREDIENTS) {
                if (top instanceof Meat) {
                    meatType += 1;
                } else if (top instanceof Vegetable) {
                    vegetalType += 1;
                } else if (top instanceof SeaFood) {
                    seaFoodType += 1;
                } else if (top instanceof Cheese) {
                    cheeseType += 1;
                }
                ingredients[counterTop] = new PizzaIngredients(top, quantity);
                counterTop += 1;
            } else {
                System.out.println("Ja tem 5 ingredientes.");
            }
        } else {
            System.out.println("Ainda não tem uma base selecionada.");
        }

    }

    @Override
    public String toString() {
        String text = "--------------------------------------------------------" + "\n"
                + "ID da Pizza : " + id + "\n"
                + "Nome da Pizza : " + name + "\n";

        if (meatType > 0) {
            if (seaFoodType == 0 && vegetalType == 0) {
                text += "Tipo de Pizza : Carne" + "\n";
            } else {
                text += "Tipo de Pizza : Mixed" + "\n";
            }
        } else if (vegetalType > 0) {
            if (seaFoodType == 0 && meatType == 0) {
                text += "Tipo de Pizza : Vegetal" + "\n";
            } else {
                text += "Tipo de Pizza : Mixed" + "\n";
            }
        } else if (seaFoodType > 0) {
            if (vegetalType == 0 && meatType == 0) {
                text += "Tipo de Pizza : Peixe" + "\n";
            } else {
                text += "Tipo de Pizza : Mixed" + "\n";
            }
        }

        text += base.toString();

        for (int i = 0; i < counterTop; i++) {
            text += "Ingrediente " + (i + 1) + " :" + "\n"
                    + ingredients[i].toString();
        }

        return text;
    }

}
