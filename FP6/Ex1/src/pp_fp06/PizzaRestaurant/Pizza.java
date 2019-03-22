package pp_fp06.PizzaRestaurant;

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
    private Ingredient[] ingredients;
    private int numberOfIngredients;
    private PizzaSize size;
    private final float defaultPrice = (float) 5.00; 

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

//    /**
//     *
//     * @param id
//     * @param name
//     * @param description
//     * @param array
//     * @param numberOfIngredients
//     */
//    public Pizza(int id, String name, String description, Ingredient[] array, int numberOfIngredients) {
//        if (numberOfIngredients < MAX_INGREDIENTS && numberOfIngredients > 0) {
//            this.id = id;
//            this.name = name;
//            this.description = description;
//            this.ingredients = array;
//            this.numberOfIngredients = numberOfIngredients;
//        }
//        else{
//            System.out.println("Nao podem haver mais que 5 ingredientes.");
//        }
//
//    }
    
    /**
     *
     * @param id
     * @param name
     * @param description
     * @param array
     * @param numberOfIngredients
     * @param size
     */
    public Pizza(int id, String name, String description, Ingredient[] array, int numberOfIngredients, PizzaSize size) {
        if (numberOfIngredients < MAX_INGREDIENTS && numberOfIngredients > 0) {
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
    
    public void removeIngredient(int id){
        int[] positions = new int[ingredients.length];
        int found = 0;
        
        for(int i = 0; i < ingredients.length; i++){ //type de varivel, nome da variavel a ser usada, array no final
            if(ingredients[i].getId() == id){
                positions[i] = 1;
                found += 1; 
            }
        }
        
        if(found > 0){
            Ingredient[] tmp = new Ingredient[ingredients.length - found];
            int tmpPosition = 0;
            
            for(int i = 0; i < positions.length; i++){
                if(positions[i] == 0){
                    tmp[tmpPosition] = ingredients[i];
                    tmpPosition += 1;
                }
            }
            
            this.ingredients = tmp;
        }
        else{
            System.out.println("Não foi encontrado.");
        }
    }
    
    @Override
    public String toString(){
        String text = "ID: " + id + "\n"
                    + "Nome : " + name + "\n"
                    + "Tamanho : " + PizzaSizeToString(size) + "\n"
                    + "Ingredientes : ";
        for(Ingredient ingredient : ingredients){ //type de varivel, nome da variavel a ser usada, array no final
            text += ingredient.toString();
        }
        
        text += "\n" 
                + "Preço : " + GetPizzaPrice(size, defaultPrice) + "$";
        return text;
    }
    

}
