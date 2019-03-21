/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4.store;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Returns Date in the correct format
 * @author NERD-X
 */

public class ParseDates {
    
    /**
     * Returns Date in the correct format
     * @param data
     * @return
     * @throws ParseException
     */
    public static Date ParseDates(String data) throws ParseException{
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.parse(data);
    }
    
}
