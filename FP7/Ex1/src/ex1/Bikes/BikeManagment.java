/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Bikes;

/**
 *
 * @author NERD-X
 */
public class BikeManagment {
    private final int MAX_BIKES = 20;
    private Bike[] lista = new Bike[MAX_BIKES];
    private int counterBikes = 0;
    
    /**
     * Este metodo permite adicionar Bikes á lista
     * @param bike
     */
    public void addBike(Bike bike){
        if ( counterBikes < MAX_BIKES){
            lista[counterBikes] = bike;
            counterBikes +=1;
        }
        else {
            System.out.println("Já antigiu o numero máximo de bikes na lista.");
        }
    }
    
    public String toString(){
        String text = "";
        for(int i = 0; i < counterBikes; i++){
            text += "Bike " + (i+1) + " : "+ "\n" +lista[i].toString() +"\n";
        }
        return text;
    }
}
