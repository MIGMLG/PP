/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Courses;

import ex2.Persons.Teacher;

/**
 * Classe da definição de uma disciplina para o professor
 * @author NERD-X
 */
public class TeacherDiscipline extends Discipline {

    private Teacher teacher;
    private int hours;

    /**
     * Metodo Constructor da Disciplina de um professor
     * @param teacher
     * @param hours
     * @param id
     * @param name
     */
    public TeacherDiscipline(Teacher teacher, int hours, int id, String name) {
        super(id, name);
        this.teacher = teacher;
        this.hours = hours;
    }

    @Override
    public String toString() {
        String text = "\n" + "------------------------------------" + "\n"
                + "ID: " + super.getId() + "\n"
                + "Nome: " + super.getName() + "\n"
                + teacher.toString() + "\n"
                + "Horas de aula: " + this.hours + "\n";
        text += "------------------------------------";
        return text;
    }

    /**
     * Metodo para obter o Professor
     * @return
     */
    public Teacher getTeacher() {
        return teacher;
    }

    /**
     * Metodo para obter as horas de trabalho
     * @return
     */
    public int getHours() {
        return hours;
    }

}
