/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fp10.Services;

/**
 * Classe que define a interface de um Hyper mercado, sendo esta uma extensão
 * dos outros serviços
 *
 * @author NERD-X
 */
public interface HyperMarketService extends GasService, CoffeeService, MarketService, CreditService {

    /**
     * Metodo para obter os pontos dos clientes
     *
     * @param purchaseValue
     * @return
     */
    public int getPoints(double purchaseValue);
}
