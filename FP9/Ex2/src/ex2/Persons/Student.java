/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Persons;

import ex2.Courses.Course;
import ex2.Courses.CourseManagement;
import ex2.Courses.StudentDiscipline;
import ex2.Enums.StudentType;
import java.time.LocalDate;

/**
 * Defnição do Objeto Aluno
 * @author NERD-X
 */
public class Student extends Person{
    private final int MAX_DISCIPLINES = 10;
    private LocalDate dateM; //Data da primeira matricula
    private StudentType type;
    private Course course;
    private CourseManagement manage = new CourseManagement(MAX_DISCIPLINES);
    
    /**
     * Metodo Constructor de Student
     * @param id
     * @param name
     * @param nif
     * @param address
     * @param phone
     * @param date
     * @param type
     * @param course
     */
    public Student(int id, String name, int nif, String address, int phone, LocalDate date, StudentType type, Course course) {
        super(id, name, nif, address, phone);
        this.dateM = date;
        this.type = type;
        this.course = course;
    }

    /**
     * Metodo para calcular a carga semanal de um aluno
     * @return
     */
    @Override
    public float calculateHours() {
        Object[] tmp = manage.getDisciplines();
        float hours = 0;
        for(Object out : tmp){
            StudentDiscipline disc = (StudentDiscipline) out;
            hours+= disc.getHours();
        }
        return hours;
    }
    
    @Override
    public String toString(){
        String text = super.toString() 
                + "Data do Primeira Matricula: " + this.dateM + "\n"
                + "------------------------------------";
        return text;
    }
    
    /**
     * Metodo para adicionar disciplinas, retorna boolean
     * @param discipline
     * @return
     */
    public boolean addDiscipline(StudentDiscipline discipline){
        return manage.addDiscipline(discipline);
    }
    
    /**
     * Metodo para remover disciplinas, retorna boolean
     * @param discipline
     * @return
     */
    public boolean removeDiscipline(StudentDiscipline discipline){
        return manage.removeDiscipline(discipline);
    }
    
    /**
     * Metodo para imprimir as disciplinas, retorna String
     * @return
     */
    public String printDisciplines(){
        return manage.printAll();
    }
}
