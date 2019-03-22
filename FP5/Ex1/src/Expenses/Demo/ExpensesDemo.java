/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expenses.Demo;

import Expenses.Expenses;
import Expenses.User;
import static Expenses.ParseDates.ParseDates;
import java.text.ParseException;
import java.util.Date;


/**
 *  Demo of Expenses
 * @author NERD-X
 */

public class ExpensesDemo {

    /**
     * @param args the command line arguments
     * @throws java.text.ParseException
     * No Args
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        
//        Date data = ParseDates("02/01/1998");
//        System.out.println("Data : " + data);
        
        Expenses ex1 = new Expenses(1, 20 , ParseDates("02/01/2019"), "dolar");
        Expenses ex2 = new Expenses(2, 20 , ParseDates("02/01/2019"), "euro");
        
        Expenses[] array = {ex1,ex2};
        
        //User u1 = new User(new char[] {'1','2','3'},"Miguel Costa", ParseDates("02/01/1998") , "gmail");
        User u2 = new User(new char[] {'1','2','4'},"Miguel Costa", ParseDates("02/01/1998") , "gmail", array);
        u2.makeDonations(20);
        
        
        System.out.println(u2.toString());
        System.out.println(u2.mostExpensiveByMonth(2019));
        System.out.println(u2.totalByMonth(2019));
        System.out.println(u2.mostExpensiveByPeriod(ParseDates("02/01/1998"), ParseDates("02/01/2020")));
        System.out.println("");
        
    }
    
}
