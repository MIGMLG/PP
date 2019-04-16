/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Courses;

import containerofobjectsapi.ContainerOfObjects;

/**
 * Definição do Objeto Curso
 * @author NERD-X
 */
public class Course extends ContainerOfObjects {
    private int id;
    private String name;

    public Course(int id, String name) {
        super(36);
        this.id = id;
        this.name = name;
    }

    public boolean addDiscipline(Discipline discipline) {
        return super.addObjects(discipline);
    }
    
    public boolean removeDiscipline(Discipline discipline) {
        int position = super.findObject(discipline);
        System.out.println(super.removeObjects(position));
        return true;
    }

}
