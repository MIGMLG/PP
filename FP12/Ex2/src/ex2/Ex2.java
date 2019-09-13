/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import PhoneManagement.AverageMinutesPerArea;
import PhoneManagement.AverageMinutesPerNumber;
import PhoneManagement.PhoneHistoryManagement;
import java.util.List;


/**
 * Classe para testes
 * @author NERD-X
 */
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        PhoneHistoryManagement mng = new PhoneHistoryManagement();
        System.out.println("Teste Read: " + mng.readFile("CallsData.csv"));
        
        List<AverageMinutesPerNumber> avgList = mng.calculateAverageMinutesPerNumber();
        
        AverageMinutesPerArea avgPerArea = mng.calculateAverageMinutesPerArea("415", "avgPerArea.csv");
    }
    

}
