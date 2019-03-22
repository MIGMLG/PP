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
 * Class of Premium Features
 * @author NERD-X
 */
public class PremiumFeatures {

    private static final DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    /**
     * Method to get the most Expensive expenses by month
     * @param despesas
     * @param year
     * @return
     */
    protected static String mostExpensiveByMonth(Expenses[] despesas, int year) {
        Calendar c = Calendar.getInstance();
        String info = "";
        int[] mes = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        float mostExpensive;
        int mostExepensivePosition;

        for (int i = 0; i < despesas.length; i++) {
            c.setTime(despesas[i].data);
            mes[c.get(Calendar.MONTH)] = 1;
        }

        for (int i = 0; i < mes.length; i++) {

            if (mes[i] == 1) {

                mostExpensive = 0;
                mostExepensivePosition = -1;

                for (int j = 0; j < despesas.length; j++) {
                    Calendar c1 = Calendar.getInstance();
                    c1.setTime(despesas[j].data);

                    if (i == c1.get(Calendar.MONTH) && c.get(Calendar.YEAR) == year) {
                        if (despesas[j].value > mostExpensive) {
                            mostExpensive = despesas[j].value;
                            mostExepensivePosition = j;
                        }
                    }

                }

                if (mostExepensivePosition >= 0) {
                    info += "Mes : " + (i + 1) + "\n";
                    info += "Number : " + despesas[mostExepensivePosition].number + "\n"
                            + "Data : " + sdf.format(despesas[mostExepensivePosition].data) + "\n"
                            + "Type : " + despesas[mostExepensivePosition].type + "\n"
                            + "Value : " + despesas[mostExepensivePosition].value + "\n";
                }

            }

        }

        return info;
    }

    /**
     * Method to get the total value of expenses by month
     * @param despesas
     * @param year
     * @return
     */
    protected static String totalCostByMonth(Expenses[] despesas, int year) {
        Calendar c = Calendar.getInstance();
        String info = "";
        int[] mes = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        float total;

        for (Expenses despesa : despesas) {
            c.setTime(despesa.data);
            mes[c.get(Calendar.MONTH)] = 1;
        }

        for (int i = 0; i < mes.length; i++) {
            if (mes[i] == 1) {

                total = 0;

                for (Expenses despesa : despesas) {
                    Calendar c1 = Calendar.getInstance();
                    c1.setTime(despesa.data);
                    if (i == c1.get(Calendar.MONTH) && c.get(Calendar.YEAR) == year) {
                        total += despesa.value;
                    }
                }

                info += "Mes : " + (i + 1) + "\n";
                info += "Total : " + total + "\n";

            }

        }

        return info;
    }

    /**
     * Method to get the most Expensive expenses by a defined Period of time
     * @param despesas
     * @param beginDate
     * @param endDate
     * @return
     */
    protected static String mostExpensiveByPeriod(Expenses[] despesas, Date beginDate, Date endDate){
        Calendar c = Calendar.getInstance();
        Calendar begin = Calendar.getInstance();
        Calendar end = Calendar.getInstance();
        
        begin.setTime(beginDate);
        end.setTime(endDate);
        
        String info = "";
        float mostExpensive = 0;
        String mostExpensiveType = "";


        for (Expenses despesa : despesas) {
            c.setTime(despesa.data);
            if (c.after(begin) && c.before(end)) {
                if (despesa.value > mostExpensive) {
                    mostExpensiveType = despesa.type;
                }
            }
        }
        
        info = "Type : " + mostExpensiveType;
        
        return info;
     }
    
}
