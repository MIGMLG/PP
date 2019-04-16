/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Persons;

import ex2.Enums.StudentType;
import java.time.LocalDate;

/**
 * Deifnição do Objeto Aluno
 * @author NERD-X
 */
public class Student extends Person{
    private LocalDate dateM; //Data da primeira matricula
    private StudentType type;
    
    /**
     * Metodo Constructor de Student
     * @param id
     * @param name
     * @param nif
     * @param address
     * @param phone
     * @param date
     * @param type
     */
    public Student(int id, String name, int nif, String address, int phone, LocalDate date, StudentType type) {
        super(id, name, nif, address, phone);
        this.dateM = date;
        this.type = type;
    }

    @Override
    float cacularHoras() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        String text = super.toString() 
                + "Data do Primeira Matricula: " + this.dateM + "\n"
                + "------------------------------------";
        return text;
    }
}
