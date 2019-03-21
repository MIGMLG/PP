package pp_fp06.PizzaRestaurant;

import pp_fp06.PizzaRestaurant.enums.PizzaSize;

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
    private Ingredient[] ingredients;
    private int numberOfIngredients;
    private PizzaSize size;

    /**
     * Método construtor para a criação de uma instância de {@link Pizza pizza}.
     *
     * @param id Código que identifica uma <b>Pizza</b>
     * @param name Nome da <b>Pizza</b>
     * @param description Descrição resumida da <b>Pizza</b>
     */
    public Pizza(int id, String name, String description) {
        numberOfIngredients = 0;
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Pizza(int id, String name, String description, Ingredient[] array, int numberOfIngredients) {
        if (numberOfIngredients < 5 && numberOfIngredients > 0) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.ingredients = array;
            this.numberOfIngredients = numberOfIngredients;
        }
        else{
            System.out.println("Nao podem haver mais que 5 ingredientes.");
        }

    }
    
    public Pizza(int id, String name, String description, Ingredient[] array, int numberOfIngredients, PizzaSize size) {
        if (numberOfIngredients < 5 && numberOfIngredients > 0) {
            this.id = id;
            this.name = name;
            this.description = description;
            this.ingredients = array;
            this.numberOfIngredients = numberOfIngredients;
            this.size = size;
        }
        else{
            System.out.println("Nao podem haver mais que 5 ingredientes.");
        }

    }
    

}
