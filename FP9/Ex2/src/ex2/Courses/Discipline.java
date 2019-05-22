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
                + "Nome: " + this.name + "\n";
        text += "------------------------------------";
        return text;
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

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Discipline other = (Discipline) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        return true;
    }
    
    
    
    
}
