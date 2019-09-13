/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneManagement;

/**
 * Classe que define o objeto da média por área
 * @author NERD-X
 */
public class AverageMinutesPerArea{
    
    private int areaCode;
    private float average;

    /**
     * Metodo Constructor
     * @param areaCode
     * @param average
     */
    public AverageMinutesPerArea(int areaCode, float average) {
        this.areaCode = areaCode;
        this.average = average;
    }

    /**
     * Metodo para retornar o código da área
     * @return
     */
    public int getAreaCode() {
        return areaCode;
    }

    /**
     * Metodo que retorna a média
     * @return
     */
    public float getAverage() {
        return average;
    }
    
}
