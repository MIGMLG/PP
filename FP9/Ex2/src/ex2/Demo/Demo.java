/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2.Demo;

import ex2.Courses.Course;
import ex2.Courses.Discipline;
import ex2.Enums.AcademicStatus;
import ex2.Enums.CientificArea;
import ex2.Enums.StudentType;
import ex2.Persons.PersonManagement;
import ex2.Persons.Student;
import ex2.Persons.Support;
import ex2.Persons.Teacher;
import java.time.LocalDate;

/**
 * Classe para testar o codigo implementado
 * @author NERD-X
 */
public class Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Testes: ");
        Course lei = new Course(1, "Licenciatura em Engenharia Informática");
        Discipline paradigmas = new Discipline(1, "Paradigmas de Programação");
        Teacher n1 = new Teacher(1, "Miguel Costa", 19458463, "DONT KNOW", 255999666, 
                AcademicStatus.MESTRADO, CientificArea.INFORMATICA, LocalDate.now());
        
        Support n2 = new Support(1, "Joaquim das Couves", 1548546, "DONT KNOW", 255644666, AcademicStatus.MESTRADO, CientificArea.INFORMATICA, LocalDate.now(), 100);
        
        Student n3 = new Student(1, "Miguel Costa", 544646546 , "DONT KNOW", 554646464, LocalDate.now(), StudentType.ESTUDANTENORMAL, lei);
        
        Teacher n4 = new Teacher(2, "Miguel Costa", 19458462, "DONT KNOW", 255929666, 
                AcademicStatus.MESTRADO, CientificArea.INFORMATICA, LocalDate.now());
        System.out.println(n3.addDiscipline(paradigmas));
        System.out.println(n3.addDiscipline(paradigmas)); // ja existe retorna false
        System.out.println(n3.setDisciplineWorkHours(paradigmas, 2));
        System.out.println(n3.removeDiscipline(paradigmas));
        System.out.println(n3.printDisciplines());
        System.out.println(n3.addDiscipline(paradigmas));
//        System.out.println(n2.calculateHours());
//        System.out.println(n3.calculateHours());
        
//        //Testes Professor
        
        System.out.println(n4.addDiscipline(paradigmas));
        System.out.println(n1.addDiscipline(paradigmas));
        System.out.println(n4.printDisciplines());
        System.out.println(n1.printDisciplines());
//        System.out.println(n1.calculateHours());
//        System.out.println(n4.calculateHours());
        
        
        System.out.println("FOR REAL: ");
        PersonManagement gestao = new PersonManagement();
        System.out.println(gestao.addPerson(n1));
        System.out.println(gestao.addPerson(n1)); //Ja existe no sistema
        System.out.println(gestao.addPerson(n2));
        System.out.println(gestao.PrintAll());
        System.out.println("\n" + "Removido: " + gestao.removePerson(n2) + "Final do Removido");
        System.out.println(gestao.PrintAll());
        
    }
    
}
