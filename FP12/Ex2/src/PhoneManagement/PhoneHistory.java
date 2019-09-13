/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneManagement;

/**
 * Classe que define o histórico de um número
 * @author NERD-X
 */
public class PhoneHistory {
    private int areaCode;
    private String number;
    private int voiceMailMessages;
    private float daysMin;
    private float eveMins;
    private float nightMins;
    private float intlMins;

    /**
     * Metodo Constructor
     * @param areaCode
     * @param number
     * @param voiceMailMessages
     * @param daysMin
     * @param eveMins
     * @param nightMins
     * @param intlMins
     */
    public PhoneHistory(int areaCode, String number, int voiceMailMessages, float daysMin, float eveMins, float nightMins, float intlMins) {
        this.areaCode = areaCode;
        this.number = number;
        this.voiceMailMessages = voiceMailMessages;
        this.daysMin = daysMin;
        this.eveMins = eveMins;
        this.nightMins = nightMins;
        this.intlMins = intlMins;
    }

    /**
     * Metodo para retornar o código da área
     * @return
     */
    public int getAreaCode() {
        return areaCode;
    }

    /**
     * Metodo para retornar o número
     * @return
     */
    public String getNumber() {
        return number;
    }

    /**
     * Metodo para retornar a quantidade de mensagens de voicemail
     * @return
     */
    public int getVoiceMailMessages() {
        return voiceMailMessages;
    }

    /**
     * Metodo para retornar os minutos gastos em chamadas durante o dia
     * @return
     */
    public float getDaysMin() {
        return daysMin;
    }

    /**
     * Metodo para retornar os minutos gastos em chamadas durante o anoitecer
     * @return
     */
    public float getEveMins() {
        return eveMins;
    }

    /**
     * Metodo para retornar os minutos gastos em chamadas durante a noite
     * @return
     */
    public float getNightMins() {
        return nightMins;
    }

    /**
     * Metodo para retornar os minutos gastos em chamadas durante Intl ?
     * @return
     */
    public float getIntlMins() {
        return intlMins;
    }
    
}
