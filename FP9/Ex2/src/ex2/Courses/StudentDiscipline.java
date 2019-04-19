/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Courses;

/**
 * Classe da definição de uma disciplina para o aluno
 * @author NERD-X
 */
public class StudentDiscipline extends Discipline{
    private int hours;

    /**
     * Metodo constructor de uma disciplina para o aluno
     * @param hours
     * @param id
     * @param name
     */
    public StudentDiscipline(int hours, int id, String name) {
        super(id, name);
        this.hours = hours;
    }

    /**
     * Metodo para obter as horas do aluno para a disciplina
     * @return
     */
    public int getHours() {
        return hours;
    }
    
    
    
}
