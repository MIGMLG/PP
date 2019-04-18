/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Services;

/**
 * Classe que define a interface do serviço de mercado
 * @author NERD-X
 */
public interface MarketService {
    
    /**
     * Metodo para obter o preço das batatas
     * @return
     */
    public double getPotatoesPrice();
    
    /**
     * Metodo para definir o preço das batatas 
     * @param p
     */
    public void setPotatoesPrice(double p);
    
    /**
     * Metodo para obter o total a pagar num x(double kilos) kilos de batatas
     * @param kilos
     * @return
     */
    public double getMarketTotal(double kilos);
    
}
