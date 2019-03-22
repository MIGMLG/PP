/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant;

/**
 *
 * @author NERD-X
 */
public class Ementa {
    private final int MAX_PIZZAS = 10;
    private Pizza[] ementa;

    public Ementa(Pizza[] ementa) {
        if (ementa.length > 10){
            System.out.println("Erro. Ementa no máximo tem 10 pizzas.");
        }
        else {
            this.ementa = ementa;
        }
        
    }
    
//    public Ementa(Pizza ementa) {
//        if(ementa.){
//            
//        }
//            this.ementa = new Pizza[MAX_PIZZAS];
//            this.ementa[0] = ementa;     
//    }
    

}
