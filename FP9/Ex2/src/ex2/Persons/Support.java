/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Persons;

import ex2.Enums.AcademicStatus;
import static ex2.Enums.AcademicStatus.AcademicStatusToString;
import ex2.Enums.CientificArea;
import static ex2.Enums.CientificArea.CientificAreaToString;
import java.time.LocalDate;

/**
 * Definição do Objeto Suporte
 * @author NERD-X
 */
public class Support extends Person {
    private AcademicStatus status;
    private CientificArea area;
    private LocalDate dateBegin;
    private float contractPercentage;
    private LocalDate dateEnd;

    /**
     * Metodo Constructor de Support
     * @param id
     * @param name
     * @param nif
     * @param address
     * @param phone
     * @param status
     * @param area
     * @param dateBegin
     * @param contractPercentage
     */
    public Support(int id, String name, int nif, String address, int phone, AcademicStatus status, CientificArea area, LocalDate dateBegin, float contractPercentage) {
        super(id, name, nif, address, phone);
        this.status = status;
        this.area = area;
        this.dateBegin = dateBegin;
        this.contractPercentage = contractPercentage;
    }

    @Override
    float cacularHoras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString(){
        String text = super.toString() 
                + "Habilidades Académicas: " + AcademicStatusToString(status) + "\n"
                + "Área Acdémica: " + CientificAreaToString(area) + "\n"
                + "Data do Contrado: " + this.dateBegin + "\n"
                + "Percentagem do contrato: " + this.contractPercentage + "\n"
                + "------------------------------------";
        return text;
    }
    
}
