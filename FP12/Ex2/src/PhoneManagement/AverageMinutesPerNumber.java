/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneManagement;

/**
 * Classe que define o objeto da média por número
 * @author NERD-X
 */
public class AverageMinutesPerNumber {
    
    private String number;
    private float average;

    /**
     * Metodo Constructor
     * @param number
     * @param average
     */
    public AverageMinutesPerNumber(String number, float average) {
        this.number = number;
        this.average = average;
    }

    /**
     * Metodo para obter o número
     * @return
     */
    public String getNumber() {
        return number;
    }

    /**
     * Metodo para obter a média
     * @return
     */
    public float getAverage() {
        return average;
    }
    
}
