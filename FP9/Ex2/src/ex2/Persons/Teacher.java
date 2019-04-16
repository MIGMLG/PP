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
 * Definição do Objecto Professor
 * @author NERD-X
 */
public class Teacher extends Person{
    private AcademicStatus status;
    private CientificArea area;
    private LocalDate dateBegin;
    private LocalDate dateEnd;

    /**
     * Metodo Constructor de Teacher
     * @param id
     * @param name
     * @param nif
     * @param address
     * @param phone
     * @param status
     * @param area
     * @param dateBegin
     */
    public Teacher(int id, String name, int nif, String address, int phone, AcademicStatus status, CientificArea area, LocalDate dateBegin) {
        super(id, name, nif, address, phone);
        this.status = status;
        this.area = area;
        this.dateBegin = dateBegin;
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
                + "------------------------------------";
        return text;
    }
    
}
