/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Courses;

/**
 * Definição do Objeto Curso
 *
 * @author NERD-X
 */
public class Course {

    private int id;
    private String name;

    /**
     * Metodo Constructor do Course
     *
     * @param id
     * @param name
     */
    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        String text = "\n" + "------------------------------------" + "\n"
                + "ID: " + this.id + "\n"
                + "Nome: " + this.name + "\n"
                + "------------------------------------";
        return text;
    }

}
