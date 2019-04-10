/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Bikes;

import java.time.LocalDateTime;

/**
 * Clase da gestão de vendas de bikes
 * @author NERD-X
 */
public class BikeSalesManagement extends ContainerOfObjects{
    private int saleID;
    private LocalDateTime date;
    private double total;

    /**
     * Metodo construtor que recebe um array de bicicletas e o resto da informação
     * @param objects
     * @param saleID
     * @param date
     */
    public BikeSalesManagement(Bike[] objects,int saleID, LocalDateTime date) {
        super(objects);
        this.saleID = saleID;
        this.date = date;
    }

    /**
     * Metodo construtor que recebe o tamanho maximo do array dos objetos e o resto da informação
     * @param saleID
     * @param date
     * @param maxSize
     */
    public BikeSalesManagement(int saleID, LocalDateTime date, int maxSize) {
        super(maxSize);
        this.saleID = saleID;
        this.date = date;
    }
    
    /**
     * Metodo para adicionar novas Bikes
     * @param newBike
     * @return
     */
    public boolean addBike(Bike newBike){
        return super.addObjects(newBike);
    }
    
    /**
     * Metodo para remover Bikes
     * @param removedBike
     * @return
     */
    public Bike removeBike(Bike removedBike){
        int position = super.findObject(removedBike);
        return (Bike) super.removeObjects(position);
    }
    
    /**
     * Metodo para substituir uma bike por outra 
     * @param position
     * @param newBike
     * @return
     */
    public boolean setBike(int position, Bike newBike){
        return super.setObject(position, newBike);
    }
    
    /**
     * Metodo para encontrar uma Bike especifica
     * @param newBike
     * @return
     */
    public int findBike(Bike newBike){
        return super.findObject(newBike);
    }
    
    @Override
    public boolean equals(Object object){
        return super.hasObject(object);
    }
    
    /**
     * Metodo para imprimir a informação sobre as Bikes na venda
     * @return
     */
    public String printAllBikes(){
        return super.printAll();
    }
}
