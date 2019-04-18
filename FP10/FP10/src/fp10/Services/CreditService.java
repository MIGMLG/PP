/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp10.Services;

/**
 * Classe que define o serviço de crédito
 * @author NERD-X
 */
public interface CreditService {
    
    /**
     * Metodo para obter a taxa anual
     * @return
     */
    public double getAnnualRate();
    
    /**
     * Metodo para definir a taxa anual
     * @param r racio
     */
    public void setAnnualRate(double r);
    
    /**
     * Metodo para calcular o pagamento a fazer mensalmente
     * @param ammount
     * @param months
     * @return
     */
    public double computeMonthlyPayment(double ammount, int months);
    
}
