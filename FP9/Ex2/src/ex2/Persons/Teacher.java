/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Persons;

import ex2.Courses.CourseManagement;
import ex2.Courses.Discipline;
import ex2.Courses.TeacherDiscipline;
import ex2.Enums.AcademicStatus;
import static ex2.Enums.AcademicStatus.AcademicStatusToString;
import ex2.Enums.CientificArea;
import static ex2.Enums.CientificArea.CientificAreaToString;
import java.time.LocalDate;

/**
 * Definição do Objecto Professor
 *
 * @author NERD-X
 */
public class Teacher extends Person {
    private final int MAX_DISCIPLINES = 5;
    private AcademicStatus status;
    private CientificArea area;
    private LocalDate dateBegin;
    private LocalDate dateEnd;
    private CourseManagement manage = new CourseManagement(MAX_DISCIPLINES);

    /**
     * Metodo Constructor de Teacher
     *
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

    /**
     * Metodo para calcular as horas de trabalho do Professor
     * @return
     */
    @Override
    public float calculateHours() {
        Object[] tmp = manage.getDisciplines();
        float hours = 0;
        for(Object out : tmp){
            TeacherDiscipline disc = (TeacherDiscipline) out;
            hours+= disc.getHours();
        }
        return hours;
    }

    @Override
    public String toString() {
        String text = super.toString()
                + "Habilidades Académicas: " + AcademicStatusToString(status) + "\n"
                + "Área Acdémica: " + CientificAreaToString(area) + "\n"
                + "Data do Contrado: " + this.dateBegin + "\n"
                + "------------------------------------";
        return text;
    }

    /**
     * Metodo para adicionar disciplinas, retorna boolean
     *
     * @param discipline
     * @param hours
     * @return
     */
    public boolean addDiscipline(Discipline discipline, int hours) {
        TeacherDiscipline myDiscipline = new TeacherDiscipline(this, hours, discipline.getId(), discipline.getName());
        return manage.addDiscipline(myDiscipline);
    }

    /**
     * Metodo para remover disciplinas, retorna boolean
     *
     * @param discipline
     * @return
     */
    public boolean removeDiscipline(Discipline discipline) {
        return manage.removeDiscipline(discipline);
    }

    /**
     * Metodo para imprimir as disciplinas, retorna String
     *
     * @return
     */
    public String printDisciplines() {
        return manage.printAll();
    }

}
