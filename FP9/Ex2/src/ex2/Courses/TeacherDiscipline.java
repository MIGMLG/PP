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
public class TeacherDiscipline{
    private Discipline discipline;
    private int hours;

    /**
     * Metodo Constructor da Disciplina de um professor
     * @param discipline
     * @param hours
     */
    public TeacherDiscipline(Discipline discipline, int hours) {
        this.discipline = discipline;
        this.hours = hours;
    }

    @Override
    public String toString() {
        String text = "\n" + "------------------------------------" + "\n"
                + "ID: " + discipline.getId() + "\n"
                + "Nome: " + discipline.getName() + "\n"
                + "Horas de aula: " + this.hours + "\n";
        text += "------------------------------------";
        return text;
    }

    /**
     * Metodo para obter as horas de trabalho
     * @return
     */
    public int getHours() {
        return hours;
    }

}
