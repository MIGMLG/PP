/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Courses;

import ex2.Persons.Teacher;
import java.util.Objects;

/**
 * Classe da definição de uma disciplina para o professor
 * @author NERD-X
 */
public class TeacherDiscipline extends Discipline{

    /**
     *
     * @param id
     * @param name
     * @param hours
     */
    public TeacherDiscipline(int id, String name, int hours) {
        super(id, name);
        super.setHours(hours);
    }
    
}
