/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Courses;

import containerofobjectsapi.ContainerOfObjects;

/**
 * Classe de Gestão de Curso
 *
 * @author NERD-X
 */
public class CourseManagement extends ContainerOfObjects {

    /**
     * Metodo Constructor de CourseManagement
     *
     * @param maxSize
     */
    public CourseManagement(int maxSize) {
        super(maxSize);
    }

    /**
     * Metodo para adicionar Disciplinas
     *
     * @param discipline
     * @return
     */
    public boolean addDiscipline(Discipline discipline) {
        if (super.hasObject(discipline)) {
            return false;
        } else {
            return super.addObjects(discipline);
        }
    }

    /**
     * Metodo para remover disciplinas, retorna uma boolean
     *
     * @param discipline
     * @return
     */
    public boolean removeDiscipline(Discipline discipline) {
        int position = super.findObject(discipline);
        if (position != -1) {
            System.out.println("Removido: " + super.removeObjects(position));
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String printAll() {
        return super.printAll();
    }

    /**
     * Metodo para obter as disciplinas do utilizador
     *
     * @return
     */
    public Object[] getDisciplines() {
        return super.getObjects();
    }
}
