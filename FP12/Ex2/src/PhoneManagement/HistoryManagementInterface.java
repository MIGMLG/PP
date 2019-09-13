/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneManagement;

import java.util.List;

/**
 * Interface que define os calculos pedidos
 * @author NERD-X
 */
public interface HistoryManagementInterface {
    
    /**
     * Metodo para calcular a média de minutos por número
     * @return
     */
    public List<AverageMinutesPerNumber> calculateAverageMinutesPerNumber();
    
    /**
     * Metodo para calcular a média de minutos por área
     * @param areaCode
     * @param outputFileName
     * @return
     */
    public AverageMinutesPerArea calculateAverageMinutesPerArea(String areaCode, String outputFileName);
    
}
