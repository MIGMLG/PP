/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expenses;

import static Expenses.CurrencyRates.*;
import java.util.Date;

/**
 * Object of Expenses
 * @author NERD-X
 */
public class Expenses {

    private static final int NUMBER_OF_DAYS = 31;

    /**
     * type of expense ("Food","Car","other")
     */
    protected String type;

    /**
     * number of the expense 
     */
    protected int number;

    /**
     * value of the expense
     */
    protected float value;

    /**
     * date of the expense
     */
    protected Date data;

    /**
     * Cosntructor for Expense with type = outro
     * @param number
     * @param value
     * @param data
     */
    public Expenses(int number, float value, Date data) {
        this.type = "outro";
        this.number = number;
        this.value = value;
        this.data = data;
    }

    /**
     * Cosntructor for Expense with type = Food or Car
     * @param type
     * @param number
     * @param value
     * @param data
     */
    public Expenses(String type, int number, float value, Date data) {
        this.type = type;
        this.number = number;
        this.value = value;
        this.data = data;
    }

    /**
     * Cosntructor for Expense with CurrencyType and with type = other
     * @param number
     * @param value
     * @param data
     * @param currencyType
     */
    public Expenses(int number, float value, Date data, String currencyType) {
        if ("EURO".equals(currencyType.toUpperCase())) {
            this.type = "outro";
            this.number = number;
            this.value = value;
            this.data = data;
        } else {
            this.type = "outro";
            this.number = number;
            this.data = data;
            if ("DOLAR".equals(currencyType.toUpperCase())) {
                this.value = getFromDolar(value);
            } else if ("IENE".equals(currencyType.toUpperCase())) {
                this.value = getFromIene(value);
            }
        }
    }

    /**
     * Cosntructor for Expense with CurrencyType and with type = Food or Car
     * @param type
     * @param number
     * @param value
     * @param data
     * @param currencyType
     */
    public Expenses(String type, int number, float value, Date data, String currencyType) {
        if ("EURO".equals(currencyType.toUpperCase())) {
            this.type = type;
            this.number = number;
            this.value = value;
            this.data = data;
        } else {
            this.type = type;
            this.number = number;
            this.data = data;
            if ("DOLAR".equals(currencyType.toUpperCase())) {
                this.value = getFromDolar(value);
            } else if ("IENE".equals(currencyType.toUpperCase())) {
                this.value = getFromIene(value);
            }
        }
    }

    @Override
    public String toString() {
        String despesa = "\n"
                + "Type : " + type + "\n"
                + "Number : " + number + "\n"
                + "Value : " + value + "\n"
                + "Data : " + data ;
        return despesa;
    }

}
