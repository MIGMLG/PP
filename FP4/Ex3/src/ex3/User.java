/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

import Ex4.exchange.CurrencyRates;

/**
 *
 * @author NERD-X
 */
public class User {
    private static final int ID_SIZE = 3;
    protected static char[] id = new char[ID_SIZE];
    protected static char[] name;
    protected static char[] email;
    
    protected static Expenses expenses;
    protected static CurrencyRates rates;
}
