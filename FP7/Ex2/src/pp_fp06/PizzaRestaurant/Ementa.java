/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp_fp06.PizzaRestaurant;

import java.time.LocalDateTime;

/**
 * Classe que representa a estrutura de uma Ementa
 *
 * @author NERD-X
 */
public class Ementa {

    private static final int MAX_MENUS = 1;
    private final int MAX_PIZZAS = 10;
    private static int counter = 0;
    private Pizza[] ementa;
    private LocalDateTime date;
    private int sizeOfList;

    public static Ementa returnInstance(Pizza[] ementa) {
        if (Ementa.counter < MAX_MENUS) {
            counter +=1;
            return (new Ementa(ementa));
        } else {
            System.out.println("Já existe uma ementa.");
            return null;
        }
    }
    
    public static Ementa returnInstance(Pizza ementa) {
        if (Ementa.counter < MAX_MENUS) {
            counter +=1;
            return (new Ementa(ementa));
        } else {
            System.out.println("Já existe uma ementa.");
            return null;
        }
    }

    /**
     * Metodo construtor da Ementa
     *
     * @param ementa
     */
    private Ementa(Pizza[] ementa) {
        if (ementa.length > 10) {
            System.out.println("Erro. Ementa no máximo tem 10 pizzas.");
        } else {
            this.ementa = ementa;
            this.date = LocalDateTime.now();
            this.sizeOfList = ementa.length;
        }
    }

    /**
     * Metodo constructor que so recebe uma pizza e verifica se contem um
     * ingrediente vegetal
     *
     * @param ementa
     */
    private Ementa(Pizza ementa) {
        if (counter < 1) {
            if (ementa.findVegetalIngredients() > 0) {
                this.ementa = new Pizza[MAX_PIZZAS];
                this.ementa[0] = ementa;
                this.sizeOfList = 1;
            }
        } else {
            System.out.println("Já existe uma ementa.");
        }

    }
    
    /**
     * Metodo para obter o tamanho do array
     *
     * @return
     */
    public int getSizeOfList() {
        return sizeOfList;
    }

    @Override
    public String toString() {
        String text = "Ementa : " + "\n";

        for (int i = 0; i < sizeOfList; i++) {
            text += ementa[i].toString() + "\n";
        }

        return text;
    }
}
