/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

/**
 *
 * @author NERD-X
 */
public class Ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (args[1].toUpperCase().equals("E")) {
            double dolar = Double.parseDouble(args[0]) * 1.5;
            System.out.println(dolar + " $");
        } else {
            double euro = Double.parseDouble(args[0]) * 0.5;
            System.out.println(euro + " €");
        }

    }

}
