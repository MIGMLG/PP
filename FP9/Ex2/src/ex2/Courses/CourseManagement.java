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
     */
    public boolean addDiscipline(Discipline discipline) {
        if (this.equals(discipline)) {
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
        
        if (super.getCounter() == 0) {
            return false;
        } else {
            Object[] tmp = this.getObjects();
            for(int i = 0; i < super.getCounter(); i++){
                Discipline tmpDiscipline = (Discipline) tmp[i];
                if (tmpDiscipline.getId() == discipline.getId()){
                    System.out.println("Removido: " + super.removeObjects(i));
                    return true;
                }
            }
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
     */
    public Object[] getDisciplines() {
        return super.getObjects();
    }

    /**
     *
     * @param obj
     * @return
     */
    public boolean equals(Discipline obj) {

        if (super.getCounter() == 0) {
            return false;
        } else {
            Object[] tmp = this.getObjects();
            for(int i = 0; i < super.getCounter(); i++){
                Discipline tmpDiscipline = (Discipline) tmp[i];
                if (tmpDiscipline.getId() == obj.getId()){
                    return true;
                }
            }
            return false;
        }
    }

}
