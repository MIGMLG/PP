/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Expenses;

import java.util.Date;

/**
 * Object of User
 * @author NERD-X
 */
public class User {

    private final int ID_SIZE = 3;

    /**
     * Id of the user
     */
    protected char[] id = new char[ID_SIZE];

    /**
     * name of the user
     */
    protected String name;

    /**
     * date of the user
     */
    protected Date data;

    /**
     * email of the user
     */
    protected String email;

    /**
     * expenses of the user
     */
    protected Expenses[] expenses;

    /**
     * Sub of the user
     */
    protected Subcription donations = new Subcription();

    /**
     * Method to call the makeDonations feature
     * @param donation
     */
    public void makeDonations(double donation) {
        donations.setDonations(donation);
        //System.out.println("" + donations.isSubcriber());
    }

    /**
     * Normal Constructor without Expenses
     * @param id
     * @param name
     * @param data
     * @param email
     */
    public User(char[] id, String name, Date data, String email) {
        this.id = id;
        this.name = name;
        this.data = data;
        this.email = email;
    }

    /**
     * Contructor with array of expenses
     * @param id
     * @param name
     * @param data
     * @param email
     * @param despesas
     */
    public User(char[] id, String name, Date data, String email, Expenses[] despesas) {
        this.id = id;
        this.name = name;
        this.data = data;
        this.email = email;
        this.expenses = despesas;
    }

    @Override
    public String toString() {
        int i = 0;
        int Total = 0;
        String despesas = "";

        while (i < expenses.length && expenses[i] != null) {
            Total += 1;
            despesas += expenses[i].toString() + "\n";
            i++;
        }

        String user = "ID : " + new String(id) + "\n"
                + "Nome : " + name + "\n"
                + "Data : " + data + "\n"
                + "Email : " + email + "\n"
                + "Depesas : " + "\n" + despesas + "\n"
                + "Utilizador : " + donations.toString();
        return user;
    }

    /**
     * Method to call the mostExpensiveByMonth in PremiumFeatures
     * @param year
     * @return
     */
    public String mostExpensiveByMonth(int year) {
        String info = "";
        if (donations.isSubcriber() == false) {
            info = "Only Available for Subs.";
        } else {
            info = PremiumFeatures.mostExpensiveByMonth(expenses, year);
        }
        return info;
    }

    /**
     * Method to call the totalByMonth in PremiumFeatures
     * @param year
     * @return
     */
    public String totalByMonth(int year) {
        String info = "";
        if (donations.isSubcriber() == false) {
            info = "Only Available for Subs.";
        } else {
            info = PremiumFeatures.totalCostByMonth(expenses, year);
        }
        return info;
    }

    /**
     * Method to call the mostExpensiveByPeriod in PremiumFeatures
     * @param beginDate
     * @param endDate
     * @return
     */
    public String mostExpensiveByPeriod(Date beginDate, Date endDate) {
        String info = "";
        if (donations.isSubcriber() == false) {
            info = "Only Available for Subs.";
        } else {
            info = PremiumFeatures.mostExpensiveByPeriod(expenses, beginDate, endDate);
        }
        return info;
    }

}
