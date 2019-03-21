/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4.store;

import ex4.cd.*;
import java.util.Date;

/**
 * Object of Sale
 * @author NERD-X
 */

public class Sale {

    /**
     *ID of sale
     */
    protected int saleId;

    /**
     *Date of the sale
     */
    protected Date dateOfSale;

    /**
     *List of the CD´s sold in the sale
     */
    protected CD[] listOfCds;

    /**
     *Total value paid
     */
    protected double Total = 0;

    /**
     *Size of the received list of CD`s
     */
    protected int size;

    /**
     * Normal Constructor
     * @param saleId
     * @param dateOfSale
     * @param listOfCds
     */
    public Sale(int saleId, Date dateOfSale, CD[] listOfCds) {
        this.saleId = saleId;
        this.dateOfSale = dateOfSale;
        this.listOfCds = listOfCds;
        this.size = listOfCds.length;
        for(int i = 0; i < size; i++){
            this.Total += listOfCds[i].price;
        }
        
    }
}
