/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Courses;

import java.util.Objects;

/**
 * Definição do Objeto de Disciplina
 *
 * @author NERD-X
 */
public class Discipline {

    private int id;
    private String name;
    private int hours = 0;

    /**
     * Metodo Constructor de Discipline
     *
     * @param id
     * @param name
     */
    public Discipline(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        String text = "\n" + "------------------------------------" + "\n"
                + "ID: " + this.id + "\n"
                + "Nome: " + this.name + "\n"
                + "Horas: " + this.hours + "\n";
        text += "------------------------------------";
        return text;
    }

    /**
     * Metodo para obter o ID da disciplina
     * return id
     */
    public int getId() {
        return id;
    }

    /**
     * Metodo para obter o nome da disciplina
     * return name
     */
    public String getName() {
        return name;
    }

    /**
     * Metodo que retorna hours
     * return hours
     */
    public int getHours() {
        return hours;
    }

    /**
     * Metodo para definir hours
     * @param hours
     */
    public void setHours(int hours) {
        this.hours = hours;
    }
    
}
