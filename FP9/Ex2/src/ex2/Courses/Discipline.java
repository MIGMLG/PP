/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Courses;

import containerofobjectsapi.ContainerOfObjects;
import ex2.Persons.Teacher;

/**
 *
 * @author NERD-X
 */
public class Discipline extends ContainerOfObjects{
    private int id;
    private String name;

    /**
     *
     * @param id
     * @param name
     */
    public Discipline(int id, String name) {
        super(5);
        this.id = id;
        this.name = name;
    }

    /**
     *
     * @param teacher
     * @return
     */
    public boolean addTeacher(Teacher teacher){
       return super.addObjects(teacher);
    }
    
}
