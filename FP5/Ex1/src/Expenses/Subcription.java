/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expenses;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * CObject of Sub
 * @author NERD-X
 */
public class Subcription {

    /**
     * bool to check if the user is a sub
     */
    protected boolean subcriber = false; // 0 free , 1 premium

    /**
     * amount of donations made by the user
     */
    protected double donations = 0;

    /**
     * End date of the sub
     */
    protected Date endDate;

    private static final DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

//    public double getDonations() {
//        return donations;
//    }

    /**
     * method to make donations
     * @param donations
     */

    public void setDonations(double donations) {
        this.donations += donations;
        if (donations > 1) {
            int days = 5 * (int) Math.round(donations);
            subcriber = true;
            Date date = new Date();
            Calendar c = Calendar.getInstance();
            c.setTime(date);
            c.add(Calendar.DATE, days);
            date = c.getTime();
            this.endDate = date;
            //System.out.println(sdf.format(date));
        }
    }

    /**
     * method to check if the user is a sub
     * @return
     */
    public boolean isSubcriber() {
        return subcriber;
    }
    
    @Override
    public String toString(){
        String info;
        if (subcriber == true) {
            info = "Premium" + "\n"
                    + "Data de Exp: " + sdf.format(endDate) + "\n";
        } else {
            info = "Free" + "\n";
        }
        return info;
    }

}
