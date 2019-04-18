/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1.Services;

/**
 * Classe que define a interface do serviço de fornecimento de combustivel
 *
 * @author NERD-X
 */
public interface GasService {

    /**
     * Metodo para obter o preço do combustivel
     *
     * @return
     */
    public double getGasPrice();

    /**
     * Metodo para definir o preço do combustivel
     *
     * @param p
     */
    public void setGasPrice(double p);

    /**
     * Metodo para obter o valor necessário a pagar para um x(double litres)
     * numero de litros do combustivel
     *
     * @param litres
     * @return
     */
    public double getGasTotal(double litres);

}
