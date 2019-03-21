/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expenses;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Class for parsing Dates
 * @author NERD-X
 */

public class ParseDates {
    
    /**
     * method to parse dates
     * @param data
     * @return
     * @throws ParseException
     */
    public static Date ParseDates(String data) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        return formatter.parse(data);
    }
    
}
