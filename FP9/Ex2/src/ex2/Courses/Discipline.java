/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Courses;

/**
 * Definição do Objeto de Disciplina
 *
 * @author NERD-X
 */
public class Discipline {

    private int id;
    private String name;
    private int hours;
    private int workLoad;

    /**
     * Metodo Constructor de Discipline
     *
     * @param id
     * @param name
     * @param workLoad
     */
    public Discipline(int id, String name, int workLoad) {
        this.id = id;
        this.name = name;
        this.workLoad = workLoad;
    }

    @Override
    public String toString() {
        String text = "\n" + "------------------------------------" + "\n"
                + "ID: " + this.id + "\n"
                + "Nome: " + this.name + "\n"
                + "Carga Horária: " + this.workLoad + "\n";
        if (hours != 0) {
            text += "Horas: " + this.hours + "\n";
        }
        text += "------------------------------------";
        return text;
    }

    /**
     * Metodo para obter o numero de horas que um professor tem obrigação de fazer
     * @return
     */
    public int getHours() {
        return hours;
    }

    /**
     * Metodo para obter o numero de horas semanais da disciplina
     * @return
     */
    public int getWorkLoad() {
        return workLoad;
    }

    /**
     * Metodo para definir o numero de horas que um professor tem obrigação de fazer
     * @param hours
     */
    public void setHours(int hours) {
        this.hours = hours;
    }

    /**
     * Metodo para obter o ID da disciplina
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo para obter o nome da disciplina
     * @return
     */
    public String getName() {
        return name;
    }
    
    

}
